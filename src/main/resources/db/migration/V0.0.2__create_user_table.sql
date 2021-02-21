create table users
(
    id         bigint not null auto_increment,
    created    datetime,
    status     varchar(255),
    updated    datetime,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    password   varchar(255),
    username   varchar(255),
    primary key (id)
) engine=MyISAM;

alter table user_roles
    add constraint FKh8ciramu9cc9q3qcqiv4ue8a6
        foreign key (role_id)
            references roles (id);

alter table user_roles
    add constraint FKhfh9dx7w3ubf1co1vdev94g3f
        foreign key (user_id)
            references users (id);

    