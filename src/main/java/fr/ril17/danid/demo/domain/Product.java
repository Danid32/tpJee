package fr.ril17.danid.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String imageurl;

    @Column(columnDefinition = "DECIMAL")
    private Double price;

    @Column(columnDefinition = "DATE")
    private String date;

    @ManyToOne
    @JsonBackReference
    private Seller seller;


}
