package com.haitong.rector.mapper;

import com.haitong.bean.ProjectRecord;

import java.util.List;


/**
 * Created by Administrator on 2020/8/20.
 */
public interface RectorMapper {
    List<ProjectRecord> queryRectorList();
    int addRecord(ProjectRecord projectRecord);

}
