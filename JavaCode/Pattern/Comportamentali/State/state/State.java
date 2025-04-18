package State.state;

import State.Phone;

/* <<inteface>> State */
public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onOffOn();

}
