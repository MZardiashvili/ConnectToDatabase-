package storage;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Storage {
   ResultSet executeQuery(String query) throws SQLException;
   int executeUpdate(String query) throws SQLException;

}
