package project.dto;

import lombok.Getter;
import lombok.Setter;
import project.constant.ArticleType;

@Getter @Setter
public class ArticleSearchDto {

    private String searchDateType;

    private ArticleType searchArticleType;

    private String searchBy;

    private String searchQuery="";
}
