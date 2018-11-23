package fr.ril17.danid.demo.service;

import fr.ril17.danid.demo.domain.Seller;
import fr.ril17.danid.demo.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    private SellerRepository sellerRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository){
        super();
        this.sellerRepository = sellerRepository;
    }

    public void saveSeller(Seller seller){
        Seller seller1 = new Seller(null, seller.getName(), seller.getAddress(), seller.getZipcode(), seller.getCity(), null);
        sellerRepository.save(seller1);
    }

    public Seller findById(Long id){
        Seller seller = sellerRepository.findById(id).get();
        return seller;
    }

    public List<Seller> getAll(){
        List<Seller> sellers = sellerRepository.findAllByOrderByNameAsc();
        return sellers;
    }

    public Seller findByName(String name){
        List<Seller> selelrs = sellerRepository.findByName(name);
        return (selelrs.isEmpty()) ? null : selelrs.get(0);
    }
}
