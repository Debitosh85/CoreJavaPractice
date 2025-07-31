package com.javacollection2;

import java.util.ArrayList;
import java.util.List;
class ItineraryPlanner {
    private List<Destination> destinations;

    public ItineraryPlanner() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }
}
