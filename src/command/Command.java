package command;

import storage.Storage;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface Command<T> {
    String getName();
    List<String> getInstruction();
    void execute(Storage storage, ArrayList<T> args) throws SQLException;
}
