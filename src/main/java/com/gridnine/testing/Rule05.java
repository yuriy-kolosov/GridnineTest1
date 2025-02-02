package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * This rule select flights with departure three days later
 */
public class Rule05 implements Rule {
    //                  Фильтрация перелетов с запланированным временем вылета через три дня и более
    //                  (Пример дополнительного фильтра)
    public Rule05() {
    }

    @Override
    public Optional<Flight> rule(Flight flight) {
        if (!flight.getSegments().get(0).getDepartureDate()
                .isAfter(LocalDateTime.now().plusDays(2).plusHours(1))) {
            return Optional.empty();
        } else return Optional.of(flight);
    }

}
