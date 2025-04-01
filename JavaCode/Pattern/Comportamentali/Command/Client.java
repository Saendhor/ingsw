package Command;

import Command.commands.*;
import Command.components.*;

/* Client */
public class Client {
    public static void main(String[] args) {
        Room room = new Room();
        // Invoker  > ConcreteCommand       > Receiver
        // Room     > SwitchLightsCommand   > Light
        room.setCommand(new SwitchLightsCommand(room.getLight()));
        // Invoker  > ConcreteCommand       > Receiver
        // Room     > (SwitchLightsCommand   > Light)
        room.executeCommand();
        
    }
    
}
