package com.haitong.rector.controller;


import com.haitong.bean.ProjectRecord;
import com.haitong.bean.TablePage;
import com.haitong.rector.service.RectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/12/25.
 */
@Controller
@RequestMapping("/record")
public class ProjectController {
    @Autowired
    RectorService rectorService;

    /*添加项目*/
    @RequestMapping("/record_add")
    public String projectAdd(ProjectRecord projectRecord){
        int a = rectorService.addRecord(projectRecord);
        return "redirect:/to/to_record";
    }
    /*项目列表*/
    @RequestMapping("/record_list")
    @ResponseBody
    public TablePage<ProjectRecord> projectList(@RequestParam(required = false, defaultValue = "1") Integer pageNumber, @RequestParam(required = false, defaultValue = "4") Integer pageSize){
        return rectorService.queryRectorList(pageNumber,pageSize);
    }


}
