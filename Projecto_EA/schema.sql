-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema digitalsignage
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema digitalsignage
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `digitalsignage` DEFAULT CHARACTER SET utf8 ;
USE `digitalsignage` ;

-- -----------------------------------------------------
-- Table `digitalsignage`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`cliente` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `Email` VARCHAR(255) NULL DEFAULT NULL,
  `NIF` INT(11) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`canal` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `ClienteID` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FK_68pvawk4qp2cgi0lsa4750w77` (`ClienteID` ASC),
  CONSTRAINT `FK_68pvawk4qp2cgi0lsa4750w77`
    FOREIGN KEY (`ClienteID`)
    REFERENCES `digitalsignage`.`cliente` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`tipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`tipo` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`conteudo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`conteudo` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `CanalID` INT(11) NULL DEFAULT NULL,
  `TipoID` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FK_asugo312lua2gxlsf1kgt6gp4` (`CanalID` ASC),
  INDEX `FK_ne9rn9e8ur4v0rsc8kutqjgpd` (`TipoID` ASC),
  CONSTRAINT `FK_asugo312lua2gxlsf1kgt6gp4`
    FOREIGN KEY (`CanalID`)
    REFERENCES `digitalsignage`.`canal` (`ID`),
  CONSTRAINT `FK_ne9rn9e8ur4v0rsc8kutqjgpd`
    FOREIGN KEY (`TipoID`)
    REFERENCES `digitalsignage`.`tipo` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`coordenadas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`coordenadas` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`rede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`rede` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `ClienteID` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FK_9p8p8sueg0yfryifcg2qc29jw` (`ClienteID` ASC),
  CONSTRAINT `FK_9p8p8sueg0yfryifcg2qc29jw`
    FOREIGN KEY (`ClienteID`)
    REFERENCES `digitalsignage`.`cliente` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`player` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Estado` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `Tamanho` DOUBLE NOT NULL,
  `RedeID` INT(11) NULL DEFAULT NULL,
  `CanalID` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FK_n9dvu6m1cjufj54ljcd0awr7r` (`RedeID` ASC),
  INDEX `FK_3po6g357hgobh4msvgv1dvt4y` (`CanalID` ASC),
  CONSTRAINT `FK_3po6g357hgobh4msvgv1dvt4y`
    FOREIGN KEY (`CanalID`)
    REFERENCES `digitalsignage`.`canal` (`ID`),
  CONSTRAINT `FK_n9dvu6m1cjufj54ljcd0awr7r`
    FOREIGN KEY (`RedeID`)
    REFERENCES `digitalsignage`.`rede` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
