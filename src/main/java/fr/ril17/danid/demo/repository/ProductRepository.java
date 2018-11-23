package fr.ril17.danid.demo.repository;

import fr.ril17.danid.demo.domain.Product;
import fr.ril17.danid.demo.domain.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();
    List<Product> findAllByDateOrderByDateAsc();
}
