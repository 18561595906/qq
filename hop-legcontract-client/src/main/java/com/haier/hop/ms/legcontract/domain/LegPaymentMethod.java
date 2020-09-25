package com.haier.hop.ms.legcontract.domain;

import lombok.Data;

@Data
public class LegPaymentMethod {

    private int id;

    //支付方式编码
    private String payTypeCode;

    //支付方式名称
    private String payTypeName;

    //更新时间
    private String updateTime;

    //更新人名称
    private String updateUser;


}
