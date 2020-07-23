package command.commands;

import command.Command;
import storage.Storage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchStudentCommand implements Command {
    @Override
    public String getName() {
        return "SearchStudentCommand";
    }

    @Override
    public List<String> getInstruction() {
        return Arrays.asList("Enter student name");
    }

    @Override
    public void execute(Storage storage, ArrayList args) throws SQLException {
        ResultSet resultSet=storage.executeQuery("select * from student where first_name like '"+args.get(0)+"'");
        while (resultSet.next()){
            System.out.println(" Student's id: "+resultSet.getString("id")+", Student's name is "+resultSet.getString("first_name")+"  "+
                    resultSet.getString("last_name")+",  Student's identity number: "+resultSet.getString("identity_number")+",  student's age: "+
                    resultSet.getString("age"));
        }


    }
}
