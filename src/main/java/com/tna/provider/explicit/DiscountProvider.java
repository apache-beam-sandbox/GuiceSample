package com.tna.provider.explicit;

import com.google.inject.Provider;

import java.time.LocalTime;

public class DiscountProvider implements Provider<IDiscountable> {

    public IDiscountable get() {
        int hour = LocalTime.now().getHour();
        if(isEarlyMorning(hour))
            return  new BuyOneGetOne();
        if(isLateMorning(hour))
            return new Buy3Get3();

        return new Buy3Get3();
    }

    private boolean isEarlyMorning(int currHour){
        return (currHour>=5 && currHour<=9);
    }
    private boolean isLateMorning(int currHour){
        return (currHour>=0 && currHour<=4);
    }
}
