/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-01-17 10:49:37
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
-- Table structure for management
-- ----------------------------
DROP TABLE IF EXISTS `management`;
CREATE TABLE `management` (
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
-- Records of management
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
-- Table structure for predestine
-- ----------------------------
DROP TABLE IF EXISTS `predestine`;
CREATE TABLE `predestine` (
  `meeting_id` int(48) NOT NULL AUTO_INCREMENT,
  `meeting_theme` varchar(255) COLLATE utf8_bin NOT NULL,
  `end_time` datetime NOT NULL,
  `start_time` datetime NOT NULL,
  `meeting_roomid` int(11) NOT NULL,
  `booker` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`meeting_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of predestine
-- ----------------------------

-- ----------------------------
-- Table structure for pre_time
-- ----------------------------
DROP TABLE IF EXISTS `pre_time`;
CREATE TABLE `pre_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_roomid` int(48) NOT NULL,
  `8.00` tinyint(1) NOT NULL,
  `8.30` tinyint(1) NOT NULL,
  `9.00` tinyint(1) NOT NULL,
  `9.30` tinyint(1) NOT NULL,
  `10.00` tinyint(1) NOT NULL,
  `10.30` tinyint(1) NOT NULL,
  `11.00` tinyint(1) NOT NULL,
  `11.30` tinyint(1) NOT NULL,
  `12.00` tinyint(1) NOT NULL,
  `12.30` tinyint(1) NOT NULL,
  `13.00` tinyint(1) NOT NULL,
  `13.30` tinyint(1) NOT NULL,
  `14.00` tinyint(1) NOT NULL,
  `14.30` tinyint(1) NOT NULL,
  `15.00` tinyint(1) NOT NULL,
  `15.30` tinyint(1) NOT NULL,
  `16.00` tinyint(1) NOT NULL,
  `16.30` tinyint(1) NOT NULL,
  `17.00` tinyint(1) NOT NULL,
  `17.30` tinyint(1) NOT NULL,
  `18.00` tinyint(1) NOT NULL,
  `18.30` tinyint(1) NOT NULL,
  `19.00` tinyint(1) NOT NULL,
  `19.30` tinyint(1) NOT NULL,
  `20.00` tinyint(1) NOT NULL,
  `20.30` tinyint(1) NOT NULL,
  `21.00` tinyint(1) NOT NULL,
  `21.30` tinyint(1) NOT NULL,
  `22.00` tinyint(1) NOT NULL,
  `22.30` tinyint(1) NOT NULL,
  `23.00` tinyint(1) NOT NULL,
  `bookdata` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of pre_time
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
