package com.haitong.bean;

import lombok.Data;

/**
 * 项目团队
 */
@Data
public class ProjectTeam {
    private Integer id;
    private String projectId;
    private String personnelId;
    private String role;
    private String status;
    private String remarks;
    private String time;
}
