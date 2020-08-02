package com.sda.javagda34.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndexPage(Model model, @RequestParam(name = "imie", required = false) String param){
        model.addAttribute("imie",param);
        return "index";
    }

    @GetMapping("/multable")
    public String tabliczkaMnozenia(Model model,
                                    @RequestParam(name = "x", required = false, defaultValue = "10") int rozmiarX,
                                    @RequestParam(name = "y", required = false,defaultValue = "10") int rozmiarY){

        model.addAttribute("rozmiar_x",rozmiarX);
        model.addAttribute("rozmiar_y",rozmiarY);
       return "tabliczka_mnozenia";
    }

}
