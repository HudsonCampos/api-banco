CREATE TABLE If NOT EXISTS t_correntista (
    id_correntista int8 NOT NULL,
    nome VARCHAR (200) NOT NULL,
    cpf VARCHAR (11) NOT NULL UNIQUE,
    data_nascimento timestamp NOT NULL,    
    PRIMARY KEY (id_correntista)
)
