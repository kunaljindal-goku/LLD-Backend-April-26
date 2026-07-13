package com.example.splitwise.commands;

import org.springframework.stereotype.Component;

@Component
public class SettleUpCommand implements Command{
    @Override
    public boolean matches(String input) {
        String words[] = input.split(" ");
        if(words[0].equalsIgnoreCase("settleup")) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {

    }
}
