package com.WholeSailor.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class extendedOrder {
    Order pl_order;
    Integer total_price;
    Product ord_prod;
}
