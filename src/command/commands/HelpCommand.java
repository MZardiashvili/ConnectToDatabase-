package command.commands;

import command.Command;
import command.CommandRegistry;
import storage.Storage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class HelpCommand  implements Command<Void> {
    @Override
    public String getName() {
        return "Help";
    }

    @Override
    public ArrayList<String> getInstruction() {
        return null;
    }

    @Override
    public void execute(Storage storage, ArrayList<Void> args) throws SQLException {

       String commands=CommandRegistry.availableCommands().stream().map(command -> command.getName()).collect(Collectors.joining(";"));
        System.out.println(String.format("Avaliable commands are: %s", commands));
    }


}
