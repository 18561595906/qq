package com.haier.hop.ms.legcontract.dto;

public class MecDto {
    private int contract_num;
    private String contract_amount;
    private String signed_jia;
    private String jia_name;
    private String signed_yi;
    private String yi_name;
    private String system_flag;
    private String applier_id;
    private String applier_name;
    private String file_name;
    private String file_url;
    private String mec_contract_code;
    private int translate_flag;
    private int if_moju;
    private String old_cont_no;
    public void setContract_num(int contract_num) {
        this.contract_num = contract_num;
    }
    public int getContract_num() {
        return contract_num;
    }

    public void setContract_amount(String contract_amount) {
        this.contract_amount = contract_amount;
    }
    public String getContract_amount() {
        return contract_amount;
    }

    public void setSigned_jia(String signed_jia) {
        this.signed_jia = signed_jia;
    }
    public String getSigned_jia() {
        return signed_jia;
    }

    public void setJia_name(String jia_name) {
        this.jia_name = jia_name;
    }
    public String getJia_name() {
        return jia_name;
    }

    public void setSigned_yi(String signed_yi) {
        this.signed_yi = signed_yi;
    }
    public String getSigned_yi() {
        return signed_yi;
    }

    public void setYi_name(String yi_name) {
        this.yi_name = yi_name;
    }
    public String getYi_name() {
        return yi_name;
    }

    public void setSystem_flag(String system_flag) {
        this.system_flag = system_flag;
    }
    public String getSystem_flag() {
        return system_flag;
    }

    public void setApplier_id(String applier_id) {
        this.applier_id = applier_id;
    }
    public String getApplier_id() {
        return applier_id;
    }

    public void setApplier_name(String applier_name) {
        this.applier_name = applier_name;
    }
    public String getApplier_name() {
        return applier_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
    public String getFile_name() {
        return file_name;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }
    public String getFile_url() {
        return file_url;
    }

    public void setMec_contract_code(String mec_contract_code) {
        this.mec_contract_code = mec_contract_code;
    }
    public String getMec_contract_code() {
        return mec_contract_code;
    }

    public void setTranslate_flag(int translate_flag) {
        this.translate_flag = translate_flag;
    }
    public int getTranslate_flag() {
        return translate_flag;
    }

    public void setIf_moju(int if_moju) {
        this.if_moju = if_moju;
    }
    public int getIf_moju() {
        return if_moju;
    }

    public void setOld_cont_no(String old_cont_no) {
        this.old_cont_no = old_cont_no;
    }
    public String getOld_cont_no() {
        return old_cont_no;
    }
}
