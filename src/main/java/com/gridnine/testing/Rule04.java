package com.gridnine.testing;

import java.util.Optional;

/**
 * This rule select flights with transfers each not longer one hour
 */
public class Rule04 implements Rule {
    //                  Фильтрация перелетов, имеющих пересадки, каждая из которых не превышает одного часа
    //                  (Пример дополнительного фильтра)
    public Rule04() {
    }

    @Override
    public Optional<Flight> rule(Flight flight) {
        if (flight.getSegments().size() == 1) {
            return Optional.empty();
        } else {
            for (int i = 0; i < (flight.getSegments().size() - 1); i++) {
                if (flight.getSegments().get(i + 1).getDepartureDate()
                        .isAfter(flight.getSegments().get(i).getArrivalDate().plusHours(1).plusMinutes(1))) {
                    return Optional.empty();
                }
            }
            return Optional.of(flight);
        }
    }

}
