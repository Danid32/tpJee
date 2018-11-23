package fr.ril17.danid.demo.controller;

import fr.ril17.danid.demo.domain.Product;
import fr.ril17.danid.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/all")
    public String getall(Model model){

        model.addAttribute("products", productService.getAll());

        return "views/product";
    }

    @GetMapping("/product/create")
    public String product(Model model){
        model.addAttribute("product", new Product());

        return "views/productform";
    }




    @RequestMapping("/product/{id}")
    public String showProduct(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "views/product";
    }

    @RequestMapping(value = "/product/create", method = RequestMethod.POST)
    public String productSubmit(Product product) {
        // Create product
        productService.saveProduct(product);
        return "views/product/" + product.getId();
    }
}
