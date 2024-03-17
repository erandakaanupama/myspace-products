-- MySQL Script generated by MySQL Workbench
-- Fri Mar  1 18:45:38 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema myspaceproduct
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema myspaceproduct
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `myspaceproduct` DEFAULT CHARACTER SET utf8 ;
USE `myspaceproduct` ;

-- -----------------------------------------------------
-- Table `myspaceproduct`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myspaceproduct`.`category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `code` VARCHAR(45) NULL,
  `created_at` DATETIME NULL,
  `created_by` VARCHAR(45) NULL,
  `updated_at` DATETIME NULL,
  `updated_by` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;