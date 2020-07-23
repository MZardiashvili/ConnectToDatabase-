package command.commands;

import command.Command;
import storage.Storage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddStudentsCommand implements Command {
    @Override
    public String getName() {
        return "AddStudents";
    }

    @Override
    public List<String> getInstruction() {
        return Arrays.asList("Enter id", "Enter firstName", "Enter lastName", "Enter identityNumber", "Enter age");
    }

    @Override
    public void execute(Storage storage, ArrayList args) throws SQLException {
        int result = storage.executeUpdate("insert into student values('" + args.get(0) + "', '" + args.get(1) +
                "', '" + args.get(2) + "', '" + args.get(3) + "', " + args.get(4) + ")");
        if ( result >= 1 ) {
            System.out.println("student has been  added");
        }
    }
}
