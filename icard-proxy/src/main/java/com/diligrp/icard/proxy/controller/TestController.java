package com.diligrp.icard.proxy.controller;

import com.diligrp.icard.core.sequence.ISerialKeyGenerator;
import com.diligrp.icard.core.sequence.KeyGeneratorManager;
import com.diligrp.icard.shared.domain.Message;
import com.diligrp.icard.shared.domain.builder.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 测试控制器
 *
 * @author: brenthuang
 * @date: 2018/01/04
 */
@Controller
public class TestController {
    @Resource
    private KeyGeneratorManager keyGeneratorManager;

    @RequestMapping(value = "/test.do")
    public @ResponseBody Message test() {
        ISerialKeyGenerator keyGenerator = keyGeneratorManager.getSerialKeyGenerator();
        return new MessageBuilder().success(keyGenerator.nextSerialNo("12", "8888")).build();
    }
}
