package com.camon.event.controller;

/**
 * Created by jooyong on 2015-12-20.
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/event")
@Slf4j
public class EventController {
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("msg", "hello");
        return "event/list";
    }

}
