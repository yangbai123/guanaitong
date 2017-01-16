/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-01-16 20:30:11
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
-- Table structure for user_table
-- ----------------------------
DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `login_id` varchar(48) NOT NULL,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(48) DEFAULT NULL,
  `phone_number` int(11) NOT NULL,
  `license_key` varchar(20) NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `loginer_type` tinyint(1) NOT NULL,
  `registration` varchar(48) DEFAULT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_table
-- ----------------------------
