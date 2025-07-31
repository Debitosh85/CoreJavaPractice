package com.javacollection2;

import java.util.ArrayList;
import java.util.List;

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination: " + name + "\n");
        for (Activity activity : activities) {
            sb.append(activity.toString()).append("\n");
        }
        return sb.toString();
    }
}
