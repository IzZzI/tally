package com.zhouzy.tally.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 记账实体类
 */

@Entity
public class Tally implements Serializable {
    /**
     * 账单类型
     */
    @Column(name = "type")
    private String type;
    /**
     * 金额
     */
    @Column(name = "money")
    private double money;

    /**
     * 账单时间
     */
    @Column(name = "time")
    private String time;

    /**
     * 创建时间
     */
    @Id
    @Column(name = "create_time")
    @CreatedDate
    private String createTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
