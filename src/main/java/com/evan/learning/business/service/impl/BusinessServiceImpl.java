package com.evan.learning.business.service.impl;

import com.evan.learning.business.service.BusinessService;
import com.evan.learning.business.vo.BusinessVo;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Override
    public List<BusinessVo> findAllBusiness() throws ParseException {
        RestTemplate restTemplate = new RestTemplate();
        String businessUrl = "https://api.bizhare.id/base/business/findAllBusiness";
        String responseString = restTemplate.getForObject(businessUrl, String.class);

        JSONObject jsonObj;
        JSONParser parser = new JSONParser();  // parser to parse string to JSONObject
        jsonObj = (JSONObject) parser.parse(responseString); // parse the Object using parse Method
        JSONArray data = (JSONArray) jsonObj.get("data"); // get specific information from JSONObject

        Gson gson;
        List<BusinessVo> businessVoList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            JSONObject object = (JSONObject) data.get(i);
            gson = new Gson();
            BusinessVo businessVo = gson.fromJson(object.toString(), BusinessVo.class);
            businessVoList.add(businessVo);
        }
        return businessVoList;
    }
}
