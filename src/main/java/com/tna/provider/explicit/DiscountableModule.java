package com.tna.provider.explicit;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.time.LocalTime;


public class DiscountableModule extends AbstractModule {
    protected void configure() {
        /*
        Comment this out for provides to work else will give error
        Unable to create injector and throwCreationException
         */
        //bind(IDiscountable.class).toProvider(DiscountProvider.class);
    }

    // need to comment below Provides when using Annotation for Providers in Contract/Interface
    @Provides
    public IDiscountable get() {
        int hour = LocalTime.now().getHour();
        if(isEarlyMorning(hour))
            return  new BuyOneGetOne();
        if(isLateMorning(hour))
            return new Buy3Get3();

        return new NoDiscount();
    }

    private boolean isEarlyMorning(int currHour){
        return (currHour>=5 && currHour<=9);
    }
    private boolean isLateMorning(int currHour){
        return (currHour>=0 && currHour<=4);
    }
}