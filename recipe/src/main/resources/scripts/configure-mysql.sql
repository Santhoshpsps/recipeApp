## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name pspsmysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE psps_dev;
CREATE DATABASE psps_qa;
CREATE DATABASE psps_prod;


#Create database service accounts
CREATE USER 'psps_dev_user'@'localhost' IDENTIFIED BY 'psps';
CREATE USER 'psps_prod_user'@'localhost' IDENTIFIED BY 'psps';
CREATE USER 'psps_dev_user'@'%' IDENTIFIED BY 'psps';
CREATE USER 'psps_prod_user'@'%' IDENTIFIED BY 'psps';

#Database grants
GRANT SELECT ON psps_dev.* to 'psps_dev_user'@'localhost';
GRANT INSERT ON psps_dev.* to 'psps_dev_user'@'localhost';
GRANT DELETE ON psps_dev.* to 'psps_dev_user'@'localhost';
GRANT UPDATE ON psps_dev.* to 'psps_dev_user'@'localhost';

GRANT SELECT ON psps_qa.* to 'psps_qa_user'@'localhost';
GRANT INSERT ON psps_qa.* to 'psps_qa_user'@'localhost';
GRANT DELETE ON psps_qa.* to 'psps_qa_user'@'localhost';
GRANT UPDATE ON psps_qa.* to 'psps_qa_user'@'localhost';

GRANT SELECT ON psps_prod.* to 'psps_prod_user'@'localhost';
GRANT INSERT ON psps_prod.* to 'psps_prod_user'@'localhost';
GRANT DELETE ON psps_prod.* to 'psps_prod_user'@'localhost';
GRANT UPDATE ON psps_prod.* to 'psps_prod_user'@'localhost';

GRANT SELECT ON psps_dev.* to 'psps_dev_user'@'%';
GRANT INSERT ON psps_dev.* to 'psps_dev_user'@'%';
GRANT DELETE ON psps_dev.* to 'psps_dev_user'@'%';
GRANT UPDATE ON psps_dev.* to 'psps_dev_user'@'%';

GRANT SELECT ON psps_qa.* to 'psps_qa_user'@'%';
GRANT INSERT ON psps_qa.* to 'psps_qa_user'@'%';
GRANT DELETE ON psps_qa.* to 'psps_qa_user'@'%';
GRANT UPDATE ON psps_qa.* to 'psps_qa_user'@'%';

GRANT SELECT ON psps_prod.* to 'psps_prod_user'@'%';
GRANT INSERT ON psps_prod.* to 'psps_prod_user'@'%';
GRANT DELETE ON psps_prod.* to 'psps_prod_user'@'%';
GRANT UPDATE ON psps_prod.* to 'psps_prod_user'@'%';