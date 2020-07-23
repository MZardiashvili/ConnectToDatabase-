package command.commands;

import command.Command;
import storage.Storage;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetCountStudentCommand implements Command {
    @Override
    public String getName() {
        return "GetCountStudentCommand";
    }

    @Override
    public List<String> getInstruction() {
        return null;
    }

    @Override
    public void execute(Storage storage, ArrayList args) throws SQLException {
      ResultSet resultSet =storage.executeQuery("select * from student");
        ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
        int count=resultSetMetaData.getColumnCount();
        System.out.println("Studentebis raodenoba tolia"+count);

    }
}
