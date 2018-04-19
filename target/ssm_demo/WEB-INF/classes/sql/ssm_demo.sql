/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : ssm_demo

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-04-19 21:26:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_code` varchar(20) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_sex` int(1) DEFAULT NULL COMMENT '0：男       1：女',
  `user_age` int(3) DEFAULT NULL,
  PRIMARY KEY (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('13000100', 'Amy', '1', '18');
SET FOREIGN_KEY_CHECKS=1;
