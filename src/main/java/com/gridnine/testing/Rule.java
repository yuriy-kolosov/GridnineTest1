package com.gridnine.testing;

import java.util.Optional;

/**
 * Functional interface for flights filtration rules invoke and execute
 */
@FunctionalInterface
public interface Rule {

    Optional<Flight> rule(Flight flight);

}
