package com.haier.hop.ms.legcontract.domain;

import lombok.Data;

@Data
public class LegBCCJournal {

    private int id;

    //合同ID
    private Integer contractId;

    //JSON值
    private String JSONValue;

    //创建时间
    private String createTime;

    //BCC返回结果
    private String Represent;
}
