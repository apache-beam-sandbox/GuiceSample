package com.tna.DI_using_Provider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


public class Main_DI_provider {
    private final CheckoutService checkoutService;
    @Inject
    public Main_DI_provider(CheckoutService checkoutService){
        this.checkoutService=checkoutService;
    }
    void start(){
        checkoutService.checkout(100.0D);
    }
    public static void main(String[] args) {

        Injector guice = Guice.createInjector(new DiscountableModule());
        Main_DI_provider service = guice.getInstance(Main_DI_provider.class);
        service.start();
    }
}
