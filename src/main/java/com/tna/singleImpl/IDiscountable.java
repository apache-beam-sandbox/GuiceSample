package com.tna.singleImpl;

import com.google.inject.ImplementedBy;

@ImplementedBy(BuyOneGetOne.class) //Implicit
public interface IDiscountable {
    double getDiscount();
}