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
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `NIF` INT(10) NULL DEFAULT NULL,
  `Email` VARCHAR(255) NULL DEFAULT NULL,
  `Password` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`canal` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `ClienteID` INT(10) NOT NULL,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `-canaisCliente` (`ClienteID` ASC),
  CONSTRAINT `-canaisCliente`
    FOREIGN KEY (`ClienteID`)
    REFERENCES `digitalsignage`.`cliente` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`tipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`tipo` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`conteudo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`conteudo` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `TipoID` INT(10) NOT NULL,
  `CanalID` INT(10) NOT NULL,
  `Duracao` TIME NULL DEFAULT NULL,
  `Reproducoes` INT(10) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `-conteudosCanal` (`CanalID` ASC),
  INDEX `-tipoConteudo` (`TipoID` ASC),
  CONSTRAINT `-conteudosCanal`
    FOREIGN KEY (`CanalID`)
    REFERENCES `digitalsignage`.`canal` (`ID`),
  CONSTRAINT `-tipoConteudo`
    FOREIGN KEY (`TipoID`)
    REFERENCES `digitalsignage`.`tipo` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`rede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`rede` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `ClienteID` INT(10) NOT NULL,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `-redesCliente` (`ClienteID` ASC),
  CONSTRAINT `-redesCliente`
    FOREIGN KEY (`ClienteID`)
    REFERENCES `digitalsignage`.`cliente` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`player` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `CanalID` INT(10) NOT NULL,
  `RedeID` INT(10) NOT NULL,
  `Nome` VARCHAR(255) NULL DEFAULT NULL,
  `Descricao` VARCHAR(255) NULL DEFAULT NULL,
  `Tamanho` DOUBLE NOT NULL,
  `Estado` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `-playersRedes` (`RedeID` ASC),
  INDEX `-canalPlayer` (`CanalID` ASC),
  CONSTRAINT `-canalPlayer`
    FOREIGN KEY (`CanalID`)
    REFERENCES `digitalsignage`.`canal` (`ID`),
  CONSTRAINT `-playersRedes`
    FOREIGN KEY (`RedeID`)
    REFERENCES `digitalsignage`.`rede` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`coordenada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`coordenada` (
  `ID` INT(10) NOT NULL AUTO_INCREMENT,
  `PlayerID` INT(10) NOT NULL,
  `Latitude` DOUBLE NOT NULL,
  `Longitude` DOUBLE NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `-coordenadasPlayer` (`PlayerID` ASC),
  CONSTRAINT `-coordenadasPlayer`
    FOREIGN KEY (`PlayerID`)
    REFERENCES `digitalsignage`.`player` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`feedrss`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`feedrss` (
  `URL` VARCHAR(255) NULL DEFAULT NULL,
  `TipoID` INT(10) NOT NULL,
  PRIMARY KEY (`TipoID`),
  INDEX `FKFeedRSS466488` (`TipoID` ASC),
  CONSTRAINT `FKFeedRSS466488`
    FOREIGN KEY (`TipoID`)
    REFERENCES `digitalsignage`.`tipo` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`ficheiromultimedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`ficheiromultimedia` (
  `URL` VARCHAR(255) NULL DEFAULT NULL,
  `TipoID` INT(10) NOT NULL,
  PRIMARY KEY (`TipoID`),
  INDEX `FKFicheiroMu143820` (`TipoID` ASC),
  CONSTRAINT `FKFicheiroMu143820`
    FOREIGN KEY (`TipoID`)
    REFERENCES `digitalsignage`.`tipo` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `digitalsignage`.`previsaotempo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `digitalsignage`.`previsaotempo` (
  `URL` VARCHAR(255) NULL DEFAULT NULL,
  `TipoID` INT(10) NOT NULL,
  PRIMARY KEY (`TipoID`),
  INDEX `FKPrevisaoTe387940` (`TipoID` ASC),
  CONSTRAINT `FKPrevisaoTe387940`
    FOREIGN KEY (`TipoID`)
    REFERENCES `digitalsignage`.`tipo` (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
