package com.camon.sample.controller;

import com.camon.sample.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jooyong on 2015-12-20.
 */

@Controller
public class SampleController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/sample")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return this.cityService.getCity("Bath", "UK").getName();
    }

}