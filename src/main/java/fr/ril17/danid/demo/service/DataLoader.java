package fr.ril17.danid.demo.service;

import fr.ril17.danid.demo.domain.Product;
import fr.ril17.danid.demo.domain.Seller;
import fr.ril17.danid.demo.repository.ProductRepository;
import fr.ril17.danid.demo.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {
    private SellerRepository sellerRepository;
    private ProductRepository productRepository;

    @Autowired
    public DataLoader(SellerRepository sellerRepository, ProductRepository productRepository){
        super();
        this.sellerRepository = sellerRepository;
        this.productRepository = productRepository;
    }

    @PostConstruct
    private void loadData(){
        /*// Create seller
        Seller seller1 = new Seller(null, "Danid", "Rue du cesi", "12345", "France", null);
        sellerRepository.save(seller1);
        // Create product
        Product product1 = new Product(null, "Ordinateur", "Mac book Pro", "https://support.apple.com/content/dam/edam/applecare/images/en_US/macos/highsierra/psp-mini-hero-upgrade-macos-high-sierra_2x.png", 1400.50, "2018-11-23", seller1);
        Product product2 = new Product(null, "Tablette", "Samsung", "https://static.fnac-static.com/multimedia/Images/FR/NR/a8/c7/7a/8046504/1540-1/tsp20181010171007/Tablette-Samsung-Galaxy-Tab-S2-VE-9-7-32-Go-Blanc.jpg", 450.99, "2018-11-29", seller1);
        productRepository.save(product1);
        productRepository.save(product2);*/
    }
}
