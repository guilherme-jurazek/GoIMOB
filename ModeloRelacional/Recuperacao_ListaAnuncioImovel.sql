SELECT 
imov_proprietario,
imov_bairro,
imov_cidade,
imov_valor,
anun_tipo,
anun_status
FROM tb_imovel 
INNER JOIN tb_anuncio_imovel ON imov_id = imov_fk_id;