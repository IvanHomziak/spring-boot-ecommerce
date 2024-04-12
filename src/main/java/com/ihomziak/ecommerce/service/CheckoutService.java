package com.ihomziak.ecommerce.service;

import com.ihomziak.ecommerce.dto.Purchase;
import com.ihomziak.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
