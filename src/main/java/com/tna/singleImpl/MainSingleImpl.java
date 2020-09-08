package com.tna.singleImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class MainSingleImpl {
    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountableModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);
        service.checkout(100.00D);
    }
}
