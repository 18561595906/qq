package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;

public class UseSealFile {
    private String rowId;
    //用印文件名
    private String fileName;
    //文件页数
    private BigDecimal page;
    //文件份数
    private BigDecimal fileCount;
    //用印个数
    private BigDecimal sealCount;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BigDecimal getPage() {
        return page;
    }

    public void setPage(BigDecimal page) {
        this.page = page;
    }

    public BigDecimal getFileCount() {
        return fileCount;
    }

    public void setFileCount(BigDecimal fileCount) {
        this.fileCount = fileCount;
    }

    public BigDecimal getSealCount() {
        return sealCount;
    }

    public void setSealCount(BigDecimal sealCount) {
        this.sealCount = sealCount;
    }
}
