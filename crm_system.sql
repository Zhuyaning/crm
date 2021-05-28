/*
 Navicat Premium Data Transfer

 Source Server         : MySQL(localhost)
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : crm_system

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 28/05/2021 11:48:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customertrace
-- ----------------------------
DROP TABLE IF EXISTS `customertrace`;
CREATE TABLE `customertrace`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `traceITime` datetime(0) NOT NULL COMMENT '跟进时间',
  `traceDetails` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跟进内容',
  `traceType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跟进方式（数据字典）',
  `traceResult` int(0) NOT NULL COMMENT '跟进效果：1 差，2 中，3 优 ',
  `customerID` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跟进客户',
  `inputUser` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `type` int(0) NOT NULL COMMENT '跟进类型：0 潜在开发计划，1 客户跟进历史',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for customertransfer
-- ----------------------------
DROP TABLE IF EXISTS `customertransfer`;
CREATE TABLE `customertransfer`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `customer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户',
  `transUser` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '移交人员',
  `transTime` datetime(0) NULL DEFAULT NULL COMMENT '移交时间',
  `oldSeller` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '老市场专员',
  `newSeller` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新市场专员',
  `transReason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '移交原因',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工姓名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `age` int(0) NOT NULL COMMENT '年龄',
  `dept` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门',
  `hireDate` datetime(0) NULL DEFAULT NULL COMMENT '入职日期',
  `state` int(0) NULL DEFAULT NULL COMMENT '入职时间：1 正常，0 离职',
  `admin` int(0) NULL DEFAULT NULL COMMENT '超级管理员身份：1 超级管理员，0普通员工',
  `role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for employee_role
-- ----------------------------
DROP TABLE IF EXISTS `employee_role`;
CREATE TABLE `employee_role`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `eid` int(0) NOT NULL,
  `rid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  `expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for potentialcustomer
-- ----------------------------
DROP TABLE IF EXISTS `potentialcustomer`;
CREATE TABLE `potentialcustomer`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客户姓名',
  `age` int(0) NULL DEFAULT NULL COMMENT '客户年龄',
  `gender` int(0) NULL DEFAULT NULL COMMENT '客户年龄：1 男，0女',
  `tel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话号码',
  `qq` int(0) NULL DEFAULT NULL COMMENT 'qq号码',
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职业',
  `source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户来源',
  `seller` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '负责人',
  `inputUser` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `inputTime` datetime(0) NOT NULL COMMENT '创建时间',
  `status` int(0) NOT NULL COMMENT '客户状态：-2:流失，-1:开发失败，0:潜在客户，1:正式客户，2:资源池客户\r\n',
  `positiveTime` datetime(0) NULL DEFAULT NULL COMMENT '转正时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `sn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `permission` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role_permissions
-- ----------------------------
DROP TABLE IF EXISTS `role_permissions`;
CREATE TABLE `role_permissions`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `pid` int(0) NOT NULL,
  `rid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for systemdictionary
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionary`;
CREATE TABLE `systemdictionary`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `sn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典目录编号',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典目录名称',
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典目录简介',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for systemdictionaryitem
-- ----------------------------
DROP TABLE IF EXISTS `systemdictionaryitem`;
CREATE TABLE `systemdictionaryitem`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `parent` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对应的字典目录编号',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典目录明细',
  `sequence` int(0) NULL DEFAULT NULL COMMENT '字典明细编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
