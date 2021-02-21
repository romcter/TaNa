INSERT INTO kotlin.users (id, created, status, updated, email, first_name, last_name, password, username)
VALUES (1, '2021-02-21 13:36:42', 'ACTIVE', '2021-02-21 13:36:59', '1@gmail.com', '1', '1',
        '$2y$04$WqDujeug7ANs.5LS.K/Fru7Btt5O4p/GHlf75Ud7WoR8/c2R7tcDi', '1');

INSERT INTO kotlin.users (id, created, status, updated, email, first_name, last_name, password, username)
VALUES (2, '2021-02-21 13:38:43', 'ACTIVE', '2021-02-21 13:38:55', '2@gmail.com', '2', '2',
        '$2y$04$OU.9wsD8xtR90iwDzHP.peOgjcHw0X0G928p5hhsCbXfnfPlZAHZ.', '2');

INSERT INTO kotlin.roles (id, created, status, updated, name)
VALUES (1, '2021-02-21 13:41:12', 'ACTIVE', '2021-02-21 13:41:20', 'USER');

INSERT INTO kotlin.roles (id, created, status, updated, name)
VALUES (2, '2021-02-21 13:41:34', 'ACTIVE', '2021-02-21 13:41:41', 'ADMIN');

INSERT INTO kotlin.user_roles (user_id, role_id)
VALUES (1, 1);

INSERT INTO kotlin.user_roles (user_id, role_id)
VALUES (1, 2);

INSERT INTO kotlin.user_roles (user_id, role_id)
VALUES (2, 1);