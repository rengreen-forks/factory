package pl.com.dddbyexamples.factory.shortages.prediction.calculation;

import pl.com.dddbyexamples.factory.product.management.RefNoId;

public interface ShortageForecasts {
    ShortageForecast get(RefNoId refNo, int daysAhead);
}
