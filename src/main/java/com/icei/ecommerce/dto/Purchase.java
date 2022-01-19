package com.icei.ecommerce.dto;

import com.icei.ecommerce.entity.Address;
import com.icei.ecommerce.entity.Customer;
import com.icei.ecommerce.entity.Order;
import com.icei.ecommerce.entity.OrderItem;
import java.util.Set;
import lombok.Data;

@Data
public class Purchase {

  private Customer customer;
  private Address shippingAddress;
  private Address billingAddress;
  private Order order;
  private Set<OrderItem> orderItems;

}
