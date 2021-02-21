create table roles (
       id bigint not null auto_increment,
        created datetime,
        status varchar(255),
        updated datetime,
        name varchar(255),
        primary key (id)
) engine=MyISAM;

create table user_roles (
       user_id bigint not null,
        role_id bigint not null
    ) engine=MyISAM;