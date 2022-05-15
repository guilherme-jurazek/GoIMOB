-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_goimob
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_goimob` ;

-- -----------------------------------------------------
-- Schema db_goimob
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_goimob` ;
USE `db_goimob` ;

-- -----------------------------------------------------
-- Table `db_goimob`.`tb_usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_usuario` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_usuario` (
  `usu_id` INT NOT NULL AUTO_INCREMENT,
  `usu_email` VARCHAR(90) NOT NULL,
  `usu_senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usu_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_promocao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_promocao` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_promocao` (
  `promo_id` INT NOT NULL AUTO_INCREMENT,
  `promo_nome` VARCHAR(90) NOT NULL,
  `promo_promocao` LONGTEXT NOT NULL,
  `promo_foto` VARCHAR(90) NOT NULL,
  `promo_link` VARCHAR(90) NOT NULL,
  `promo_ativa` TINYINT NOT NULL,
  PRIMARY KEY (`promo_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_tipo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_tipo` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_tipo` (
  `tipo_id` INT NOT NULL,
  `tipo_nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`tipo_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_produto` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_produto` (
  `prod_id` INT NOT NULL,
  `prod_nome` VARCHAR(90) NOT NULL,
  `prod_foto` VARCHAR(90) NULL,
  `prod_descricao` LONGTEXT NULL,
  `prod_preco` DECIMAL(12,4) NOT NULL,
  `tb_tipo_tipo_id` INT NOT NULL,
  PRIMARY KEY (`prod_id`),
  INDEX `fk_tb_produto_tb_tipo_idx` (`tb_tipo_tipo_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_produto_tb_tipo`
    FOREIGN KEY (`tb_tipo_tipo_id`)
    REFERENCES `db_goimob`.`tb_tipo` (`tipo_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_autor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_autor` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_autor` (
  `autor_id` INT NOT NULL AUTO_INCREMENT,
  `autor_nome` VARCHAR(90) NOT NULL,
  PRIMARY KEY (`autor_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_categoria` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_categoria` (
  `tipo_id` INT NOT NULL AUTO_INCREMENT,
  `tipo_descricao` LONGTEXT NOT NULL,
  PRIMARY KEY (`tipo_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_frase`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_frase` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_frase` (
  `frase_id` INT NOT NULL AUTO_INCREMENT,
  `frase` LONGTEXT NOT NULL,
  `autor_fk_id` INT NOT NULL,
  `categoria_fk_id` INT NOT NULL,
  PRIMARY KEY (`frase_id`),
  INDEX `fk_tb_frase_tb_autor1_idx` (`autor_fk_id` ASC) VISIBLE,
  INDEX `fk_tb_frase_tb_categoria1_idx` (`categoria_fk_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_frase_tb_autor1`
    FOREIGN KEY (`autor_fk_id`)
    REFERENCES `db_goimob`.`tb_autor` (`autor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_frase_tb_categoria1`
    FOREIGN KEY (`categoria_fk_id`)
    REFERENCES `db_goimob`.`tb_categoria` (`tipo_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_usuario` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_usuario` (
  `usu_id` INT NOT NULL AUTO_INCREMENT,
  `usu_email` VARCHAR(90) NOT NULL,
  `usu_senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usu_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_pessoa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_pessoa` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_pessoa` (
  `pes_id` INT NOT NULL AUTO_INCREMENT,
  `pes_nome` VARCHAR(90) NOT NULL,
  PRIMARY KEY (`pes_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `db_goimob`.`tb_telefone`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_goimob`.`tb_telefone` ;

CREATE TABLE IF NOT EXISTS `db_goimob`.`tb_telefone` (
  `pes_fk_id` INT NOT NULL,
  `tel_ddd` INT NOT NULL,
  `tel_num` INT NOT NULL,
  PRIMARY KEY (`pes_fk_id`),
  CONSTRAINT `fk_tb_telefone_tb_pessoa1`
    FOREIGN KEY (`pes_fk_id`)
    REFERENCES `db_goimob`.`tb_pessoa` (`pes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
