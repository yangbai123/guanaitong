/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50173
Source Host           : 192.168.1.126:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-17 16:25:48
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
