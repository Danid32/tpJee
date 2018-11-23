package fr.ril17.danid.demo.controller;

import fr.ril17.danid.demo.domain.Seller;
import fr.ril17.danid.demo.repository.SellerRepository;
import fr.ril17.danid.demo.service.SellerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/seller/all")
    public String getall(Model model){

        model.addAttribute("sellers", sellerService.getAll());

        return "views/seller";
    }

    @GetMapping("/seller/create")
    public String seller(Model model){
        model.addAttribute("seller", new Seller());

        return "views/sellerform";
    }




    @RequestMapping("/seller/{id}")
    public String showSeller(@PathVariable Long id, Model model){
        model.addAttribute("seller", sellerService.findById(id));
        return "views/seller";
    }

    @RequestMapping(value = "/seller/create", method = RequestMethod.POST)
    public String sellerSubmit(Seller seller) {
        // Create seller
        sellerService.saveSeller(seller);
        return "views/seller/" + seller.getId();
    }
}
