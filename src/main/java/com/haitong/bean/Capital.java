package com.haitong.bean;

import lombok.Data;

/**
 * 资金管理
 */
@Data
public class Capital {
    private Integer id;
    private String recordId;
    private String projectId;
    private String amountIncurred;
    private String trafficSign;
    private String operator;
    private String remarks;
    private String time;
}
