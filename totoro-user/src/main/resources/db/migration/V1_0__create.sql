-- ***********************************************************
-- SQL书写标准
-- SQL关键字全部大写
-- 所有字段加上反引号 "`", mybatis的mapper里边的字段也需要加上反引号
-- 所有字段加上"COMMENT"说明, 可枚举的需要详细说明取值范围
-- 所有表必需创建 `created_at` 和 `updated_at` 字段
-- 创建表之前需要写明书写日期以及表作用描述, 日期格式 yyyy-MM--dd
-- ***********************************************************

-- totoro 用户表
-- 2017-04-22 初次创建
CREATE TABLE IF NOT EXISTS `totoro_users` (
  `id`              BIGINT        NOT NULL  AUTO_INCREMENT  COMMENT '自增主键',
  `nickname`        VARCHAR(20)   NOT NULL                  COMMENT '用户名',
  `display_name`    VARCHAR(32)       NULL                  COMMENT '用户的显示名',
  `password`        VARCHAR(32)   NOT NULL                  COMMENT '密码',
  `mobile`          VARCHAR(11)       NULL                  COMMENT '手机号',
  `email`           VARCHAR(100)      NULL                  COMMENT '邮箱',
  `type`            SMALLINT          NULL                  COMMENT '用户类型',
  `status`          SMALLINT          NULL                  COMMENT '用户状态',
  `out_id`          VARCHAR(32)       NULL                  COMMENT '关联的外部用户ID',
  `out_type`        VARCHAR(32)       NULL                  COMMENT '用户来源',
  `created_at`      DATETIME          NULL                  COMMENT '创建时间',
  `updated_at`      DATETIME          NULL                  COMMENT '更新时间',
  PRIMARY KEY (`id`)
);
