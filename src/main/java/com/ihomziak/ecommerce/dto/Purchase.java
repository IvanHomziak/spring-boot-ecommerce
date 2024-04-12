package com.ihomziak.ecommerce.dto;

import com.ihomziak.ecommerce.entity.Address;
import com.ihomziak.ecommerce.entity.Customer;
import com.ihomziak.ecommerce.entity.Order;
import com.ihomziak.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
