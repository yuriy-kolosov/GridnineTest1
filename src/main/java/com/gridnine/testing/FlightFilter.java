package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Class that includes methods for flights filtration
 * by select flights with various specified rules
 * and including features for excluding flights from source flight lists
 */
public class FlightFilter {

    static List<Flight> selectFlights(List<Flight> allFlights, Rule selectedRule) {
        return allFlights.stream()
                .map(selectedRule::rule)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    static List<Flight> excludeFlights(List<Flight> allFlights, Rule excludedRule) {
        List<Flight> selectedFlights = selectFlights(allFlights, excludedRule);
        List<Flight> reducedFlights = new ArrayList<>();
        reducedFlights.addAll(allFlights);
        reducedFlights.removeAll(selectedFlights);
        return reducedFlights;
    }

}
