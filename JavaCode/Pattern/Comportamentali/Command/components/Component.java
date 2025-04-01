package Command.components;

import Command.commands.*;

/* AbstractInvoker */
public abstract class Component {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
    
}
