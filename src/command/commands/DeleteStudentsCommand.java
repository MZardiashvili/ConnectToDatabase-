package command.commands;

import command.Command;
import storage.Storage;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeleteStudentsCommand implements Command<String> {
    @Override
    public String getName() {
        return "DeleteStudents";
    }

    @Override
    public ArrayList<String> getInstruction() {
        return null;
    }

    @Override
    public void execute(Storage storage, ArrayList<String> args) throws SQLException {
        int result = storage.executeUpdate("delete from student where first_name='"
                + args.get(0) + "'");
        if ( result >= 1 ) {
            System.out.println("student has been  deleted");
        } else {
            System.out.println("Student does not exist");
        }
    }
}
