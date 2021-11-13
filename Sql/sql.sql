CREATE TABLE `springbootangularecom`.`products` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` double NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `created_at` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
  `login_token` TEXT(100) NULL,
  `type` INT(11) NULL DEFAULT NULL,
  `address` TEXT(100) NULL,
  `is_email_varified` INT(11) NULL DEFAULT NULL,
  `mobile` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`));
