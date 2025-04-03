package MVC;

import java.util.*;

/* Model */
public class Student {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private String rollNo;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

}
