package fr.ril17.danid.demo.service;

import fr.ril17.danid.demo.domain.Product;
import fr.ril17.danid.demo.domain.Seller;
import fr.ril17.danid.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    public Product findById(Long id){
        Product product = productRepository.findById(id).get();
        return product;
    }


    public List<Product> getAll(){
        List<Product> products = productRepository.findAllByDateOrderByDateAsc();
        return products;
    }

    public void saveProduct(Product product){
        Product product1 = new Product(null, product.getName(), product.getDescription(), product.getImageurl(), product.getPrice(), product.getDate(), product.getSeller());
        productRepository.save(product1);
    }
}
