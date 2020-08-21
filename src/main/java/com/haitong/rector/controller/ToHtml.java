package com.haitong.rector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/12/25.
 */
@Controller
@RequestMapping("/to")
public class ToHtml {
    /*跳转页面到主页面*/
    @RequestMapping("/to_index")
    public String toIndexJq(){
        return "/jq/indexOA";
    }
    /*跳转页面到项目档案*/
    @RequestMapping("/to_record")
    public String toProjectList(){
        return "/projectrector/projectList";
    }

}
