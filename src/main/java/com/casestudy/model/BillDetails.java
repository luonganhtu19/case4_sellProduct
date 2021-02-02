package com.casestudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1)
    private Integer quantity;

    private Long price;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Products products;

    @ManyToOne
    @JoinColumn(name="bill_id")
    private Bill bill;

}
