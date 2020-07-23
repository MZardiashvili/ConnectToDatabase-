package command.commands;

import command.Command;
import storage.Storage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetStudentsCommand implements Command<Void> {
    @Override
    public String getName() {
        return "GetStudents";
    }

    @Override
    public ArrayList<String> getInstruction() {
        return null;
    }

    @Override
    public void execute(Storage storage, ArrayList<Void> args) throws SQLException {
        ResultSet resultSet=storage.executeQuery("select * from student");
        while (resultSet.next()){

            System.out.println(" This is students id: "+resultSet.getString("id")+", Student's name is "+resultSet.getString("first_name")+"  "+
                    resultSet.getString("last_name")+",  Student's identity number: "+resultSet.getString("identity_number")+",  student's age: "+
                    resultSet.getString("age"));
        }
    }

}
