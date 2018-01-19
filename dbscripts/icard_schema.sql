
-- ----------------------------
-- 柜员系统ID生成器数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_sequence_key`;
CREATE TABLE `icard_sequence_key` (
  `id` BIGINT NOT NULL,
  `key` VARCHAR(50) NOT NULL,
  `start_with` BIGINT DEFAULT '1',
  `inc_span` BIGINT DEFAULT '1',
  `scope` VARCHAR(50),
  `description` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_sequence_key_key` (`key`, `scope`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 园区数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_institution`;
CREATE TABLE `icard_institution` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(20) NOT NULL COMMENT '机构编码',
  `name` VARCHAR(50) NOT NULL COMMENT '机构名称',
  `account_id` BIGINT NOT NULL COMMENT '用户账号',
  `merchant_id` BIGINT NOT NULL COMMENT '商户ID',
  `cash_box` BIGINT NOT NULL COMMENT '现金柜-财务专用',
  `version` INTEGER UNSIGNED NOT NULL COMMENT '数据版本号',
  `description` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 卡片库存表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_card_repository`;
CREATE TABLE `icard_card_repository` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `device_id` VARCHAR(40) COMMENT '卡片硬件标识',
  `card_no` VARCHAR(20) NOT NULL COMMENT '卡号',
  `type_code` INTEGER NOT NULL COMMENT '卡片类型码',
  `verify_code` CHAR(3) COMMENT '验证码',
  `maker_version` TINYINT UNSIGNED COMMENT '制卡程序版本号',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '卡片状态-激活 在用',
  `employee_id` BIGINT(20) DEFAULT NULL COMMENT '入库人',
  `employee_name` VARCHAR(20) COMMENT '员工名称-保留字段',
  `owner_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码-卡片内读出',
  `inst_code` VARCHAR(20) COMMENT '发行机构编码',
  `inst_name` VARCHAR(40) COMMENT '发行机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_card_repository_cardNo` (`card_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 卡片表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_user_card`;
CREATE TABLE `icard_user_card` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `card_id` BIGINT NOT NULL COMMENT '卡片ID-具有生成规则',
  `device_id` VARCHAR(40) NOT NULL COMMENT '卡片硬件标识',
  `card_no` VARCHAR(20) NOT NULL COMMENT '卡号',
  `category` TINYINT UNSIGNED NOT NULL COMMENT '卡类别-园区卡 银行卡',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '卡类型-主/副/临时',
  `type_code` INTEGER NOT NULL COMMENT '卡片类型码',
  `account_id` BIGINT NOT NULL COMMENT '用户账号',
  `verify_code` CHAR(3) NOT NULL COMMENT '验证码',
  `cash_pledge` INTEGER UNSIGNED COMMENT '卡片押金-分',
  `relieve_lock_time` DATETIME COMMENT '解锁时间',
  `relieve_loss_time` DATETIME COMMENT '解挂时间',
  `sequence` SMALLINT UNSIGNED COMMENT '序列号-换卡时使用',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '卡片状态',
  `version` INTEGER UNSIGNED NOT NULL COMMENT '应用程序版本号',
  `employee_id` BIGINT NOT NULL COMMENT '操作人员',
  `employee_name` VARCHAR(20) COMMENT '员工名称-保留字段',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '发行机构编码',
  `inst_name` VARCHAR(40) COMMENT '发行机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_card_cardId` (`card_id`) USING BTREE,
  KEY `idx_user_card_cardNo` (`card_no`) USING BTREE,
  KEY `idx_user_card_accountId` (`account_id`) USING BTREE,
  KEY `idx_user_card_parentAccountId` (`parent_account_id`) USING BTREE,
  KEY `idx_user_card_status_lockTime` (`status`, `relieve_lock_time`) USING BTREE,
  KEY `idx_user_card_status_lossTime` (`status`, `relieve_loss_time`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 卡账号表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_user_account`;
CREATE TABLE `icard_user_account` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `account_id` BIGINT NOT NULL COMMENT '账号ID-具有生成规则',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '账号类型',
  `fund_account_id` BIGINT NOT NULL COMMENT '资金账号',
  `name` VARCHAR(20) NOT NULL COMMENT '用户名',
  `gender` TINYINT UNSIGNED COMMENT '性别',
  `mobile` VARCHAR(20) NOT NULL COMMENT '手机号',
  `telphone` VARCHAR(20) COMMENT '固定电话',
  `id_code` VARCHAR(20) NOT NULL COMMENT '身份证号码',
  `address` VARCHAR(250) COMMENT '联系地址',
  `login_pwd` VARCHAR(50) COMMENT '登陆密码',
  `trade_pwd` VARCHAR(50) COMMENT '交易密码',
  `pwd_changed` TINYINT UNSIGNED COMMENT '强制修改密码',
  `login_time` DATETIME COMMENT '最近登陆时间',
  `secret_key` VARCHAR(80) COMMENT '安全密钥',
  `customer_id` BIGINT COMMENT '客户ID-来自CRM系统',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '账户状态',
  `version` INTEGER UNSIGNED NOT NULL COMMENT '数据版本号-防止重复提交',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '园区组织机构编码',
  `inst_name` VARCHAR(40) COMMENT '机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_account_accountId` (`account_id`) USING BTREE
  KEY `idx_user_account_fundAccountId` (`fund_account_id`) USING BTREE,
  KEY `idx_user_account_name` (`name`) USING BTREE,
  KEY `idx_user_account_mobile` (`mobile`) USING BTREE,
  KEY `idx_user_account_idCode` (`id_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 卡权限表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_card_permission`;
CREATE TABLE `icard_card_permission` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `account_id` BIGINT NOT NULL COMMENT '用户账号ID',
  `draw_limits_times` BIGINT NOT NULL COMMENT '每笔提现限额-分',
  `draw_limits_days` BIGINT NOT NULL COMMENT '每日提现限额-分',
  `pay_limits_times` BIGINT NOT NULL COMMENT '每笔付款限额-分',
  `pay_limits_days` BIGINT NOT NULL COMMENT '每日付款限额-分',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_card_permission_accountId` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 类型权限表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_type_permission`;
CREATE TABLE `icard_type_permission` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `type` TINYINT UNSIGNED NOT NULL COMMENT '卡类型',
  `draw_limits_times` BIGINT NOT NULL COMMENT '每笔提现限额-分',
  `max_draw_limits_times` BIGINT NOT NULL COMMENT '最高每笔提现限额-分',
  `draw_limits_days` BIGINT NOT NULL COMMENT '每日提现限额-分',
  `max_draw_limits_days` BIGINT NOT NULL COMMENT '最高每日提现限额-分',
  `pay_limits_times` BIGINT NOT NULL COMMENT '每笔付款限额-分',
  `max_pay_limits_times` BIGINT NOT NULL COMMENT '最高每笔付款限额-分',
  `pay_limits_days` BIGINT NOT NULL COMMENT '每日付款限额-分',
  `max_pay_limits_days` BIGINT NOT NULL COMMENT '最高每日付款限额-分',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_type_permission_type` (`type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 园区卡绑定银行卡数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_bank_card`;
CREATE TABLE `icard_bank_card` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `account_type` TINYINT UNSIGNED NOT NULL COMMENT '账户类型-个人账户 对公账户',
  `account_id` BIGINT NOT NULL COMMENT '用户账号',
  `fund_account_id` BIGINT NOT NULL COMMENT '资金账号ID',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '银行类型-工商银行',
  `account` VARCHAR(20) NOT NULL COMMENT '银行卡号/对公账号',
  `name` VARCHAR(40) NOT NULL COMMENT '姓名',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '绑定状态',
  `employee_id` BIGINT COMMENT '员工ID',
  `employee_name` VARCHAR(20) COMMENT '员工名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_bank_card_accountId` (`account_id`, `account_type`) USING BTREE,
  KEY `idx_bank_card_fundAccountId` (`fund_account_id`, `account_type`) USING BTREE,
  KEY `idx_bank_card_bankNo` (`account`, `type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 用户操作记录表数据模型
-- ----------------------------
DROP TABLE IF EXISTS `icard_user_transaction`;
CREATE TABLE `icard_user_transaction` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `transaction_id` BIGINT NOT NULL COMMENT '操作事务ID',
  `serial_no` VARCHAR(30) NOT NULL COMMENT '操作流水号',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '操作类型-充值 取款 冲正',
  `sub_type` TINYINT UNSIGNED NOT NULL COMMENT '操作子类型-POS充值 现金充值',
  `cycle_no` BIGINT NOT NULL COMMENT '账务周期流水号',
  `account_id` BIGINT NOT NULL COMMENT '用户账号',
  `card_id` BIGINT NOT NULL COMMENT '卡片ID',
  `card_no` VARCHAR(20) COMMENT '卡号-保留字段',
  `new_card_id` BIGINT COMMENT '新卡片ID-换卡使用',
  `new_card_no` VARCHAR(20) COMMENT '新卡卡号-换卡使用',
  `is_returned` TINYINT UNSIGNED COMMENT '是否退还卡片',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '操作状态',
  `employee_id` BIGINT NOT NULL COMMENT '操作人员',
  `employee_name` BIGINT COMMENT '操作人员名称-保留字段',
  `ustation_id` BIGINT NOT NULL COMMENT '用户工位',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_transaction_transactionId` (`transaction_id`) USING BTREE,
  UNIQUE KEY `uk_user_transaction_serialNo` (`serial_no`) USING BTREE,
  KEY `idx_user_transaction_accountId` (`account_id`, `type`) USING BTREE,
  KEY `idx_user_transaction_cycleNo` (`cycle_no`) USING BTREE,
  KEY `idx_user_transaction_cardId` (`card_id`) USING BTREE,
  KEY `idx_user_transaction_cardNo` (`card_no`) USING BTREE,
  KEY `idx_user_transaction_ustationId` (`employee_id`, `ustation_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 资金事务数据模型设计
--
-- 只在柜员进行资金业务时产生数据
-- ----------------------------
DROP TABLE IF EXISTS `icard_fund_transaction`;
CREATE TABLE `icard_fund_transaction` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `transaction_id` BIGINT NOT NULL COMMENT '操作事务ID',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '业务类型-POS充值 现金充值 冲正',
  `ext_serial_no` VARCHAR(40) COMMENT '外部流水号',
  `target_no` VARCHAR(40) COMMENT '冲正流水号',
  `balance` BIGINT COMMENT '期末余额',
  `frozen_amount` BIGINT COMMENT '期末冻结金额',
  `channel` BIGINT NOT NULL COMMENT '资金渠道-现金 账户余额 工商银行等',
  `max_amount` BIGINT NOT NULL COMMENT '操作金额-分(冲正使用)',
  `amount` BIGINT NOT NULL COMMENT '操作金额-分',
  `fee_amount` BIGINT NOT NULL COMMENT '费用总金额-分',
  `status` TINYINT UNSIGNED COMMENT '操作状态',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_fund_transaction_transactionId` (`transaction_id`) USING BTREE,
  KEY `idx_fund_transaction_serialNo` (`ext_serial_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 事务费用数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_transaction_fee`;
CREATE TABLE `icard_transaction_fee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `transaction_id` BIGINT NOT NULL COMMENT '操作事务ID',
  `channel` TINYINT UNSIGNED NOT NULL COMMENT '渠道类型-现金 账户余额 工商银行等',
  `amount` BIGINT NOT NULL COMMENT '金额-分(正值)',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '费用类型-手续费等',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_transaction_fee_transactionId` (`transaction_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 业务费用数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_fee_setting`;
CREATE TABLE `icard_fee_setting` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(80) NOT NULL COMMENT '费用名称',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '开卡费用 挂失费用等',
  `sub_type` TINYINT UNSIGNED COMMENT '卡片类型-可为空',
  `fee_type` TINYINT UNSIGNED NOT NULL COMMENT '费用类型-押金/工本费/手续费',
  `amount` BIGINT NOT NULL COMMENT '费用金额-分',
  `is_editable` TINYINT UNSIGNED NOT NULL COMMENT '是否可编辑',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_fee_setting_feeType` (`type`, `sub_type`, `fee_type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 网点数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_work_station`;
CREATE TABLE `icard_work_station` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL COMMENT '网点名称',
  `code` VARCHAR(20) NOT NULL COMMENT '网点编码',
  `warn_amount` BIGINT COMMENT '资金预警金额-分',
  `station_count` TINYINT UNSIGNED NOT NULL COMMENT '工位数量',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT = 1001;

-- ----------------------------
-- 用户工位数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_user_station`;
CREATE TABLE `icard_user_station` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `wstation_id` BIGINT NOT NULL COMMENT '网点ID',
  `code` VARCHAR(20) NOT NULL COMMENT '工位编码',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '工位类型-总收银 柜员',
  `cycle_no` BIGINT NOT NULL COMMENT '账务周期流水号',
  `cash_box` BIGINT NOT NULL COMMENT '工位现金柜',
  `employee_id` BIGINT COMMENT '员工ID',
  `employee_name` VARCHAR(20) COMMENT '员工名称-保留字段',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '工位状态',
  `version` INTEGER UNSIGNED NOT NULL COMMENT '数据版本号-现金柜使用',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_work_station_wstationId` (`wstation_id`) USING BTREE,
  UNIQUE KEY `idx_work_station_employeeId` (`employee_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT = 100001;

-- ----------------------------
-- 用户对账周期数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_account_cycle`;
CREATE TABLE `icard_account_cycle` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `ustation_id` BIGINT NOT NULL COMMENT '用户工位',
  `employee_id` BIGINT COMMENT '员工ID',
  `employee_name` VARCHAR(20) COMMENT '员工名称-保留字段',
  `cycle_no` BIGINT NOT NULL COMMENT '账务周期流水号',
  `start_time` DATETIME COMMENT '账务开始时间',
  `end_time` DATETIME COMMENT '账务结束时间',
  `check_time` DATETIME COMMENT '平账时间',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '账务状态',
  `cash_amount` BIGINT NOT NULL COMMENT '交付现金金额-分',
  `auditor_id` BIGINT COMMENT '审核员-员工ID',
  `auditor_name` VARCHAR(20) COMMENT '审核员名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_account_cycle_stationId` (`ustation_id`, `employee_id`) USING BTREE,
  UNIQUE KEY `uk_account_cycle_cycleNo` (`cycle_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 用户对账周期明细数据模型设计
--
-- 平帐之后用户历史对账周期才产生明细数据
-- ----------------------------
DROP TABLE IF EXISTS `icard_account_cycle_detail`;
CREATE TABLE `icard_account_cycle_detail` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `cycle_no` BIGINT NOT NULL COMMENT '账务周期流水号',
  `receive_times` INTEGER NOT NULL COMMENT '领款次数',
  `receive_amount` BIGINT NOT NULL COMMENT '领款金额-分',
  `deliver_times` INTEGER NOT NULL COMMENT '交款次数',
  `deliver_amount` BIGINT NOT NULL COMMENT '交款金额-分',
  `depo_cash_times` INTEGER NOT NULL COMMENT '现金充值次数',
  `depo_cash_amount` BIGINT NOT NULL COMMENT '现金充值金额-分',
  `depo_pos_times` INTEGER NOT NULL COMMENT 'POS充值次数',
  `depo_pos_amount` BIGINT NOT NULL COMMENT 'POS充值金额-分',
  `draw_cash_times` INTEGER NOT NULL COMMENT '提现次数',
  `draw_cash_amount` BIGINT NOT NULL COMMENT '提现金额-分',
  `draw_bank_times` INTEGER NOT NULL COMMENT '转账次数',
  `draw_bank_amount` BIGINT NOT NULL COMMENT '转账金额-分',
  `revenue_amount` BIGINT NOT NULL COMMENT '现金收益金额-分',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_cycle_detail_cycleNo` (`cycle_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 财务柜台-网点交款领款数据模型设计
--
-- 总收银可以通过财务柜台发起缴款领款操作
-- 柜员只能在结账平帐时自动产生缴款记录
-- ----------------------------
DROP TABLE IF EXISTS `icard_finance_counter`;
CREATE TABLE `icard_finance_counter` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `counter_id` BIGINT NOT NULL COMMENT '财务柜台ID',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '财务类型-领款 交款',
  `amount` BIGINT NOT NULL COMMENT '总金额-分',
  `wstation_id` BIGINT NOT NULL COMMENT '网点ID',
  `employee_id` BIGINT NOT NULL COMMENT '操作人员',
  `employee_name` VARCHAR(20) COMMENT '操作人员名称-保留字段',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '财务状态',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_finance_counter_counterId` (`counter_id`) USING BTREE,
  KEY `idx_finance_counter_employeeId` (`employee_id`, `action`) USING BTREE,
  KEY `idx_finance_counter_wstationId` (`wstation_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 柜员交款领款数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_user_cash`;
CREATE TABLE `icard_user_cash` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `counter_id` BIGINT NOT NULL COMMENT '财务柜台ID',
  `ustation_id` BIGINT NOT NULL COMMENT '用户工位',
  `employee_id` BIGINT NOT NULL COMMENT '领款或收款人',
  `employee_name` VARCHAR(20) COMMENT '操作人员名称-保留字段',
  `cycle_no` BIGINT NOT NULL COMMENT '账务周期流水号',
  `amount` BIGINT NOT NULL COMMENT '操作金额-分',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '状态',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_cash_counterId` (`counter_id`) USING BTREE,
  KEY `idx_user_cash_employeeId` (`employee_id`) USING BTREE,
  KEY `idx_user_cash_ustationId` (`ustation_id`) USING BTREE,
  KEY `idx_user_cash_cycleNo` (`cycle_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 银行存取款数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_bank_counter`;
CREATE TABLE `icard_bank_counter` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `serial_no` VARCHAR(40) NOT NULL COMMENT '银行操作流水号',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '财务类型-存款 取款',
  `amount` BIGINT NOT NULL COMMENT '操作金额-分',
  `apply_time` DATETIME NOT NULL COMMENT '实际操作时间',
  `employee_id` BIGINT NOT NULL COMMENT '操作人员ID',
  `employee_name` VARCHAR(20) COMMENT '操作人员名称-保留字段',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '状态-新建 封存',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_bank_counter_employeeId` (`employee_id`, `action`) USING BTREE,
  KEY `idx_bank_counter_serialNo` (`serial_no`) USING BTREE,
  KEY `idx_bank_counter_applyTime` (`apply_time`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 资金业务冲正模块数据模型设计
--
-- 冲正在操作记录表中添加记录，结账之后不允许冲正
-- ----------------------------
DROP TABLE IF EXISTS `icard_correct_transaction`;
CREATE TABLE `icard_correct_transaction` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `type` TINYINT UNSIGNED NOT NULL COMMENT '类型-充值冲正 提现冲正',
  `transaction_id` BIGINT NOT NULL COMMENT '操作记录ID',
  `serial_no` VARCHAR(40) NOT NULL COMMENT '操作流水号',
  `cycle_no` BIGINT NOT NULL COMMENT '对账周期',
  `account_id` BIGINT NOT NULL COMMENT '用户账号',
  `amount` BIGINT NOT NULL COMMENT '操作金额-分',
  `ext_serial_no` VARCHAR(40) COMMENT '外部流水号',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '状态',
  `employee_id` BIGINT NOT NULL COMMENT '操作人员ID',
  `employee_name` VARCHAR(20) COMMENT '操作人员名称-保留字段',
  `description` VARCHAR(250) DEFAULT NULL COMMENT '备注',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '所属机构编码',
  `inst_name` VARCHAR(40) COMMENT '所属机构名称-保留字段',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_correct_transaction_employeeId` (`employee_id`) USING BTREE,
  KEY `idx_correct_transaction_accountId` (`account_id`) USING BTREE,
  KEY `idx_correct_transaction_cycleNo` (`cycle_no`) USING BTREE,
  KEY `idx_correct_transaction_serialNo` (`serial_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 柜员权限数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_level_permission`;
CREATE TABLE `icard_level_permission` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `level` TINYINT UNSIGNED NOT NULL COMMENT '员工级别',
  `depo_cash_amount` BIGINT NOT NULL COMMENT '最大现金充值金额',
  `draw_cash_amount` BIGINT NOT NULL COMMENT '最大提现金额',
  `draw_bank_amount` BIGINT NOT NULL COMMENT '最大转账提款金额',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_level_permission_level` (`level`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 系统用户数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_employee`;
CREATE TABLE `icard_employee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `account` VARCHAR(20) NOT NULL COMMENT '登陆账号',
  `name` VARCHAR(20) NOT NULL COMMENT '姓名',
  `gender` TINYINT UNSIGNED COMMENT '性别',
  `mobile` VARCHAR(20) COMMENT '手机号',
  `telphone` VARCHAR(20) COMMENT '固定电话',
  `email` VARCHAR(80) COMMENT '邮箱地址',
  `password` VARCHAR(50) NOT NULL COMMENT '登陆密码',
  `pwd_change` TINYINT UNSIGNED COMMENT '是否修改登陆密码',
  `login_time` DATETIME COMMENT '最近登陆时间',
  `type` TINYINT UNSIGNED NOT NULL COMMENT '用户类型',
  `level` TINYINT UNSIGNED COMMENT '用户级别',
  `login_token` VARCHAR(40) NULL COMMENT '登陆TokenID',
  `status` TINYINT UNSIGNED NOT NULL COMMENT '状态',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '园区组织机构编码',
  `inst_name` VARCHAR(50) COMMENT '机构名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_icard_employee_account` (`account`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 用户-角色数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_employee_role`;
CREATE TABLE `icard_employee_role` (
  `employee_id` BIGINT NOT NULL COMMENT '员工ID',
  `role_id` BIGINT NOT NULL COMMENT '角色ID',
  `created_time` DATETIME COMMENT '创建时间',
  KEY `idx_employee_role_employeeId` (`employee_id`) USING BTREE,
  KEY `idx_employee_role_roleId` (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 用户角色数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_role`;
CREATE TABLE `icard_role` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` VARCHAR(20) NOT NULL COMMENT '角色名称',
  `inst_code` VARCHAR(20) NOT NULL COMMENT '园区组织机构编码',
  `inst_name` VARCHAR(50) COMMENT '机构名称-保留字段',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  `modified_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 角色-资源数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_role_resource`;
CREATE TABLE `icard_role_resource` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `role_id` BIGINT NOT NULL COMMENT '自增主键',
  `code` VARCHAR(20) NOT NULL COMMENT '资源编码',
  `created_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_role_resource_roleId` (`role_id`) USING BTREE,
  KEY `idx_role_resource_code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 页面资源数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_page_resource`;
CREATE TABLE `icard_page_resource` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `code` VARCHAR(20) NOT NULL COMMENT '资源编码, 20-10',
  `name` VARCHAR(20) NOT NULL COMMENT '资源名称',
  `url` VARCHAR(80) COMMENT '请求路径',
  `level` TINYINT UNSIGNED NOT NULL COMMENT '级别',
  `parent_code` VARCHAR(20) COMMENT '上级资源编码',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_page_resource_code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 页面元素数据模型设计
-- ----------------------------
DROP TABLE IF EXISTS `icard_element_resource`;
CREATE TABLE `icard_element_resource` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `code` VARCHAR(20) NOT NULL COMMENT '资源编码, 10-12',
  `name` VARCHAR(20) NOT NULL COMMENT '资源名称',
  `page_code` BIGINT COMMENT '所属页面编码',
  `description` VARCHAR(250) COMMENT '备注',
  `created_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_element_resource_code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;