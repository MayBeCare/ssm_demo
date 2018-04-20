/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : ssm_demo

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-04-20 14:31:42
*/

-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE ssm_demo;
-- 使用数据库
use ssm_demo;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
`user_code`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`user_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`user_sex`  int(1) NULL DEFAULT NULL COMMENT '0：男       1：女' ,
`user_age`  int(3) NULL DEFAULT NULL ,
PRIMARY KEY (`user_code`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of user_info
-- ----------------------------
BEGIN;
INSERT INTO `user_info` VALUES ('13000100', 'John', '0', '18'), ('1400100', 'Amy', '1', '20'), ('1500100', 'James', '3', '17');
COMMIT;
SET FOREIGN_KEY_CHECKS=1;
