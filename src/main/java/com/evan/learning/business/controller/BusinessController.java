package com.evan.learning.business.controller;

import com.evan.learning.business.service.impl.BusinessServiceImpl;
import com.evan.learning.business.vo.BusinessVo;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    BusinessServiceImpl businessService;

    @GetMapping(value = "/findAll", produces = "application/json")
    public List<BusinessVo> findAllBusiness() throws ParseException {
        return businessService.findAllBusiness();
    }
}
