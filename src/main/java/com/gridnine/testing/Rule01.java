package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * This rule select flights with departure before current time
 */
public class Rule01 implements Rule {
    //                  Фильтрация перелетов, совершивших вылет до текущего момента времени
    public Rule01() {
    }

    @Override
    public Optional<Flight> rule(Flight flight) {
        for (int i = 0; i < flight.getSegments().size(); i++) {
            if (flight.getSegments().get(i).getDepartureDate()
                    .isBefore(LocalDateTime.now())) {
                return Optional.of(flight);
            }
        }
        return Optional.empty();
    }

}
