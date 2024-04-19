package xyz.chenxofhit.ssm.controller;

import xyz.chenxofhit.ssm.entity.Department;
import xyz.chenxofhit.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/depart")
public class DepartController {

    @Autowired
    private DepartmentService departService;

    /**
     * 查询所有部门
     */
    @RequestMapping("/findAll")
    @ResponseBody  //返回格式化好的JSON字符串
    public List<Department> findAllDeparts() {
        return departService.findAllDeparts();
    }

}
