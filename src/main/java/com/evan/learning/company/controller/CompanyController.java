package com.evan.learning.company.controller;

import com.evan.learning.company.service.impl.CompanyServiceImpl;
import com.evan.learning.company.vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyServiceImpl companyService;

    @GetMapping(value = "/employee/find", produces = "application/json")
    public EmployeeVo find(@RequestParam(required = true, name = "employeeId") Integer employeeId){
        return companyService.findByEmployeeId(employeeId);
    }
}
