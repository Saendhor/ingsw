package Command.components;

/* ConcreteInvoker */
public class Room extends Component {
    private final Light light;

    public Room() {
        this.light = new Light();
    }

    public Light getLight() {
        return this.light;
    }

    public boolean isLightOn() {
        return light.isSwitchedOn();
    }
    
}
