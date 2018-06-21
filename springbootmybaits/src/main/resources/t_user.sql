/*
Navicat MySQL Data Transfer

Source Server         : 172.16.90.109
Source Server Version : 50629
Source Host           : 172.16.90.109:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2018-06-21 07:48:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'hello', '1');
INSERT INTO `t_user` VALUES ('2', 'hello', '2');
INSERT INTO `t_user` VALUES ('3', 'hello', '3');
INSERT INTO `t_user` VALUES ('4', 'this', '4');
INSERT INTO `t_user` VALUES ('5', 'that', '5');
INSERT INTO `t_user` VALUES ('6', 'woami', '6');
INSERT INTO `t_user` VALUES ('7', 'thfadf', '7');
INSERT INTO `t_user` VALUES ('8', 'fadf', '8');
INSERT INTO `t_user` VALUES ('9', 'fasdfa', '9');
INSERT INTO `t_user` VALUES ('10', 'fadf', '10');
INSERT INTO `t_user` VALUES ('11', 'dfadsf', '11');
INSERT INTO `t_user` VALUES ('12', 'dfadgsag', '12');
INSERT INTO `t_user` VALUES ('13', 'fadgagad', '13');
INSERT INTO `t_user` VALUES ('14', 'afdadfadsf', '14');
INSERT INTO `t_user` VALUES ('15', '测试', '10');
INSERT INTO `t_user` VALUES ('16', '测试', '10');
INSERT INTO `t_user` VALUES ('17', '测试', '10');
INSERT INTO `t_user` VALUES ('18', '测试', '10');
INSERT INTO `t_user` VALUES ('19', '测试', '10');
INSERT INTO `t_user` VALUES ('20', '测试', '10');
INSERT INTO `t_user` VALUES ('21', '测试', '10');
INSERT INTO `t_user` VALUES ('22', '测试', '10');
INSERT INTO `t_user` VALUES ('23', '测试', '10');
INSERT INTO `t_user` VALUES ('24', '测试', '10');
INSERT INTO `t_user` VALUES ('25', '测试', '10');
INSERT INTO `t_user` VALUES ('26', '测试', '10');
INSERT INTO `t_user` VALUES ('27', '测试', '10');
