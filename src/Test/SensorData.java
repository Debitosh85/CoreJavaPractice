package Test;

import java.util.function.Function;

public class SensorData {
    private double temperature;
    private double humidity;
    
    
    public SensorData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public static void main(String[] args) {
        SensorData sensor = new SensorData(26.5, 65.0);
        
        
        Function<SensorData, Double> getTemperature = data -> data.getTemperature();
        Double temp = getTemperature.apply(sensor);
        System.out.println("Temperature: " + temp);

        
        double threshold = 25.0;

        Function<Double, Boolean> isAboveThreshold = t -> t > threshold;
        Boolean result = isAboveThreshold.apply(temp);
        System.out.println("Is temperature above " + threshold + " degrees? " + result);
    }
}
