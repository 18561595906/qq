package com.haier.hop.ms.legcontract.domain;


import java.util.Date;

public class SupplierSelectDto {
    private String unit;
    private String applySn;
    private String contName;
    private Date begin;
    private Date end;
    private int currentPage;
    private int pageSize;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getApplySn() {
        return applySn;
    }

    public void setApplySn(String applySn) {
        this.applySn = applySn;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
