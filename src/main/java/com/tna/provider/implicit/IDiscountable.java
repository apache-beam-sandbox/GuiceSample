package com.tna.provider.implicit;

import com.google.inject.ImplementedBy;


/*
    Need to bind Implementation else will get Guice Configuration Errors.
 */

@ImplementedBy(BuyOneGetOne.class)
public interface IDiscountable {
    double getDiscount();
}