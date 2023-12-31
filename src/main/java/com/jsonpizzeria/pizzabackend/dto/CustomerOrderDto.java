package com.jsonpizzeria.pizzabackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jsonpizzeria.pizzabackend.model.Customer;
import com.jsonpizzeria.pizzabackend.model.CustomerOrder;
import com.jsonpizzeria.pizzabackend.model.Employee;
import com.jsonpizzeria.pizzabackend.model.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderDto {

    private Long order_id;
    private CustomerDto customer;
    private EmployeeDto employee;

    @JsonIgnore
    private OrderDetail orderDetail;
}
