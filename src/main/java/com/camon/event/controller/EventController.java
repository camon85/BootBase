package com.camon.event.controller;

/**
 * Created by jooyong on 2015-12-20.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/event")
public class EventController {

    @RequestMapping(method = RequestMethod.GET)
    public String dd() {
        return "event/list";
    }

}
