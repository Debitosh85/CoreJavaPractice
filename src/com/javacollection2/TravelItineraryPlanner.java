package com.javacollection2;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();

        
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

       
        planner.addDestination(paris);
        planner.addDestination(london);

        
        for (Destination destination : planner.getDestinations()) {
            System.out.println(destination);
        }
    }
}
