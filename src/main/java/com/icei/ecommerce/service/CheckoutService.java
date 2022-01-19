package com.icei.ecommerce.service;

import com.icei.ecommerce.dto.Purchase;
import com.icei.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

  PurchaseResponse placeOrder(Purchase purchase);
}
