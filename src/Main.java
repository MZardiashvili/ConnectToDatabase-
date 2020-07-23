import command.Command;
import command.CommandRegistry;
import storage.Storage;
import storage.StorageImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new StorageImpl();
        while (true) {
            String command = scanner.nextLine();
            Optional<Command> optional = CommandRegistry.
                    availableCommands().
                    stream().
                    filter(command1 -> command1.getName().equals(command)).findAny();
            if ( optional.isPresent() ) {
                Command com = optional.get();
                if ( com.getInstruction() != null && !com.getInstruction().isEmpty() ) {
                    ArrayList<String> commandArgs=new ArrayList<>();
                    for(Object instraction:com.getInstruction()){
                        System.out.println(instraction);
                        commandArgs.add(scanner.nextLine());

                    }
                    com.execute(storage, commandArgs);
                } else {
                    com.execute(storage, null);
                }

            } else {
                System.out.println("No commands found");
            }
        }

    }

}