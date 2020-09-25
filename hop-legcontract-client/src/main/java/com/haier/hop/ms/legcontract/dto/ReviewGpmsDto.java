package com.haier.hop.ms.legcontract.dto;

import java.util.List;

public class ReviewGpmsDto {

    private String pro_id;
    private String review_sn;
    private String review_name;
    private String review_date;
    private String review_desc;
    private String review_result;
    private String node_name;
    private String row_id;
    private List<String> file;

    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }

    public String getReview_sn() {
        return review_sn;
    }

    public void setReview_sn(String review_sn) {
        this.review_sn = review_sn;
    }

    public String getReview_name() {
        return review_name;
    }

    public void setReview_name(String review_name) {
        this.review_name = review_name;
    }

    public String getReview_date() {
        return review_date;
    }

    public void setReview_date(String review_date) {
        this.review_date = review_date;
    }

    public String getReview_desc() {
        return review_desc;
    }

    public void setReview_desc(String review_desc) {
        this.review_desc = review_desc;
    }

    public String getReview_result() {
        return review_result;
    }

    public void setReview_result(String review_result) {
        this.review_result = review_result;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }
}
