package com.haier.hop.ms.legcontract.dto;

import java.util.List;

public class Signer {

    private String signerCode;
    private String signerName;
    private String signOrder;
    private String isHaierCompany;
    private List<String> keyWords ;
    public void setSignerCode(String signerCode) {
        this.signerCode = signerCode;
    }
    public String getSignerCode() {
        return signerCode;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }
    public String getSignerName() {
        return signerName;
    }

    public void setSignOrder(String signOrder) {
        this.signOrder = signOrder;
    }
    public String getSignOrder() {
        return signOrder;
    }

    public void setIsHaierCompany(String isHaierCompany) {
        this.isHaierCompany = isHaierCompany;
    }
    public String getIsHaierCompany() {
        return isHaierCompany;
    }

    public void setKeyWords (List<String> keyWord ) {
        this.keyWords  = keyWord ;
    }
    public List<String> getKeyWords () {
        return keyWords ;
    }

}