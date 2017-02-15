/*
Navicat MySQL Data Transfer

Source Server         : 172.20.233.3_3306
Source Server Version : 50173
Source Host           : 172.20.233.3:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-02-15 15:33:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for device_table
-- ----------------------------
DROP TABLE IF EXISTS `device_table`;
CREATE TABLE `device_table` (
  `device_id` int(11) NOT NULL AUTO_INCREMENT,
  `device_name` varchar(20) NOT NULL,
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device_table
-- ----------------------------

-- ----------------------------
-- Table structure for Management
-- ----------------------------
DROP TABLE IF EXISTS `Management`;
CREATE TABLE `Management` (
  `meeting_roomid` int(48) NOT NULL AUTO_INCREMENT,
  `meeting_room` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `nums_max` int(3) DEFAULT NULL,
  `nums_min` int(3) DEFAULT NULL,
  `projector` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `visible` tinyint(1) DEFAULT NULL,
  `device` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`meeting_roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of Management
-- ----------------------------

-- ----------------------------
-- Table structure for meetdev_table
-- ----------------------------
DROP TABLE IF EXISTS `meetdev_table`;
CREATE TABLE `meetdev_table` (
  `associate_id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_roomid` int(11) NOT NULL,
  `device_id` int(11) NOT NULL,
  PRIMARY KEY (`associate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meetdev_table
-- ----------------------------

-- ----------------------------
-- Table structure for Pre_time
-- ----------------------------
DROP TABLE IF EXISTS `Pre_time`;
CREATE TABLE `Pre_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_roomid` int(48) NOT NULL,
  `eight` tinyint(1) NOT NULL,
  `eight_thirty` tinyint(1) NOT NULL,
  `nine` tinyint(1) NOT NULL,
  `nine_thirty` tinyint(1) NOT NULL,
  `ten` tinyint(1) NOT NULL,
  `ten_thirty` tinyint(1) NOT NULL,
  `eleven` tinyint(1) NOT NULL,
  `eleven_thirty` tinyint(1) NOT NULL,
  `twelve` tinyint(1) NOT NULL,
  `twelve_thirty` tinyint(1) NOT NULL,
  `thirteen` tinyint(1) NOT NULL,
  `thirteen_thirty` tinyint(1) NOT NULL,
  `fourteen` tinyint(1) NOT NULL,
  `fourteen_thirty` tinyint(1) NOT NULL,
  `fifteen` tinyint(1) NOT NULL,
  `fifteen_thirty` tinyint(1) NOT NULL,
  `sixteen` tinyint(1) NOT NULL,
  `sixteen_thirty` tinyint(1) NOT NULL,
  `seventeen` tinyint(1) NOT NULL,
  `seventeen_thirty` tinyint(1) NOT NULL,
  `eighteen` tinyint(1) NOT NULL,
  `eighteen_thirty` tinyint(1) NOT NULL,
  `ninteen` tinyint(1) NOT NULL,
  `ninteen_thirty` tinyint(1) NOT NULL,
  `twenty` tinyint(1) NOT NULL,
  `twenty_thirty` tinyint(1) NOT NULL,
  `twentyone` tinyint(1) NOT NULL,
  `twentyone_thirty` tinyint(1) NOT NULL,
  `twentytwo` tinyint(1) NOT NULL,
  `twentytwo_thirty` tinyint(1) NOT NULL,
  `twentythree` tinyint(1) NOT NULL,
  `bookdata` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of Pre_time
-- ----------------------------

-- ----------------------------
-- Table structure for Predestine
-- ----------------------------
DROP TABLE IF EXISTS `Predestine`;
CREATE TABLE `Predestine` (
  `meeting_id` int(48) NOT NULL AUTO_INCREMENT,
  `meeting_theme` varchar(255) COLLATE utf8_bin NOT NULL,
  `end_time` datetime NOT NULL,
  `start_time` datetime NOT NULL,
  `meeting_roomid` int(11) NOT NULL,
  `booker` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`meeting_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of Predestine
-- ----------------------------

-- ----------------------------
-- Table structure for user_table
-- ----------------------------
DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `login_id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(48) NOT NULL,
  `email` varchar(48) DEFAULT NULL,
  `phone_number` bigint(11) NOT NULL,
  `license_key` varchar(20) NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `loginer_type` tinyint(1) NOT NULL,
  `registration` varchar(48) DEFAULT NULL,
  `company_name` varchar(100) NOT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_table
-- ----------------------------
INSERT INTO `user_table` VALUES ('1', 'yangbai', 'yangbai', '2391231214@qq.com', '18945993676', 'yangbai', '1', '1', 'dsasas', '国际');
INSERT INTO `user_table` VALUES ('2', 'yang', 'yangbai', '239123121@qq.com', '15764543370', 'yangbai', '0', '0', 'dsadas', '加油');
INSERT INTO `user_table` VALUES ('3', '杨柏', 'yangbai', '2391231245@qq.com', '18947773676', 'dsadsdasds', '0', '0', null, '爱你');
INSERT INTO `user_table` VALUES ('4', 'yangbai', 'yangbai', '23213113@qq.com', '18945774444', 'yangbai', '0', '0', null, '小朋友');
INSERT INTO `user_table` VALUES ('5', '加油', '123', '2321321312@qq.com', '18945989872', 'yangbai', '0', '0', null, '爱你偶');
INSERT INTO `user_table` VALUES ('6', '亚撒旦撒大', 'yangbai', '2391223231@qq.com', '18945232132', 'sdaasdasda', '0', '0', null, '撒大打算打算打');
INSERT INTO `user_table` VALUES ('14', '阿姨那旮半', 'yangbai', '2132123@qq.com', '18983673637', 'yangbai', '0', '0', null, '国际');
INSERT INTO `user_table` VALUES ('15', 'laoshi', 'yangbai', '239113114@qq.com', '18925993672', 'asdas', '1', '1', 'sdadsa', '的撒打算的');
INSERT INTO `user_table` VALUES ('16', '薩丟斯', 'yangbai', '239122131@qq.com', '18945993657', '8UXw7dpi', '0', '1', null, '阿斯頓撒');
