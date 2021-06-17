package com.rjgc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zhaoyunjie
 * @date 2021-04-08 16:59
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderFamily {

    @JSONField(name = "order_id")
    private int orderId;

    @JSONField(name = "family_id")
    private int familyId;

    @JSONField(name = "update_time")
    private Timestamp updateTime;
}
