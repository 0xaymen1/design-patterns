package src.behavioral.observer;


//SUBSCRIBER
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
