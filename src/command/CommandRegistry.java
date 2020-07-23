package command;

import command.commands.*;

import java.util.ArrayList;

public class CommandRegistry {
    public static ArrayList<Command> availableCommands(){
        ArrayList<Command> commands=new ArrayList<>();
        commands.add(new HelpCommand());
        commands.add(new AddStudentsCommand());
        commands.add(new DeleteStudentsCommand());
        commands.add(new GetStudentsCommand());
        commands.add(new SearchStudentCommand());
        commands.add(new GetCountStudentCommand());
        return  commands;
    }
}
