drop table IF EXISTS user;

create table IF NOT EXISTS user(
    id int(11) NOT NULl AUTO_INCREMENT,
    username VARCHAR(25) NOT NULL COMMENT '用户名',
    password VARCHAR(25) NOT NULL COMMENT '密码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (id)
    )ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
insert into user(username,password) values ("zzg","halojeff");
insert into user(username,password) values ("root","openthedoor");
