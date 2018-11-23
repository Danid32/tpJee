package fr.ril17.danid.demo.controller;

import fr.ril17.danid.demo.domain.Seller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("result", "Atribute");
        return "views/index";
    }
}
