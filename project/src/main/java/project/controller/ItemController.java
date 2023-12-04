package project.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/item/new")
    public String itemNew(){
        return "/item/itemForm";
    }
}
