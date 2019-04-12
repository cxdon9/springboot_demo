package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_user")
public class User {
    @Id
    @KeySql(sql = "select SEQ_USER.nextval from dual", order = ORDER.BEFORE)
    private Integer usid;
    private String uname;
    private String pwd;
    //@Transient 作用在属性上  表示该属性不属于数据库中字段
    //@Column()  作用在属性上  指定数据库中的字段
}
