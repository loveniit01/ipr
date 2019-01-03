-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.12 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ipr_data
DROP DATABASE IF EXISTS `ipr_data`;
CREATE DATABASE IF NOT EXISTS `ipr_data` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `ipr_data`;

-- Dumping structure for table ipr_data.account
DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_name` varchar(250) DEFAULT NULL,
  `mail_id` varchar(250) DEFAULT NULL,
  `contact` bigint(20) DEFAULT NULL,
  `address` text,
  `website` varchar(250) DEFAULT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKlfnx1hopfkc8ve8dl67nmx3oa` (`mail_id`),
  UNIQUE KEY `UK66b2x5ot43owp5bsh5pk3jw3n` (`website`),
  KEY `FK_account_app_user` (`created_by`),
  CONSTRAINT `FK_account_app_user` FOREIGN KEY (`created_by`) REFERENCES `app_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.account: ~0 rows (approximately)
DELETE FROM `account`;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`id`, `account_name`, `mail_id`, `contact`, `address`, `website`, `created_by`, `created_date`) VALUES
	(1, 'abp', 'aa@aa.aa', NULL, NULL, 'aa.aa.com', 1, '2019-01-02 11:29:49'),
	(2, 'xyz', 'xyz.xyz.com', NULL, NULL, 'xyzzzzz.com', 1, '2019-01-02 12:07:18');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;

-- Dumping structure for table ipr_data.app_role
DROP TABLE IF EXISTS `app_role`;
CREATE TABLE IF NOT EXISTS `app_role` (
  `ROLE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`ROLE_ID`),
  UNIQUE KEY `APP_ROLE_UK` (`ROLE_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- Dumping data for table ipr_data.app_role: ~3 rows (approximately)
DELETE FROM `app_role`;
/*!40000 ALTER TABLE `app_role` DISABLE KEYS */;
INSERT INTO `app_role` (`ROLE_ID`, `ROLE_NAME`) VALUES
	(1, 'ROLE_ADMIN'),
	(3, 'ROLE_MANAGER'),
	(4, 'ROLE_TL'),
	(2, 'ROLE_USER');
/*!40000 ALTER TABLE `app_role` ENABLE KEYS */;

-- Dumping structure for table ipr_data.app_user
DROP TABLE IF EXISTS `app_user`;
CREATE TABLE IF NOT EXISTS `app_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `ENCRYTED_PASSWORD` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `ENABLED` bit(1) NOT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `APP_USER_UK` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- Dumping data for table ipr_data.app_user: ~6 rows (approximately)
DELETE FROM `app_user`;
/*!40000 ALTER TABLE `app_user` DISABLE KEYS */;
INSERT INTO `app_user` (`USER_ID`, `USER_NAME`, `ENCRYTED_PASSWORD`, `ENABLED`) VALUES
	(1, 'admin', '$2a$10$1l9PJTwz.DeQt0YzWRBhYev1.SARsBdJwcJLaDXOeaioVCqAVlXwe', b'1'),
	(2, 'dbuser', '$2a$10$1l9PJTwz.DeQt0YzWRBhYev1.SARsBdJwcJLaDXOeaioVCqAVlXwe', b'1'),
	(3, 'dbmanager', '$2a$10$1l9PJTwz.DeQt0YzWRBhYev1.SARsBdJwcJLaDXOeaioVCqAVlXwe', b'1'),
	(4, 'dbteamlead', '$2a$10$1l9PJTwz.DeQt0YzWRBhYev1.SARsBdJwcJLaDXOeaioVCqAVlXwe', b'1'),
	(6, 'rahul', '$2a$10$TNI6A0BzWeMgmciuTs/oCe6BWZxvLHYVPkAgWVkciU5OIJw7yYE6e', b'1'),
	(7, 'rahul1', '$2a$10$0ENst6cSdPZbDTPkxUSbWuoUWH0aiZg6lvItZAHH2YGU9zelrt4VS', b'1'),
	(9, 'rahul2', '$2a$10$5cHD10lapMAAUyAt7JClmu0hf5sBnZ4ksj31cSXxtIsk01IIPzFEW', b'0');
/*!40000 ALTER TABLE `app_user` ENABLE KEYS */;

-- Dumping structure for table ipr_data.app_user_details
DROP TABLE IF EXISTS `app_user_details`;
CREATE TABLE IF NOT EXISTS `app_user_details` (
  `USER_ID_ID` bigint(20) NOT NULL,
  `user_first_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `user_last_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `mail_id_ofc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `mail_id_personal` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `mobile_no` bigint(20) DEFAULT NULL,
  `phone_no` bigint(20) DEFAULT NULL,
  `dob_year` smallint(6) DEFAULT NULL COMMENT 'date of birth',
  `dob_month` tinyint(4) DEFAULT NULL,
  `dob_date` tinyint(4) DEFAULT NULL,
  `doj_year` smallint(6) DEFAULT NULL COMMENT 'date of joining',
  `doj_month` tinyint(4) DEFAULT NULL,
  `doj_date` tinyint(4) DEFAULT NULL,
  `id_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `id_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `father_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `father_mobile_no` bigint(20) DEFAULT NULL,
  `home_phone_no` bigint(20) DEFAULT NULL,
  `address` varchar(750) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blood_group` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `disable_date` datetime DEFAULT NULL,
  `disable_by` bigint(20) NOT NULL DEFAULT '0',
  UNIQUE KEY `UKqrssc6ukoariynce0xydpkp6f` (`USER_ID_ID`),
  UNIQUE KEY `UK8llehkw93orw9np8cm80jsqax` (`mail_id_ofc`),
  UNIQUE KEY `UK9m2y1vc8b0ao2xlmsn3ko18le` (`mail_id_personal`),
  UNIQUE KEY `UKj514ag38o44rt6ka7qiawocn6` (`mobile_no`),
  CONSTRAINT `FKaky07hhhxdyyb472vxwx00wh4` FOREIGN KEY (`USER_ID_ID`) REFERENCES `app_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- Dumping data for table ipr_data.app_user_details: ~0 rows (approximately)
DELETE FROM `app_user_details`;
/*!40000 ALTER TABLE `app_user_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_details` ENABLE KEYS */;

-- Dumping structure for view ipr_data.app_user_detail_view
DROP VIEW IF EXISTS `app_user_detail_view`;
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `app_user_detail_view` (
	`address` VARCHAR(750) NULL COLLATE 'utf8mb4_bin',
	`blood_group` VARCHAR(3) NULL COLLATE 'utf8mb4_bin',
	`created_by` BIGINT(20) NOT NULL,
	`created_date` DATETIME NOT NULL,
	`disable_by` BIGINT(20) NOT NULL,
	`disable_date` DATETIME NULL,
	`dob_date` TINYINT(4) NULL,
	`dob_month` TINYINT(4) NULL,
	`dob_year` SMALLINT(6) NULL COMMENT 'date of birth',
	`doj_date` TINYINT(4) NULL,
	`doj_month` TINYINT(4) NULL,
	`doj_year` SMALLINT(6) NULL COMMENT 'date of joining',
	`ENABLED` BIT(1) NULL,
	`ENCRYTED_PASSWORD` VARCHAR(128) NULL COLLATE 'utf8mb4_bin',
	`father_mobile_no` BIGINT(20) NULL,
	`father_name` VARCHAR(100) NULL COLLATE 'utf8mb4_bin',
	`home_phone_no` BIGINT(20) NULL,
	`id_number` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`id_type` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`mail_id_ofc` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`mail_id_personal` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`mobile_no` BIGINT(20) NULL,
	`phone_no` BIGINT(20) NULL,
	`user_first_name` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`USER_ID` BIGINT(20) NULL,
	`USER_ID_ID` BIGINT(20) NOT NULL,
	`user_last_name` VARCHAR(50) NULL COLLATE 'utf8mb4_bin',
	`USER_NAME` VARCHAR(36) NULL COLLATE 'utf8mb4_bin'
) ENGINE=MyISAM;

-- Dumping structure for table ipr_data.contact
DROP TABLE IF EXISTS `contact`;
CREATE TABLE IF NOT EXISTS `contact` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_id` bigint(20) NOT NULL DEFAULT '0',
  `first_name` varchar(100) DEFAULT NULL,
  `middle_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL,
  `mail_id` varchar(100) DEFAULT NULL,
  `address` varchar(5000) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `mobile1` bigint(20) DEFAULT NULL,
  `mobile2` bigint(20) DEFAULT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mail_id` (`mail_id`),
  UNIQUE KEY `UK5lmtxhvlrg3batmo2wkfklmrs` (`mail_id`),
  KEY `FK_contact_app_user` (`created_by`),
  KEY `FK_contact_account` (`account_id`),
  CONSTRAINT `FK_contact_account` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.contact: ~2 rows (approximately)
DELETE FROM `contact`;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`id`, `account_id`, `first_name`, `middle_name`, `last_name`, `designation`, `mail_id`, `address`, `phone`, `mobile1`, `mobile2`, `created_by`, `created_date`) VALUES
	(1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL),
	(2, 2, NULL, NULL, NULL, NULL, 'xyz.xyz.com', NULL, NULL, NULL, NULL, 1, '2019-01-02 12:07:18');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;

-- Dumping structure for table ipr_data.greylist_data
DROP TABLE IF EXISTS `greylist_data`;
CREATE TABLE IF NOT EXISTS `greylist_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `domain_name` varchar(100) NOT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deleted` tinyint(4) NOT NULL DEFAULT '0',
  `deleted_by` bigint(20) NOT NULL DEFAULT '0',
  `deleted_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK74xroffeuq0baj8hcdjclklur` (`domain_name`),
  KEY `FK_greylist_data_app_user` (`created_by`),
  CONSTRAINT `FK_greylist_data_app_user` FOREIGN KEY (`created_by`) REFERENCES `app_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.greylist_data: ~4 rows (approximately)
DELETE FROM `greylist_data`;
/*!40000 ALTER TABLE `greylist_data` DISABLE KEYS */;
INSERT INTO `greylist_data` (`id`, `domain_name`, `created_by`, `created_date`, `deleted`, `deleted_by`, `deleted_date`) VALUES
	(1, 'abpnews.com', 1, '2018-12-27 16:11:28', 0, 0, NULL),
	(2, 'zeenews.com', 1, '2018-12-27 16:11:38', 0, 0, NULL),
	(3, 'aaa.com', 3, '2019-01-02 10:38:34', 0, 0, NULL),
	(4, 'qaq.com', 1, '2019-01-02 14:10:58', 0, 0, NULL);
/*!40000 ALTER TABLE `greylist_data` ENABLE KEYS */;

-- Dumping structure for table ipr_data.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.hibernate_sequence: 3 rows
DELETE FROM `hibernate_sequence`;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(11),
	(11),
	(11);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table ipr_data.persistent_logins
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE IF NOT EXISTS `persistent_logins` (
  `username` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `series` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `token` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `last_used` timestamp NOT NULL,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- Dumping data for table ipr_data.persistent_logins: ~0 rows (approximately)
DELETE FROM `persistent_logins`;
/*!40000 ALTER TABLE `persistent_logins` DISABLE KEYS */;
/*!40000 ALTER TABLE `persistent_logins` ENABLE KEYS */;

-- Dumping structure for table ipr_data.project
DROP TABLE IF EXISTS `project`;
CREATE TABLE IF NOT EXISTS `project` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `project_types_id` int(11) NOT NULL DEFAULT '0',
  `account_id` bigint(20) NOT NULL DEFAULT '0',
  `project_name` varchar(250) DEFAULT NULL,
  `channel_name` varchar(250) DEFAULT NULL,
  `project_url` varchar(250) DEFAULT NULL,
  `contract_url` varchar(250) DEFAULT NULL COMMENT 'Letter Of Authorization',
  `created_by` bigint(20) DEFAULT NULL,
  `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deactivate` tinyint(4) NOT NULL DEFAULT '0',
  `deactivated_by` bigint(20) DEFAULT NULL,
  `deactivated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `project_url` (`project_url`),
  UNIQUE KEY `UK9s9eb65b8mk2bhscu182ewp6o` (`project_url`),
  KEY `FK_project_app_user` (`deactivated_by`),
  KEY `FK_project_project_types` (`project_types_id`),
  KEY `FK_project_account` (`account_id`),
  KEY `FK_project_app_user1` (`created_by`),
  CONSTRAINT `FK_project_account` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`),
  CONSTRAINT `FK_project_app_user1` FOREIGN KEY (`created_by`) REFERENCES `app_user` (`user_id`),
  CONSTRAINT `FK_project_project_types` FOREIGN KEY (`project_types_id`) REFERENCES `project_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.project: ~1 rows (approximately)
DELETE FROM `project`;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` (`id`, `project_types_id`, `account_id`, `project_name`, `channel_name`, `project_url`, `contract_url`, `created_by`, `created_time`, `deactivate`, `deactivated_by`, `deactivated_date`) VALUES
	(1, 1, 1, 'aha wha', 'zee', 'dhfdh//happt.com', NULL, 1, '2019-01-02 11:31:27', 0, NULL, NULL),
	(2, 1, 2, 'pp', 'p', 'p', 'p', 1, '2019-01-03 16:35:45', 0, NULL, NULL);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;

-- Dumping structure for table ipr_data.project_types
DROP TABLE IF EXISTS `project_types`;
CREATE TABLE IF NOT EXISTS `project_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_type` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKme9xh2spprnxc67evvp6gvpav` (`project_type`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.project_types: ~1 rows (approximately)
DELETE FROM `project_types`;
/*!40000 ALTER TABLE `project_types` DISABLE KEYS */;
INSERT INTO `project_types` (`id`, `project_type`) VALUES
	(1, 'music');
/*!40000 ALTER TABLE `project_types` ENABLE KEYS */;

-- Dumping structure for table ipr_data.upload_data
DROP TABLE IF EXISTS `upload_data`;
CREATE TABLE IF NOT EXISTS `upload_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `link` varchar(250) NOT NULL,
  `project_id` bigint(20) NOT NULL,
  `domain_name` varchar(50) NOT NULL,
  `source_link` varchar(250) NOT NULL,
  `note1` varchar(250) DEFAULT NULL,
  `note2` varchar(250) DEFAULT NULL,
  `note3` varchar(250) DEFAULT NULL,
  `upload_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `link_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1= source, 0=infringing',
  `is_manual` tinyint(4) NOT NULL DEFAULT '1',
  `user_id` bigint(20) DEFAULT NULL,
  `is_whitelist` tinyint(4) NOT NULL DEFAULT '0',
  `is_greylist` tinyint(4) NOT NULL DEFAULT '0',
  `is_deleted` int(11) NOT NULL DEFAULT '0' COMMENT 'store datetime in integer format',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKrbu5l9lvnxa097jidmydlokhx` (`link`,`project_id`,`domain_name`,`link_type`,`is_deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.upload_data: ~2 rows (approximately)
DELETE FROM `upload_data`;
/*!40000 ALTER TABLE `upload_data` DISABLE KEYS */;
INSERT INTO `upload_data` (`id`, `link`, `project_id`, `domain_name`, `source_link`, `note1`, `note2`, `note3`, `upload_time`, `link_type`, `is_manual`, `user_id`, `is_whitelist`, `is_greylist`, `is_deleted`) VALUES
	(1, 'http://www.hello.com/1', 1, 'abpnews.com', 'http://www.hello.com', 'd', 'e', 'f', '2019-01-03 16:37:42', 1, 0, 1, 0, 1, 0),
	(2, 'https://www.google.com/1', 1, 'google.com', '', 'd', 'e', 'f', '2019-01-03 16:37:42', 0, 0, 1, 1, 0, 0),
	(3, 'https://www.google.com/2', 2, 'google.com', 'https://www.google.com', 'd', 'e', 'f', '2019-01-03 16:37:42', 1, 0, 1, 1, 0, 0);
/*!40000 ALTER TABLE `upload_data` ENABLE KEYS */;

-- Dumping structure for table ipr_data.upload_data_action
DROP TABLE IF EXISTS `upload_data_action`;
CREATE TABLE IF NOT EXISTS `upload_data_action` (
  `upload_data_id` bigint(20) DEFAULT NULL,
  `direct_notice` tinyint(4) NOT NULL DEFAULT '0',
  `invalid` tinyint(4) NOT NULL DEFAULT '0',
  `invalid_by` bigint(20) NOT NULL DEFAULT '0',
  `invalid_date` datetime DEFAULT NULL,
  `invalid_reason` varchar(250) DEFAULT NULL,
  `qc1` tinyint(4) NOT NULL DEFAULT '0',
  `qc1_user` int(11) DEFAULT NULL,
  `qc1_time` datetime DEFAULT NULL,
  `qc2` tinyint(4) NOT NULL DEFAULT '0',
  `qc2_user` int(11) DEFAULT NULL,
  `qc2_time` datetime DEFAULT NULL,
  `data_Notify` tinyint(4) NOT NULL DEFAULT '0',
  `data_notify_user` int(11) NOT NULL DEFAULT '0',
  `fource_notify` tinyint(4) NOT NULL DEFAULT '0',
  UNIQUE KEY `UK19mxgqucn8r8prth4lvfnuk7k` (`upload_data_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.upload_data_action: ~3 rows (approximately)
DELETE FROM `upload_data_action`;
/*!40000 ALTER TABLE `upload_data_action` DISABLE KEYS */;
INSERT INTO `upload_data_action` (`upload_data_id`, `direct_notice`, `invalid`, `invalid_by`, `invalid_date`, `invalid_reason`, `qc1`, `qc1_user`, `qc1_time`, `qc2`, `qc2_user`, `qc2_time`, `data_Notify`, `data_notify_user`, `fource_notify`) VALUES
	(1, 0, 0, 0, NULL, NULL, 0, NULL, NULL, 0, NULL, NULL, 0, 0, 0),
	(2, 0, 0, 0, NULL, NULL, 0, NULL, NULL, 0, NULL, NULL, 0, 0, 0),
	(3, 0, 0, 0, NULL, NULL, 0, NULL, NULL, 0, NULL, NULL, 0, 0, 0);
/*!40000 ALTER TABLE `upload_data_action` ENABLE KEYS */;

-- Dumping structure for table ipr_data.user_performance_detect
DROP TABLE IF EXISTS `user_performance_detect`;
CREATE TABLE IF NOT EXISTS `user_performance_detect` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `work_date` date DEFAULT NULL,
  `infringing_count` int(11) NOT NULL DEFAULT '0' COMMENT 'infringing link',
  `source_count` int(11) NOT NULL DEFAULT '0' COMMENT 'source link',
  `yt_count` int(11) NOT NULL DEFAULT '0',
  `fb_count` int(11) NOT NULL DEFAULT '0',
  `insta_count` int(11) NOT NULL DEFAULT '0',
  `twitter_count` int(11) NOT NULL DEFAULT '0',
  `wl_count` int(11) NOT NULL DEFAULT '0' COMMENT 'white list ',
  `gl_count` int(11) NOT NULL DEFAULT '0' COMMENT 'grey list',
  `invalid_count` int(11) NOT NULL DEFAULT '0',
  `duplicate_count` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK3datffhv3htculgrjyixkkqi4` (`user_id`,`work_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.user_performance_detect: ~0 rows (approximately)
DELETE FROM `user_performance_detect`;
/*!40000 ALTER TABLE `user_performance_detect` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_performance_detect` ENABLE KEYS */;

-- Dumping structure for table ipr_data.user_performance_notice
DROP TABLE IF EXISTS `user_performance_notice`;
CREATE TABLE IF NOT EXISTS `user_performance_notice` (
  `Column 1` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Column 1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.user_performance_notice: ~0 rows (approximately)
DELETE FROM `user_performance_notice`;
/*!40000 ALTER TABLE `user_performance_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_performance_notice` ENABLE KEYS */;

-- Dumping structure for table ipr_data.user_role
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE IF NOT EXISTS `user_role` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USER_ID` bigint(20) NOT NULL,
  `ROLE_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `USER_ROLE_UK` (`USER_ID`,`ROLE_ID`),
  KEY `USER_ROLE_FK2` (`ROLE_ID`),
  CONSTRAINT `FKg7fr1r7o0fkk41nfhnjdyqn7b` FOREIGN KEY (`USER_ID`) REFERENCES `app_user` (`user_id`),
  CONSTRAINT `FKp6m37g6n6c288s096400uw8fw` FOREIGN KEY (`ROLE_ID`) REFERENCES `app_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- Dumping data for table ipr_data.user_role: ~6 rows (approximately)
DELETE FROM `user_role`;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`ID`, `USER_ID`, `ROLE_ID`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(4, 1, 3),
	(3, 2, 2),
	(6, 3, 2),
	(5, 3, 3),
	(8, 7, 2),
	(10, 9, 2);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

-- Dumping structure for table ipr_data.whitelist_data
DROP TABLE IF EXISTS `whitelist_data`;
CREATE TABLE IF NOT EXISTS `whitelist_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `domain_name` varchar(100) NOT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deleted` tinyint(4) NOT NULL DEFAULT '0',
  `deleted_by` bigint(20) NOT NULL DEFAULT '0',
  `deleted_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKa2e4iv3evxmru2iy2wuuapj36` (`domain_name`),
  KEY `FK_whitelist_data_app_user` (`created_by`),
  CONSTRAINT `FK_whitelist_data_app_user` FOREIGN KEY (`created_by`) REFERENCES `app_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ipr_data.whitelist_data: ~4 rows (approximately)
DELETE FROM `whitelist_data`;
/*!40000 ALTER TABLE `whitelist_data` DISABLE KEYS */;
INSERT INTO `whitelist_data` (`id`, `domain_name`, `created_by`, `created_date`, `deleted`, `deleted_by`, `deleted_date`) VALUES
	(2, 'google.com', 1, '2018-12-27 16:10:54', 0, 0, NULL),
	(3, 'youtube.com', 1, '2018-12-27 16:11:07', 0, 0, NULL),
	(4, 'facebook.com', 1, '2019-01-02 10:14:35', 0, 0, NULL),
	(6, 'aaa.com', 1, '2019-01-02 10:15:35', 0, 0, NULL),
	(7, 'yyy', 1, '2019-01-03 14:21:41', 0, 0, NULL);
/*!40000 ALTER TABLE `whitelist_data` ENABLE KEYS */;

-- Dumping structure for trigger ipr_data.account_after_insert
DROP TRIGGER IF EXISTS `account_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `account_after_insert` AFTER INSERT ON `account` FOR EACH ROW BEGIN

insert into contact
set contact.account_id = new.id, contact.mail_id =  new.mail_id, contact.created_by = new.created_by, contact.created_date =  new.created_date;

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger ipr_data.app_user_after_insert
DROP TRIGGER IF EXISTS `app_user_after_insert`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `app_user_after_insert` AFTER INSERT ON `app_user` FOR EACH ROW BEGIN

insert into app_user_details set app_user_details.USER_ID_ID = new.USER_ID;

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for trigger ipr_data.upload_data_tgr
DROP TRIGGER IF EXISTS `upload_data_tgr`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `upload_data_tgr` AFTER INSERT ON `upload_data` FOR EACH ROW BEGIN

insert into upload_data_action
set upload_data_action.upload_data_id =  new.id;

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Dumping structure for view ipr_data.app_user_detail_view
DROP VIEW IF EXISTS `app_user_detail_view`;
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `app_user_detail_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`myuser`@`%` SQL SECURITY DEFINER VIEW `app_user_detail_view` AS select `aud`.`USER_ID_ID` AS `USER_ID_ID`,`aud`.`user_first_name` AS `user_first_name`,`aud`.`user_last_name` AS `user_last_name`,`aud`.`mail_id_ofc` AS `mail_id_ofc`,`aud`.`mail_id_personal` AS `mail_id_personal`,`aud`.`mobile_no` AS `mobile_no`,`aud`.`phone_no` AS `phone_no`,`aud`.`dob_year` AS `dob_year`,`aud`.`dob_month` AS `dob_month`,`aud`.`dob_date` AS `dob_date`,`aud`.`doj_year` AS `doj_year`,`aud`.`doj_month` AS `doj_month`,`aud`.`doj_date` AS `doj_date`,`aud`.`id_type` AS `id_type`,`aud`.`id_number` AS `id_number`,`aud`.`father_name` AS `father_name`,`aud`.`father_mobile_no` AS `father_mobile_no`,`aud`.`home_phone_no` AS `home_phone_no`,`aud`.`address` AS `address`,`aud`.`blood_group` AS `blood_group`,`aud`.`created_by` AS `created_by`,`aud`.`created_date` AS `created_date`,`aud`.`disable_date` AS `disable_date`,`aud`.`disable_by` AS `disable_by`,`au`.`USER_ID` AS `USER_ID`,`au`.`USER_NAME` AS `USER_NAME`,`au`.`ENCRYTED_PASSWORD` AS `ENCRYTED_PASSWORD`,`au`.`ENABLED` AS `ENABLED` from (`app_user_details` `aud` left join `app_user` `au` on((`au`.`USER_ID` = `aud`.`USER_ID_ID`)));

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
