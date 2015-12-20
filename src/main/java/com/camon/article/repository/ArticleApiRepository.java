package com.camon.article.repository;

import com.camon.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jooyong on 2015-12-20.
 */
public interface ArticleApiRepository extends JpaRepository<Article, Long> {
    List<Article> findByContentContainingIgnoreCase(String content);
}
