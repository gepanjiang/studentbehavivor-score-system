/*
Navicat MySQL Data Transfer

Source Server         : local_mySQL
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : ssm_xsrcxwpfxt

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2019-03-21 12:46:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` varchar(255) NOT NULL,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `realname` varchar(255) default NULL,
  `contact` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', 'admin', 'admin', '-');

-- ----------------------------
-- Table structure for `bonus`
-- ----------------------------
DROP TABLE IF EXISTS `bonus`;
CREATE TABLE `bonus` (
  `bonusid` varchar(255) NOT NULL,
  `teacherid` varchar(255) default NULL,
  `studentid` varchar(255) default NULL,
  `programsid` varchar(255) default NULL,
  `reason` varchar(255) default NULL,
  `num` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`bonusid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bonus
-- ----------------------------
INSERT INTO `bonus` VALUES ('B20190320224825830', 'T20190320183510248', 'S20190320185204883', 'P20190320185618654', '123123', '1', '2019-03-20', '123123');
INSERT INTO `bonus` VALUES ('B20190321024725996', 'T20190320183510248', 'S20190320185204883', 'P20190320185618654', '222', '2', '2019-03-21', '222');
INSERT INTO `bonus` VALUES ('B20190321024732555', 'T20190320183510248', 'S20190320185204883', 'P20190320185559992', '222', '1', '2019-03-21', '11');
INSERT INTO `bonus` VALUES ('B20190321024740293', 'T20190320183510248', 'S20190320185141629', 'P20190320185346555', '333', '3', '2019-03-21', '333');
INSERT INTO `bonus` VALUES ('B20190321124126566', 'T20190321123635243', 'S20190321123935419', 'P20190320185618654', '123123', '1', '2019-03-21', '123123');
INSERT INTO `bonus` VALUES ('B20190321124135621', 'T20190321123635243', 'S20190321123911268', 'P20190320185559992', '123123', '2', '2019-03-21', '123123');

-- ----------------------------
-- Table structure for `clazz`
-- ----------------------------
DROP TABLE IF EXISTS `clazz`;
CREATE TABLE `clazz` (
  `clazzid` varchar(255) NOT NULL,
  `clazzname` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`clazzid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clazz
-- ----------------------------
INSERT INTO `clazz` VALUES ('C20190320183434312', '1701班', '1701班');
INSERT INTO `clazz` VALUES ('C20190321123750342', '1702班', '1702班');

-- ----------------------------
-- Table structure for `dedu`
-- ----------------------------
DROP TABLE IF EXISTS `dedu`;
CREATE TABLE `dedu` (
  `deduid` varchar(255) NOT NULL,
  `teacherid` varchar(255) default NULL,
  `studentid` varchar(255) default NULL,
  `programsid` varchar(255) default NULL,
  `reason` varchar(255) default NULL,
  `num` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`deduid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dedu
-- ----------------------------
INSERT INTO `dedu` VALUES ('D20190320225436851', 'T20190320183510248', 'S20190320185141629', 'P20190320185618654', '234234', '2', '2019-03-20', '123123');
INSERT INTO `dedu` VALUES ('D20190321024752678', 'T20190320183510248', 'S20190320185113755', 'P20190320185346555', '111', '1', '2019-03-21', '111');
INSERT INTO `dedu` VALUES ('D20190321124145187', 'T20190321123635243', 'S20190321123847106', 'P20190320185407478', '123123', '1', '2019-03-21', '123123');
INSERT INTO `dedu` VALUES ('D20190321124155230', 'T20190321123635243', 'S20190321123820690', 'P20190320185536418', '123123', '2', '2019-03-21', '2');

-- ----------------------------
-- Table structure for `marks`
-- ----------------------------
DROP TABLE IF EXISTS `marks`;
CREATE TABLE `marks` (
  `marksid` varchar(255) NOT NULL,
  `teacherid` varchar(255) default NULL,
  `studentid` varchar(255) default NULL,
  `score` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`marksid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of marks
-- ----------------------------
INSERT INTO `marks` VALUES ('M20190321024002604', 'T20190320183510248', 'S20190320185204883', '62.0', '2019-03-21', '123');
INSERT INTO `marks` VALUES ('M20190321024602492', 'T20190320183510248', 'S20190320185141629', '80.0', '2019-03-21', '234');
INSERT INTO `marks` VALUES ('M20190321024633276', 'T20190320183510248', 'S20190320185113755', '56.0', '2019-03-21', '234');
INSERT INTO `marks` VALUES ('M20190321124025531', 'T20190321123635243', 'S20190321123935419', '84.0', '2019-03-21', '-');
INSERT INTO `marks` VALUES ('M20190321124031242', 'T20190321123635243', 'S20190321123911268', '62.0', '2019-03-21', '123123');
INSERT INTO `marks` VALUES ('M20190321124051732', 'T20190321123635243', 'S20190321123847106', '45.0', '2019-03-21', '123123');
INSERT INTO `marks` VALUES ('M20190321124109572', 'T20190321123635243', 'S20190321123820690', '67.0', '2019-03-21', '123123');

-- ----------------------------
-- Table structure for `programs`
-- ----------------------------
DROP TABLE IF EXISTS `programs`;
CREATE TABLE `programs` (
  `programsid` varchar(255) NOT NULL,
  `title` varchar(255) default NULL,
  `contents` varchar(255) default NULL,
  `standards` varchar(255) default NULL,
  `weights` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  `bas` varchar(255) default NULL,
  `themax` varchar(255) default NULL,
  `themin` varchar(255) default NULL,
  PRIMARY KEY  (`programsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of programs
-- ----------------------------
INSERT INTO `programs` VALUES ('P20190320185235652', '政治思想', '热爱祖国，热爱中国共产党，坚持四项基原则，拥护党的路线方针和政策，关心国家大事，关心时事政治，认真上好思想政治教育课，积极参加主题班会和活动，积极上进，是非清楚，爱憎分明。', '基本分6分，满分10分。表现好的加1-4分，表现不好的减1-6分。凡有反对党的路线、方针、政策等行为的学生，日常行为评定不0分。', '0.1', '-', '2019-03-20', '6', '10', '0');
INSERT INTO `programs` VALUES ('P20190320185304116', '道德品质', '待人诚恳谦虚，讲究礼貌，尊敬师长，团结同学，学雷锋做好事，助人为乐，拾金不昧，诚实守信，积极参加班级和学院建设。', '基本分10分，满分20分。表现好的加1-10分，表现不好的加1-10分，学期内有考试作弊者，此项成绩减为零分。', '0.2', '-', '2019-03-20', '10', '20', '0');
INSERT INTO `programs` VALUES ('P20190320185346555', '文明行为', '遵守《学生手册》中相关规定。言谈健康，举止文明，衣着整洁，朴素大方。尊重他人人格，尊重他人劳动成果，不打架，不骂人，服从管理，不损坏公物，不传看反动、黄色等违禁书刊。不酗酒、不赌博。', '基本分10分，满分20分。表现好的加1-10分，表现不好的加1-10分；凡在校期间因行为恶劣、造成极坏影响的，此项成绩减为零分。', '0.2', '-', '2019-03-20', '10', '20', '0');
INSERT INTO `programs` VALUES ('P20190320185407478', '集体观念', '关心集体，热爱集体。自觉维护集体荣誉，主动为学校 和班级建设出主意、想办法、做好事。关心同学进步，热心学校和班级的社会工作，积极参加学校组织的各项活动。在校外能自觉维护学校荣誉。', '基本分5分，满分10分。表现好的加1-5分，表现不好的减1-5分。凡为班级争得荣誉或参加校级活动者，给予加分。', '0.1', '-', '2019-03-20', '5', '10', '0');
INSERT INTO `programs` VALUES ('P20190320185536418', '学习态度和成绩', '学习目的明确，学习态度端正，热爱专业，勤奋好学，有良好的学习习惯。上课专心听讲，不做与上课无关的事，不玩手机等电子产品。不迟到，不早退，不旷课。按时独立完成作业，认真参加实验、实习、设计等教学环节，不断巩固提高学习成绩和动手能力。', '基本分5分，满分10分。凡表现好的加1-5分，表现不好的减1-5分。', '0.1', '-', '2019-03-20', '5', '10', '0');
INSERT INTO `programs` VALUES ('P20190320185559992', '遵纪守法', '遵守国家法律，遵守社会公共道德和秩序，遵守《学生 手册》 ，遵守学校各项规章制度；遵守食堂秩序、会场 秩序、问题活动秩序和校园活动秩序。', '基本分20分。表现不好的减分。凡有一般违纪的，每件次减1-2分；受通报批评的，每件次减5分；受警告、严重警告、记过处分的，每件次减10分，受留校察看处分的，每件次减15分。凡在校期间因行为恶劣、造成极坏影响的，此项成绩可减为零分。', '0.2', '-', '2019-03-20', '20', '20', '0');
INSERT INTO `programs` VALUES ('P20190320185618654', '团结协作', '有较好的人际沟通能力和协作精神，能够较好地处理师 生之间、同学之间发生的矛盾，有组织完成各项集体活 动、大型课业的能力，有较强的适应社会发展、满足职 业人要求的能力。', '基本分6分，满分10分。表现好的加1-4分，表现不好的减1-6分。', '0.1', '-', '2019-03-20', '6', '10', '0');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentid` varchar(255) NOT NULL,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `realname` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `birthday` varchar(255) default NULL,
  `minzu` varchar(255) default NULL,
  `jiguan` varchar(255) default NULL,
  `contact` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `clazzid` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  `addtime` varchar(255) default NULL,
  PRIMARY KEY  (`studentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('S20190320185113755', '0000001', '000000', '张吉惟', '男', '2019-03-20', '汉族', '辽宁大连', '123123', '123123', 'C20190320183434312', '123123', '2019-03-20');
INSERT INTO `student` VALUES ('S20190320185141629', '0000002', '000000', '林国瑞', '男', '2019-03-20', '汉族', '辽宁大连', '123123', '123123', 'C20190320183434312', '林国瑞', '2019-03-20');
INSERT INTO `student` VALUES ('S20190320185204883', '0000003', '000000', '林玟书', '男', '2019-03-20', '汉族', '辽宁大连', '123123', '123123', 'C20190320183434312', '林玟书', '2019-03-20');
INSERT INTO `student` VALUES ('S20190321123820690', '0000004', '000000', '林雅南', '女', '2019-03-21', '汉族', '辽宁大连', '123123', '123123', 'C20190321123750342', '123123', '2019-03-21');
INSERT INTO `student` VALUES ('S20190321123847106', '0000005', '000000', '江奕云', '男', '2019-03-21', '汉族', '辽宁大连', '123123', '123123', 'C20190321123750342', '123123', '2019-03-21');
INSERT INTO `student` VALUES ('S20190321123911268', '0000006', '000000', '刘柏宏', '男', '2019-03-21', '汉族', '辽宁大连', '123123', '123123', 'C20190321123750342', '123123', '2019-03-21');
INSERT INTO `student` VALUES ('S20190321123935419', '0000007', '000000', '阮建安', '男', '2019-03-21', '汉族', '辽宁大连', '123123', '123123', 'C20190321123750342', '123123', '2019-03-21');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacherid` varchar(255) NOT NULL,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `realname` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `birthday` varchar(255) default NULL,
  `contact` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `workdate` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`teacherid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('T20190320183510248', 'zhangsan', 'zhangsan', '张三', '男', '2019-03-20', '123123', '123123', '2019-03-20', '123123');
INSERT INTO `teacher` VALUES ('T20190320183529293', 'lisi', 'lisi', '李四', '女', '2019-03-20', '234234', '234234', '2019-03-20', '234234');
INSERT INTO `teacher` VALUES ('T20190321123635243', 'wangwu', 'wangwu', '王五', '男', '2019-03-21', '123123', '123123', '2019-03-21', '123123');
