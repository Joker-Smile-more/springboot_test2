package org.test.projectmanagement.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.test.projectmanagement.Model.ProjectInfo;
import org.test.projectmanagement.Service.ProjectInfoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = {"论坛信息"})
@Controller
public class ProjectInfoController {

    @Autowired
    private ProjectInfoService projectInfoService;



    @ApiOperation(value = "信息列表")
    @GetMapping("/list")
    public String method1(@RequestParam(value ="struts",required = false) String struts,Model model){
        Map<String,Object> map = new HashMap<String,Object>();
        if(struts != null && struts != ""){
            map.put("struts",struts);
        }
        System.out.println("sadsad");
        List<ProjectInfo> projectInfoList = projectInfoService.getProjectInfo(map);
        model.addAttribute("projectInfoList",projectInfoList);
        return "list";
    }

    @GetMapping("/getOne")
    public String method2(@RequestParam String id, Model model){
        model.addAttribute("projectInfo",projectInfoService.getProjectInfoById(Integer.parseInt(id)));
        return "one.html";
    }

    @GetMapping("/update")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "struts", value = "状态", required = true, dataType = "String"),
            @ApiImplicitParam(name = "id", value = "标识符", required = true, dataType = "String")
    })
    public Integer method3(@RequestParam String struts,
                           @RequestParam String id){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("struts",struts);
        map.put("id",id);
        return projectInfoService.updateProjectInfoStruts(map);
    }

}
