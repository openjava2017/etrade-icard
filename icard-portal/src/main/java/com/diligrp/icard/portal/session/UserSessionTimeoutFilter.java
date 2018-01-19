package com.diligrp.icard.portal.session;

import com.diligrp.icard.portal.util.AjaxHttpUtils;
import com.diligrp.icard.portal.util.WebConstants;
import com.diligrp.icard.shared.domain.Message;
import com.diligrp.icard.shared.domain.builder.MessageBuilder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Session超时过滤器实现
 *
 * @author: brenthuang
 * @date: 2018/01/04
 */
public class UserSessionTimeoutFilter implements Filter {

    private String redirectUrl = "/";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Expired user session
        HttpSession session = httpRequest.getSession(false);
        if (session == null || session.getAttribute(WebConstants.SESSION_KEY_OPERATOR) == null) {
            httpResponse.setHeader(WebConstants.HTTP_SESSION_STATUS, WebConstants.HTTP_SESSION_EXPIRED);
            if (!AjaxHttpUtils.isAjaxRequest(httpRequest)) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + redirectUrl);
            } else {
                Message message = new MessageBuilder().failure("session_expired").build();
                AjaxHttpUtils.sendResponse(httpResponse, message);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
