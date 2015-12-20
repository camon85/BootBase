package com.camon.article.controller;

import com.camon.article.service.ArticleApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jooyong on 2015-12-20.
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleApiService service;

    @RequestMapping(method = RequestMethod.GET)
    public String list(@RequestParam(required = false) String content, Model model) {
        model.addAttribute("articles", service.findAll(content));
        return "article/list";
    }
}
