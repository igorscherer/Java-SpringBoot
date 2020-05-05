drop table if exists Jogo;

create table Jogo(
    id_jogo bigint auto_increment,
    nome varchar(100) not null,
    estilo varchar(100) not null,
    idade_recomendada int not null,
    perspectiva varchar(200) not null,
    resumo varchar (500),
    primary key(id_jogo)
    );

