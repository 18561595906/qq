package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegDzqzSync;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Auto-generated: 2020-06-02 17:28:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class DZQZDto extends LegDzqzSync {
    private String htName;
    private String system;
    private String url;
    private String pdfbase64;
    private List<Signer> signerList;
    private Sender sender;
    private String ukType;
    private String cusCode;
    private int start;
    private String userName;
    private Map signerMap;

    public String getHtName() {
        return htName;
    }

    public void setHtName(String htName) {
        this.htName = htName;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPdfbase64() {
        return pdfbase64;
    }

    public void setPdfbase64(String pdfbase64) {
        this.pdfbase64 = pdfbase64;
    }

    public List<Signer> getSignerList() {
        return signerList;
    }

    public void setSignerList(List<Signer> signerList) {
        this.signerList = signerList;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getUkType() {
        return ukType;
    }

    public void setUkType(String ukType) {
        this.ukType = ukType;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public Map getSignerMap() {
        return signerMap;
    }

    public void setSignerMap(Map signerMap) {
        this.signerMap = signerMap;
    }

}
