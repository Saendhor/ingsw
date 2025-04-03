package Observer.observer;

/* ConcreteObserver */
public class StatisticsDisplay implements Observer{
    private float temperature;

    private void display() {
        System.out.println("Statistics Display: Temperature = " + temperature);
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

}
