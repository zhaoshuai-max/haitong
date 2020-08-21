package com.haitong.bean;

import lombok.Data;

/**
 * 费用管理
 */
@Data
public class Cost {
    private Integer id;
    private String projectId;
    private String chargeId;
    private String reimbursementBy;
    private String amountIncurred;
    private String leaderAuditSign;
    private String financialAuditor;
    private String financialAuditMark;
    private String financialChecker;
    private String financialCheckMark;
    private String operator;
    private String status;
    private String remarks;
    private String time;
}
