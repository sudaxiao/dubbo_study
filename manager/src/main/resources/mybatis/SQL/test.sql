CREATE DATABASE manager;
use manager;
DROP TABLE IF EXISTS  `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `flowerName` varchar(255) DEFAULT NULL COMMENT '花名',
  `username` varchar(255) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `sex` VARCHAR (2) DEFAULT NULL COMMENT '性别',
  `phone` VARCHAR (11) DEFAULT NULL COMMENT '手机号',
  `email` VARCHAR (50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

INSERT INTO `user` VALUES (1,'苏打1','苏苏1',37,'女','1301301301','1301301301@qq.com');
INSERT INTO `user` VALUES (2,'苏打2','苏苏2',32,'男','1301301302','1301301302@qq.com');
INSERT INTO `user` VALUES (3,'苏打3','苏苏3',18,'女','1301301303','1301301303@qq.com');
INSERT INTO `user` VALUES (4,'苏打4','苏苏4',24,'男','1301301304','1301301304@qq.com');
INSERT INTO `user` VALUES (5,'苏打5','苏苏5',23,'女','1301301305','1301301305@qq.com');
INSERT INTO `user` VALUES (6,'苏打6','苏苏6',39,'男','1301301306','1301301306@qq.com');
INSERT INTO `user` VALUES (7,'苏打7','苏苏7',38,'女','1301301307','1301301307@qq.com');
INSERT INTO `user` VALUES (8,'苏打8','苏苏8',41,'男','1301301308','1301301308@qq.com');
INSERT INTO `user` VALUES (9,'苏打9','苏苏9',23,'女','1301301309','1301301309@qq.com');
INSERT INTO `user` VALUES (10,'苏打10','苏苏10',26,'男','13013013010','13013013010@qq.com');
INSERT INTO `user` VALUES (11,'苏打11','苏苏11',43,'女','13013013011','13013013011@qq.com');
INSERT INTO `user` VALUES (12,'苏打12','苏苏12',23,'男','13013013012','13013013012@qq.com');
INSERT INTO `user` VALUES (13,'苏打13','苏苏13',39,'女','13013013013','13013013013@qq.com');
INSERT INTO `user` VALUES (14,'苏打14','苏苏14',22,'男','13013013014','13013013014@qq.com');
INSERT INTO `user` VALUES (15,'苏打15','苏苏15',38,'女','13013013015','13013013015@qq.com');
INSERT INTO `user` VALUES (16,'苏打16','苏苏16',32,'男','13013013016','13013013016@qq.com');
INSERT INTO `user` VALUES (17,'苏打17','苏苏17',42,'女','13013013017','13013013017@qq.com');
INSERT INTO `user` VALUES (18,'苏打18','苏苏18',41,'男','13013013018','13013013018@qq.com');
INSERT INTO `user` VALUES (19,'苏打19','苏苏19',33,'女','13013013019','13013013019@qq.com');
INSERT INTO `user` VALUES (20,'苏打20','苏苏20',34,'男','13013013020','13013013020@qq.com');
INSERT INTO `user` VALUES (21,'苏打21','苏苏21',37,'女','13013013021','13013013021@qq.com');
INSERT INTO `user` VALUES (22,'苏打22','苏苏22',47,'男','13013013022','13013013022@qq.com');
INSERT INTO `user` VALUES (23,'苏打23','苏苏23',31,'女','13013013023','13013013023@qq.com');
INSERT INTO `user` VALUES (24,'苏打24','苏苏24',27,'男','13013013024','13013013024@qq.com');
INSERT INTO `user` VALUES (25,'苏打25','苏苏25',38,'女','13013013025','13013013025@qq.com');
INSERT INTO `user` VALUES (26,'苏打26','苏苏26',45,'男','13013013026','13013013026@qq.com');
INSERT INTO `user` VALUES (27,'苏打27','苏苏27',37,'女','13013013027','13013013027@qq.com');
INSERT INTO `user` VALUES (28,'苏打28','苏苏28',34,'男','13013013028','13013013028@qq.com');
INSERT INTO `user` VALUES (29,'苏打29','苏苏29',34,'女','13013013029','13013013029@qq.com');
INSERT INTO `user` VALUES (30,'苏打30','苏苏30',23,'男','13013013030','13013013030@qq.com');
INSERT INTO `user` VALUES (31,'苏打31','苏苏31',46,'女','13013013031','13013013031@qq.com');
INSERT INTO `user` VALUES (32,'苏打32','苏苏32',24,'男','13013013032','13013013032@qq.com');
INSERT INTO `user` VALUES (33,'苏打33','苏苏33',20,'女','13013013033','13013013033@qq.com');
INSERT INTO `user` VALUES (34,'苏打34','苏苏34',44,'男','13013013034','13013013034@qq.com');
INSERT INTO `user` VALUES (35,'苏打35','苏苏35',35,'女','13013013035','13013013035@qq.com');
INSERT INTO `user` VALUES (36,'苏打36','苏苏36',44,'男','13013013036','13013013036@qq.com');
INSERT INTO `user` VALUES (37,'苏打37','苏苏37',30,'女','13013013037','13013013037@qq.com');
INSERT INTO `user` VALUES (38,'苏打38','苏苏38',38,'男','13013013038','13013013038@qq.com');
INSERT INTO `user` VALUES (39,'苏打39','苏苏39',23,'女','13013013039','13013013039@qq.com');
INSERT INTO `user` VALUES (40,'苏打40','苏苏40',39,'男','13013013040','13013013040@qq.com');
INSERT INTO `user` VALUES (41,'苏打41','苏苏41',34,'女','13013013041','13013013041@qq.com');
INSERT INTO `user` VALUES (42,'苏打42','苏苏42',32,'男','13013013042','13013013042@qq.com');
INSERT INTO `user` VALUES (43,'苏打43','苏苏43',34,'女','13013013043','13013013043@qq.com');
INSERT INTO `user` VALUES (44,'苏打44','苏苏44',42,'男','13013013044','13013013044@qq.com');
INSERT INTO `user` VALUES (45,'苏打45','苏苏45',43,'女','13013013045','13013013045@qq.com');
INSERT INTO `user` VALUES (46,'苏打46','苏苏46',40,'男','13013013046','13013013046@qq.com');
INSERT INTO `user` VALUES (47,'苏打47','苏苏47',24,'女','13013013047','13013013047@qq.com');
INSERT INTO `user` VALUES (48,'苏打48','苏苏48',39,'男','13013013048','13013013048@qq.com');
INSERT INTO `user` VALUES (49,'苏打49','苏苏49',41,'女','13013013049','13013013049@qq.com');

DROP TABLE IF EXISTS  `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) DEFAULT NULL COMMENT '账户',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员信息';

INSERT INTO `admin` VALUES (1,'admin1','123456');
INSERT INTO `admin` VALUES (2,'admin2','123456');
INSERT INTO `admin` VALUES (3,'admin3','123456');
INSERT INTO `admin` VALUES (4,'admin4','123456');