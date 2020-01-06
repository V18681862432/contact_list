
# contact_list
# This is a Java address book Lesson.
# Using spring MVC + jdbc Technology.
# It's suitable for novices to practice. 
# There are many parts that are not enough.
# The time is too short. 
# Only half a day to complete the hope of understanding

/**
 * create table user(
 * id int auto_increment not null,
 * name varchar(15) not null,
 * address varchar(30) not null,
 * number varchar(11) not null,
 * postid int(6) not null,
 * primary key(id)
 * )engine=innodb,charset=utf8;
 */
/**
 * create table admin(
 * admin_id int auto_increment not null,
 * admin_name varchar(15) not null,
 * admin_password varchar(30) not null,
 * primary key(admin_id)
 * )engine=innodb,charset=utf8;
 */

/**
 * test case 
 * insert into user (name,address,number,postid,email) values ('victor1','陕西2','13000000002','710605', 'a@gmail.com');
 * insert into user (name,address,number,postid,email) values ('victor2','陕西5','13000000001','710602', 'e@gmail.com');
 * insert into user (name,address,number,postid,email) values ('victor3','陕西3','13000000003','710604', 'c@gmail.com');
 * insert into user (name,address,number,postid,email) values ('victor4','陕西1','13000000005','710601','b@gmail.com');
 * insert into user (name,address,number,postid,email) values ('victor5','陕西4','13000000004','710604', 'd@gmail.com');
 */
