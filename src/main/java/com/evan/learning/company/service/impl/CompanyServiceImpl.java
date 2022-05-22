package com.evan.learning.company.service.impl;

import com.evan.learning.company.service.CompanyService;
import com.evan.learning.company.vo.EmployeeVo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public EmployeeVo findByEmployeeId(Integer employeeId) {
        RestTemplate restTemplate = new RestTemplate();
        String employeeUrl = "http://localhost:8080/employee/findByEmployeeId?employeeId=" + employeeId;
        EmployeeVo employeeVo = restTemplate.getForObject(employeeUrl, EmployeeVo.class);
        return employeeVo;
    }

}
