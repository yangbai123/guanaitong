/*
Navicat MySQL Data Transfer

Source Server         : 172.27.35.3_3306
Source Server Version : 50173
Source Host           : 172.27.35.3:3306
Source Database       : meeting_room

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-02-20 13:17:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookdev_table
-- ----------------------------
DROP TABLE IF EXISTS `bookdev_table`;
CREATE TABLE `bookdev_table` (
  `assoion_id` int(11) DEFAULT NULL,
  `meeting_id` int(11) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookdev_table
-- ----------------------------

-- ----------------------------
-- Table structure for device_table
-- ----------------------------
DROP TABLE IF EXISTS `device_table`;
CREATE TABLE `device_table` (
  `device_id` int(11) NOT NULL AUTO_INCREMENT,
  `device_name` varchar(20) NOT NULL,
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device_table
-- ----------------------------
INSERT INTO `device_table` VALUES ('1', '笔记本');
INSERT INTO `device_table` VALUES ('2', '投影仪');
INSERT INTO `device_table` VALUES ('3', '花瓣');

-- ----------------------------
-- Table structure for Management
-- ----------------------------
DROP TABLE IF EXISTS `Management`;
CREATE TABLE `Management` (
  `meeting_roomid` int(48) NOT NULL AUTO_INCREMENT,
  `meeting_room` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `nums_max` int(3) DEFAULT NULL,
  `nums_min` int(3) DEFAULT NULL,
  `projector` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `visible` tinyint(1) DEFAULT NULL,
  `start_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `end_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`meeting_roomid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of Management
-- ----------------------------
INSERT INTO `Management` VALUES ('2', '平台中心会议室', '2017-02-18 10:50:58', '6', '8', 'yangbai', '1', '12:00', '22:00');
INSERT INTO `Management` VALUES ('3', '招待室2', '2017-02-19 13:30:30', '1', '12', 'yangbai', '1', '08:30', '21:30');
INSERT INTO `Management` VALUES ('4', '招待室', '2017-02-19 14:15:55', '1', '12', 'yangbai', '1', '09:00', '21:00');
INSERT INTO `Management` VALUES ('5', '鸟巢', '2017-02-17 12:34:18', '1', '12', 'yangbai', '1', '10:00', '21:00');
INSERT INTO `Management` VALUES ('6', '水立方', '2017-02-17 12:34:30', '3', '20', 'mmm', '1', '10:00', '21:30');

-- ----------------------------
-- Table structure for meetdev_table
-- ----------------------------
DROP TABLE IF EXISTS `meetdev_table`;
CREATE TABLE `meetdev_table` (
  `associate_id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_roomid` int(11) NOT NULL,
  `device_id` int(11) NOT NULL,
  PRIMARY KEY (`associate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meetdev_table
-- ----------------------------
INSERT INTO `meetdev_table` VALUES ('1', '2', '1');
INSERT INTO `meetdev_table` VALUES ('2', '2', '2');
INSERT INTO `meetdev_table` VALUES ('3', '2', '3');
INSERT INTO `meetdev_table` VALUES ('4', '3', '2');
INSERT INTO `meetdev_table` VALUES ('5', '3', '3');
INSERT INTO `meetdev_table` VALUES ('6', '4', '2');
INSERT INTO `meetdev_table` VALUES ('7', '4', '1');
INSERT INTO `meetdev_table` VALUES ('8', '5', '3');
INSERT INTO `meetdev_table` VALUES ('9', '5', '1');
INSERT INTO `meetdev_table` VALUES ('10', '5', '2');

-- ----------------------------
-- Table structure for Predestine
-- ----------------------------
DROP TABLE IF EXISTS `Predestine`;
CREATE TABLE `Predestine` (
  `meeting_id` int(48) NOT NULL AUTO_INCREMENT,
  `meeting_theme` varchar(255) COLLATE utf8_bin NOT NULL,
  `start_time` varchar(10) COLLATE utf8_bin NOT NULL,
  `end_time` varchar(10) COLLATE utf8_bin NOT NULL,
  `meeting_roomid` int(11) NOT NULL,
  `booker` varchar(255) COLLATE utf8_bin NOT NULL,
  `date` date DEFAULT NULL,
  `device_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`meeting_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of Predestine
-- ----------------------------
INSERT INTO `Predestine` VALUES ('1', '我爱你', '15:00', '17:00', '2', 'yangbai', '2017-02-16', null);
INSERT INTO `Predestine` VALUES ('2', '我爱你', '14:00', '17:00', '3', 'yangbai2', '2017-02-16', null);
INSERT INTO `Predestine` VALUES ('3', '我爱你', '9:00', '13:00', '3', 'yangbai1', '2017-02-16', null);
INSERT INTO `Predestine` VALUES ('4', '我爱你', '8:30', '10:00', '4', 'yangbai', '2017-02-15', null);
INSERT INTO `Predestine` VALUES ('5', '我爱你', '9:30', '10:00', '3', 'yangbai', '2017-02-17', null);
INSERT INTO `Predestine` VALUES ('6', '我爱你', '6:30', '10:00', '1', 'yangbai', '2017-02-17', null);
INSERT INTO `Predestine` VALUES ('7', '我爱你', '12:00', '17:00', '4', 'yangbai', '2017-02-16', null);
INSERT INTO `Predestine` VALUES ('8', '我爱你', '15:00', '17:00', '5', 'yangbai', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('9', '我爱你', '15:00', '17:00', '6', 'yangbai', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('10', '我爱你', '14:00', '17:00', '3', 'yangbai2', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('11', '我爱你', '9:00', '13:00', '3', 'yangbai1', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('12', '我爱你', '9:30', '10:00', '4', 'yangbai', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('13', '我爱你', '10:30', '14:00', '2', 'yangbai', '2017-02-18', null);
INSERT INTO `Predestine` VALUES ('45', '下啊苏打水', '08:30', '21:30', '3', 'yangbai', '2017-02-19', '投影仪,花瓣');
INSERT INTO `Predestine` VALUES ('46', 'sad打算', '12:00', '22:00', '2', 'yangbai', '2017-02-19', '笔记本,投影仪,花瓣');
INSERT INTO `Predestine` VALUES ('47', '再次创造新的撒打算', '10:00', '21:30', '6', 'yangbai', '2017-02-19', '');
INSERT INTO `Predestine` VALUES ('48', '我真的好爱你', '15:00', '17:00', '2', 'yangbai', '2017-02-20', '笔记本,投影仪,花瓣');
INSERT INTO `Predestine` VALUES ('49', '最后的爱', '12:00', '14:00', '2', 'yangbai', '2017-02-20', '笔记本,投影仪,花瓣');

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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_table
-- ----------------------------
INSERT INTO `user_table` VALUES ('1', 'yangbai', 'yangbai', '2391231214@qq.com', '18945993676', 'yangbai', '1', '1', 'dsasas', '国际');
INSERT INTO `user_table` VALUES ('2', 'yangbai', 'yangbai', '239123121@qq.com', '15764543370', 'yangbai', '0', '0', 'dsadas', '加油');
INSERT INTO `user_table` VALUES ('3', '杨柏', 'yangbai', '2391231245@qq.com', '18947773676', 'dsadsdasds', '0', '0', null, '爱你');
INSERT INTO `user_table` VALUES ('4', 'yangbai', 'yangbai', '23213113@qq.com', '18945774444', 'yangbai', '0', '0', null, '小朋友');
INSERT INTO `user_table` VALUES ('5', '加油', '123', '2321321312@qq.com', '18945989872', 'yangbai', '0', '0', null, '爱你偶');
INSERT INTO `user_table` VALUES ('6', '亚撒旦撒大', 'yangbai', '2391223231@qq.com', '18945232132', 'sdaasdasda', '0', '0', null, '撒大打算打算打');
INSERT INTO `user_table` VALUES ('14', '阿姨那旮半', 'yangbai', '2132123@qq.com', '18983673637', 'yangbai', '0', '0', null, '国际');
INSERT INTO `user_table` VALUES ('15', 'laoshi', 'yangbai', '239113114@qq.com', '18925993672', 'asdas', '1', '1', 'sdadsa', '的撒打算的');
INSERT INTO `user_table` VALUES ('16', '薩丟斯', 'yangbai', '239122131@qq.com', '18945993657', '8UXw7dpi', '0', '1', null, '阿斯頓撒');
INSERT INTO `user_table` VALUES ('17', '大三大四的', 'yangbai', '2321312312@qq.com', '18945998888', 'arRHWdjK', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('27', '撒打扫打扫打扫', 'yangbai', '23228612121@qq.com', '18973634877', 'FeF3hQXC', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('28', '撒打扫打扫打扫', 'yangbai', '23228672121@qq.com', '18973654877', 'M1ysIIFt', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('29', '撒打扫打扫打扫', 'yangbai', '23228666121@qq.com', '18963654877', 'dMHeZj7M', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('30', '撒打扫打扫打扫', 'yangbai', '23228666125@qq.com', '18963654879', 'Lg0t7IEZ', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('31', '撒打扫打扫打扫', 'yangbai', '23228664125@qq.com', '18963654874', '8TRilovH', '0', '1', null, '阿斯达斯搭档');
INSERT INTO `user_table` VALUES ('32', '撒打扫打扫打扫', 'yangbai', '23225664125@qq.com', '18963634874', 'R1FRVec5', '0', '1', null, '阿斯达斯搭档');
