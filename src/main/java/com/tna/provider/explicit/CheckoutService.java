package com.tna.provider.explicit;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CheckoutService {

    private final Provider<IDiscountable> discountable;

    @Inject
    public CheckoutService(Provider<IDiscountable> discountable){
        this.discountable=discountable;
    }

    public double checkout(double cartTotal){
        double discount = discountable.get().getDiscount();
        double totalAfterDiscount = cartTotal - (cartTotal*discount);
        System.out.printf("%nShopping cart intially [$%.2f] with a discount of %.2f%% " +
                        "- [$%.2f]%n%n",
                cartTotal,
                discount * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }
}
