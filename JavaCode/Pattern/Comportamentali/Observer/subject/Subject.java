package Observer.subject;

import Observer.observer.*;

/* Subject */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
