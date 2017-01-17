/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50173
Source Host           : 192.168.1.126:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-01-17 09:46:28
*/

SET FOREIGN_KEY_CHECKS=0;

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
-- Table structure for Pre_time
-- ----------------------------
DROP TABLE IF EXISTS `Pre_time`;
CREATE TABLE `Pre_time` (
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
