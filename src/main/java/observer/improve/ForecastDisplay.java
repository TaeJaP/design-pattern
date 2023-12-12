package observer.improve;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{

    private float temperature;
    private float pressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
