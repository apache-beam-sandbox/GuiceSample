package com.tna.DI_using_Provider;


public class NoDiscount implements IDiscountable {
    @Override
    public double getDiscount() {
        return 0D;
    }
}
