package fr.ril17.danid.demo.repository;

import fr.ril17.danid.demo.domain.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {
    List<Seller> findByName(String name);
    List<Seller> findAllByOrderByNameAsc();
}
