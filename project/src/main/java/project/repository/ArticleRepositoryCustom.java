package project.repository;


import org.hibernate.dialect.SQLServer2005Dialect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import project.dto.ArticleSearchDto;
import project.entity.Article;

public interface ArticleRepositoryCustom {

    Page<Article> getArticlePage(ArticleSearchDto articleSearchDto, Pageable pageable);

}
