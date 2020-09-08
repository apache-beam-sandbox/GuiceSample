package com.tna.DI_using_Provider;

import com.google.inject.AbstractModule;
import java.util.Random;


public class DiscountableModule extends AbstractModule {

    @Override
    protected void configure() {

       /* Multibin<Integer, IDiscountable> mapBinder
                = MapBinder.newMapBinder(
                binder(),
                Integer.class, IDiscountable.class);

        mapBinder.addBinding(0).to(BuyOneGetOne.class);
        mapBinder.addBinding(1).to(Buy3Get3.class);
        mapBinder.addBinding(2).to(NoDiscount.class);*/

        bind(Random.class).toInstance(new Random());//does it for you anyways

        bind(IDiscountable.class).toProvider(DiscountProvider.class);
    }
}