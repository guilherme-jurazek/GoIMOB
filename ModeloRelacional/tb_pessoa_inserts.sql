INSERT INTO `db_goimob`.`tb_pessoa`
(`pes_id`,
`pes_nome`,
`pes_data_nasc`,
`pes_rua`,
`pes_bairro`,
`pes_num`,
`pes_cep`,
`pes_uf`,
`pes_cidade`)
VALUES
(0, 'VICTOR', STR_TO_DATE( "18/09/1998", "%d/%m/%Y" ), 'SIQUEIRA', 'CENTRO', '72', '19645000', 'SP', 'NANTES');

SELECT * FROM db_goimob.tb_pessoa;