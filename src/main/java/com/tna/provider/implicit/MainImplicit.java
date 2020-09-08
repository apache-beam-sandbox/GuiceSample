package com.tna.provider.implicit;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tna.provider.explicit.DiscountableModule;


public class MainImplicit {
    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountableModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);
        service.checkout(100.00D);
    }
}
