package com.evan.learning.business.service;

import com.evan.learning.business.vo.BusinessVo;
import org.json.simple.parser.ParseException;

import java.io.Serializable;
import java.util.List;

public interface BusinessService extends Serializable {
    List<BusinessVo> findAllBusiness() throws ParseException;
}
