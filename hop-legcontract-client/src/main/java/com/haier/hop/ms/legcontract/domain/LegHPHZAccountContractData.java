package com.haier.hop.ms.legcontract.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
public class LegHPHZAccountContractData {
    //海尔方
    private String haierSide;

    //账期客户
    private String orderCodecustomerName;

    //合同名称
    private String contractName;

    //合同编号
    private String contractCode;

    //签约时间
    private String signDate;

    //合同有效期
    private String effectiveDate;

    //合同URL
    private String contractURL;

    //合同开始时间，方便前端变更合同有效期
    private String beginDate;

    //合同结束时间，方便前端变更合同有效期
    private String endData;

    //是否超期
    private String isOverdue;
}
