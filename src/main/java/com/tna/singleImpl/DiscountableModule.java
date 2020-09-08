package com.tna.singleImpl;

import com.google.inject.AbstractModule;

//explicit bind
public class DiscountableModule extends AbstractModule {
    protected void configure() {
       // bind(IDiscountable.class).to(Buy2Get2.class);
    }
}