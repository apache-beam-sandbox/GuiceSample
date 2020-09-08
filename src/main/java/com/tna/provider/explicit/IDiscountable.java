package com.tna.provider.explicit;

import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface IDiscountable {
    double getDiscount();
}