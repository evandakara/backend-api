package com.evan.learning.company.service;

import com.evan.learning.company.vo.EmployeeVo;

import java.io.Serializable;

public interface CompanyService extends Serializable {
    EmployeeVo findByEmployeeId (Integer employeeId);
}
