package com.haier.hop.ms.legcontract.dto;

import java.util.Date;

public class PlateRatioDto {
    private Date begin;
    private Date end;
    private String bizcode;
    private String bizname;
    private int total;
    private int fei;
    private int biao;
    private int an;

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getBizcode() {
        return bizcode;
    }

    public void setBizcode(String bizcode) {
        this.bizcode = bizcode;
    }

    public String getBizname() {
        return bizname;
    }

    public void setBizname(String bizname) {
        this.bizname = bizname;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getFei() {
        return fei;
    }

    public void setFei(int fei) {
        this.fei = fei;
    }

    public int getBiao() {
        return biao;
    }

    public void setBiao(int biao) {
        this.biao = biao;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

}
