package com.haitong.bean;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.format.DateTimeFormatter;

/**
 * 项目档案
 */
@Data
public class ProjectRecord {
    private Integer id;
    private String projectId;
    private String projectName;
    private String creator;
    private String commercialDirector;
    private String customerName;
    private String customerContact;
    private String projectManager;
    private String projectStatus;
    private String remarks;
    private String time;
}
