package com.haier.hop.ms.legcontract.dto;

import java.util.Date;
import java.util.List;

public class GpmsDto {

    private String appliy_id;
    private String appliy_name;
    private String contract_id;
    private String contract_name;
    private String contract_type1_sn;
    private String contract_type2_sn;
    private String contract_code;
    private String url;
    private String proc_id;
    private String contract_gpms_type;
    private String contract_channel;
    private Date begin_date;
    private Date end_date;
    private List<HacDto> hacdtos;
    private byte[] filecontent;

    public String getAppliy_name() {
        return appliy_name;
    }

    public void setAppliy_name(String appliy_name) {
        this.appliy_name = appliy_name;
    }

    public String getAppliy_id() {
        return appliy_id;
    }

    public void setAppliy_id(String appliy_id) {
        this.appliy_id = appliy_id;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getContract_type1_sn() {
        return contract_type1_sn;
    }

    public void setContract_type1_sn(String contract_type1_sn) {
        this.contract_type1_sn = contract_type1_sn;
    }

    public String getContract_type2_sn() {
        return contract_type2_sn;
    }

    public void setContract_type2_sn(String contract_type2_sn) {
        this.contract_type2_sn = contract_type2_sn;
    }

    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProc_id() {
        return proc_id;
    }

    public void setProc_id(String proc_id) {
        this.proc_id = proc_id;
    }

    public String getContract_gpms_type() {
        return contract_gpms_type;
    }

    public void setContract_gpms_type(String contract_gpms_type) {
        this.contract_gpms_type = contract_gpms_type;
    }

    public String getContract_channel() {
        return contract_channel;
    }

    public void setContract_channel(String contract_channel) {
        this.contract_channel = contract_channel;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<HacDto> getHacdtos() {
        return hacdtos;
    }

    public void setHacdtos(List<HacDto> hacdtos) {
        this.hacdtos = hacdtos;
    }

    public byte[] getFilecontent() {
        return filecontent;
    }

    public void setFilecontent(byte[] filecontent) {
        this.filecontent = filecontent;
    }

    @Override
    public String toString() {
        return "{" +
                "appliy_id='" + appliy_id + '\'' +
                ", contract_id='" + contract_id + '\'' +
                ", contract_name='" + contract_name + '\'' +
                ", contract_type1_sn='" + contract_type1_sn + '\'' +
                ", contract_type2_sn='" + contract_type2_sn + '\'' +
                ", contract_code='" + contract_code + '\'' +
                ", url='" + url + '\'' +
                ", proc_id='" + proc_id + '\'' +
                ", contract_gpms_type='" + contract_gpms_type + '\'' +
                ", contract_channel='" + contract_channel + '\'' +
                ", begin_date=" + begin_date +
                ", end_date=" + end_date +
                '}';
    }
}
