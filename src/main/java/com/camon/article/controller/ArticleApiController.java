package com.camon.article.controller;

import com.camon.article.domain.Article;
import com.camon.article.service.ArticleApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by jooyong on 2015-12-20.
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleApiController {
    @Autowired
    private ArticleApiService articleService;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Article add(@RequestBody Article article) {
        return articleService.add(article);
    }

    @RequestMapping(method = GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Article> findAll(@RequestParam(required = false) String content) {
        return articleService.findAll(content);
    }

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseStatus(HttpStatus.OK)
    public Article findById(@PathVariable Long id) {
        return articleService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = PUT)
    @ResponseStatus(HttpStatus.OK)
    public Article modify(@PathVariable Long id, @RequestBody Article article) {
        return articleService.modify(id, article);
    }

    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        articleService.remove(id);
    }
}
