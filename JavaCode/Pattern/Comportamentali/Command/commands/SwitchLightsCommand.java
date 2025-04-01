package Command.commands;

import Command.components.*;

/* ConcreteCommand */
public class SwitchLightsCommand implements Command {
    // -receiver
    private Light light;

    // + Command(Receiver receiver)
    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    // + execute()
    @Override
    public void execute() {
        light.switchLights();
    }
    
}
