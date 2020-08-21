package com.haitong.rector.service.impl;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haitong.bean.ProjectRecord;
import com.haitong.bean.TablePage;
import com.haitong.rector.mapper.RectorMapper;
import com.haitong.rector.service.RectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/8/20.
 */
@Service
public class RectorImpl implements RectorService {
    @Autowired
    RectorMapper rectorMapper;

    @Override
    public TablePage<ProjectRecord> queryRectorList(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<ProjectRecord> list = rectorMapper.queryRectorList();
        PageInfo<ProjectRecord> info = new PageInfo<ProjectRecord>(list);
        return new TablePage<ProjectRecord>(info.getPageNum(),info.getSize(),info.getList(),info.getTotal(),info.getPages());
    }

    @Override
    public int addRecord(ProjectRecord projectRecord) {
        return rectorMapper.addRecord(projectRecord);
    }
}
