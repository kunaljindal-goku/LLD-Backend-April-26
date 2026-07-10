package com.example.splitwise.commands;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class CommandExecutor {

    private List<Command> commands;

    public CommandExecutor() {
        commands.add(new RegisterCommand());
        commands.add(new SettleUpCommand());
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void removeCommand(Command command) {
        this.commands.remove(command);
    }

    public void executeCommand(String input) {
        for(Command command: commands) {
            if(command.matches(input)) {
                command.execute(input);
            }
        }
    }
}
