package com.tna.provider.explicit;


public class NoDiscount implements IDiscountable {
    @Override
    public double getDiscount() {
        return 0D;
    }
}
