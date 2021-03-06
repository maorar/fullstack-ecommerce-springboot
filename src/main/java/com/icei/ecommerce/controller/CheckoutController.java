package com.icei.ecommerce.controller;

import com.icei.ecommerce.dto.Purchase;
import com.icei.ecommerce.dto.PurchaseResponse;
import com.icei.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("https://fstack-ecommerce-front.herokuapp.com")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

  private CheckoutService checkoutService;

  public CheckoutController(CheckoutService checkoutService) {
    this.checkoutService = checkoutService;
  }

  @PostMapping("/purchase")
  public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

    PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

    return purchaseResponse;
  }

}
