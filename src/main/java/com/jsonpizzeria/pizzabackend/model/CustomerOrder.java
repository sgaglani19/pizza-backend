package com.jsonpizzeria.pizzabackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CUSTOMERORDER")
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

//    @Column(name="date")
//    private Date date;

    @ManyToOne
    @JoinColumn(referencedColumnName = "phone_number")
    @JsonBackReference
    private Customer customer;

    @OneToOne
    @JoinColumn(referencedColumnName = "employee_id")
    @JsonBackReference
    private Employee employee;

//    @OneToMany(mappedBy = "customerOrder",fetch = FetchType.EAGER)
//    private List<OrderDetail> orderDetails;

    @OneToOne(mappedBy = "customerOrder")
    @JsonManagedReference
    @JsonIgnore
    private OrderDetail orderDetail;

//    @OneToOne(mappedBy = "orderDate")
//    @JsonManagedReference
//    private OrderDetail orderDetail1;







}
