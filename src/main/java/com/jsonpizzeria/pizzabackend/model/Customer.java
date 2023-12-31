package com.jsonpizzeria.pizzabackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CUSTOMER")
public class Customer {
    @Id
    private Long phone_number;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="street_address")
    private String street_address;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CustomerOrder> orders = new ArrayList<>();

//    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonManagedReference
//    private List<OrderDetail> orderDetails = new ArrayList<>();


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "phone_number",referencedColumnName = "phone_number")
//    private CustomerOrder customerOrder;

}
