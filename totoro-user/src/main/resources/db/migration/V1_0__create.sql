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
CREATE TABLE IF NOT EXISTS totoro_users
(
  id           BIGSERIAL                                    NOT NULL
  CONSTRAINT totoro_users_pkey
  PRIMARY KEY,
  nickname     VARCHAR(32) DEFAULT '' :: CHARACTER VARYING  NOT NULL,
  display_name VARCHAR(32) DEFAULT '' :: CHARACTER VARYING  NOT NULL,
  password     VARCHAR(128) DEFAULT '' :: CHARACTER VARYING NOT NULL,
  mobile       VARCHAR(16) DEFAULT '' :: CHARACTER VARYING  NOT NULL,
  email        VARCHAR(32) DEFAULT '' :: CHARACTER VARYING  NOT NULL,
  type         SMALLINT DEFAULT 0                           NOT NULL,
  status       SMALLINT DEFAULT 0                           NOT NULL,
  create_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP          NOT NULL,
  update_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP          NOT NULL
);
COMMENT ON TABLE totoro_users IS '用户表';
COMMENT ON COLUMN totoro_users.id IS '自增主键';
COMMENT ON COLUMN totoro_users.nickname IS '用户名';
COMMENT ON COLUMN totoro_users.display_name IS '用户的显示名';
COMMENT ON COLUMN totoro_users.password IS '密码';
COMMENT ON COLUMN totoro_users.mobile IS '手机号';
COMMENT ON COLUMN totoro_users.email IS '邮箱';
COMMENT ON COLUMN totoro_users.type IS '用户类型';
COMMENT ON COLUMN totoro_users.status IS '用户状态';
COMMENT ON COLUMN totoro_users.create_time IS '创建时间';
COMMENT ON COLUMN totoro_users.update_time IS '更新时间';