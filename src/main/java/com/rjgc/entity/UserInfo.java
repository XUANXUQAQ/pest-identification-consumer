package com.rjgc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zhaoyunjie
 * @date 2021-04-09 22:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    int id;

    @JSONField(name = "username")
    private String username;

    @JSONField(name = "password")
    private String password;

    @JSONField(name = "role")
    private String role;

    @JSONField(name = "update_time")
    private Timestamp updateTime;
}
