package com.gridnine.testing;

import java.util.Optional;

/**
 * This rule select flights with wrong parameters when arrival time specified as before departure time
 */
public class Rule02 implements Rule {
    //                   Фильтрация перелетов, имеющих сегменты с датой прилета раньше даты вылета
    public Rule02() {
    }

    @Override
    public Optional<Flight> rule(Flight flight) {
        for (int i = 0; i < flight.getSegments().size(); i++) {
            if (flight.getSegments().get(i).getArrivalDate()
                    .isBefore(flight.getSegments().get(i).getDepartureDate())) {
                return Optional.of(flight);
            }
        }
        return Optional.empty();
    }

}
