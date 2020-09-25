package com.haier.hop.ms.legcontract.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class LegHPHZOrderData {

    private int id;

    //海尔方
    private String haierSide;

    //账期客户名称
    private String orderCodecustomerName;

    //订单编号
    private String orderCode;

    //订单金额
    private String orderAM;

    //发货时间
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private String orderDate;

    //是否付款 0：未付 1：已付
    private String paid;

    //最长应付款时间 发货时间+90天，如果当前时间超过了这个时间，就是逾期
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private String maxDate;

    //是否逾期
    private String timeOut;

    private String receivable;

}
