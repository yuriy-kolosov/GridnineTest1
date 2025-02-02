package com.gridnine.testing;

import java.util.Optional;

import static java.time.temporal.ChronoUnit.HOURS;

/**
 * This rule select flights with total intervals between segments are longer then two hours
 */
public class Rule03 implements Rule {
    //                 Фильтрация перелетов, где общее время, проведенное на земле, превышает два часа
    public Rule03() {
    }

    @Override
    public Optional<Flight> rule(Flight flight) {
        if (flight.getSegments().size() == 1) {
//                                                                          Перелет состоит из одного сегмента
            return Optional.empty();
        } else {
//                                                                          Перелет состоит из нескольких сегментов
            long intervalBetweenSegmentsSum = 0;
            for (int i = 0; i < (flight.getSegments().size() - 1); i++) {
//                                                                          Суммируем значение интервалов по модулю числа
                if (flight.getSegments().get(i + 1).getDepartureDate().isAfter(flight.getSegments().get(i).getArrivalDate())) {
                    intervalBetweenSegmentsSum += HOURS.between(flight.getSegments().get(i).getArrivalDate()
                            , flight.getSegments().get(i + 1).getDepartureDate());
                } else {
                    intervalBetweenSegmentsSum += HOURS.between(flight.getSegments().get(i + 1).getDepartureDate()
                            , flight.getSegments().get(i).getArrivalDate());
                }
            }
            return intervalBetweenSegmentsSum > 2 ? Optional.of(flight) : Optional.empty();
        }
    }

}
