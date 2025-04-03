package Observer.observer;

/* ConcreteObserver */
public class CurrentConditionsDisplay implements Observer {
    private float temperature;

    private void display() {
        System.out.println("Current Conditions Display: Temperature = " + temperature);
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }
    
}
