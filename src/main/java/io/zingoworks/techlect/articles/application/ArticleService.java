package io.zingoworks.techlect.articles.application;

import io.zingoworks.techlect.articles.application.dto.ArticleResponseDto;
import io.zingoworks.techlect.articles.domain.Article;
import io.zingoworks.techlect.articles.domain.ArticleRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<ArticleResponseDto> findAll() {
        List<Article> articles = articleRepository.findAll();

        return articles.stream()
            .map(ArticleResponseDto::new)
            .collect(Collectors.toList())
            ;
    }

}
