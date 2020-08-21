package com.haitong.rector.service;

import com.haitong.bean.ProjectRecord;
import com.haitong.bean.TablePage;

/**
 * Created by Administrator on 2020/8/20.
 */
public interface RectorService {
    TablePage<ProjectRecord> queryRectorList(Integer pageNumber, Integer pageSize);
    int addRecord(ProjectRecord projectRecord);
}
