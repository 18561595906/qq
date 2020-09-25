package com.haier.hop.ms.legcontract.dto;

import java.util.List;

public class UseSealNode {
    private String NodeId;

    private String NodeName;

    private String reviewUser;

    private String reviewUserSn;

    private List<String> reviewUsers;

    private List<String> reviewUsersSn;

    private String approve;

    public String getNodeId() {
        return NodeId;
    }

    public void setNodeId(String nodeId) {
        NodeId = nodeId;
    }

    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String nodeName) {
        NodeName = nodeName;
    }

    public List<String> getReviewUsers() {
        return reviewUsers;
    }

    public void setReviewUsers(List<String> reviewUsers) {
        this.reviewUsers = reviewUsers;
    }

    public List<String> getReviewUsersSn() {
        return reviewUsersSn;
    }

    public void setReviewUsersSn(List<String> reviewUsersSn) {
        this.reviewUsersSn = reviewUsersSn;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    public String getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(String reviewUser) {
        this.reviewUser = reviewUser;
    }

    public String getReviewUserSn() {
        return reviewUserSn;
    }

    public void setReviewUserSn(String reviewUserSn) {
        this.reviewUserSn = reviewUserSn;
    }
}
