//package com.team.cinema.api;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.HttpServerErrorException;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponents;
//import org.springframework.web.util.UriComponentsBuilder;
//
//
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//@RestController
//public class BoxOffice {
//
//    @GetMapping("movie")
//    public String getMovieApi(){
//
//            String key = "";
//
//            String result = "":
//
//        try{
//            URL url = new URL("http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key="
//                    + key + "&movieCd=20124039");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//    }
//}
