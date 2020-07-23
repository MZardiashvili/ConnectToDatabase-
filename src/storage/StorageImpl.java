package storage;

import java.sql.*;

public class StorageImpl implements Storage {
    @Override
    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement=getConnection().createStatement();
        ResultSet resultSet=statement.executeQuery(query);
        return resultSet;
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        Statement statement=getConnection().createStatement();
        return  statement.executeUpdate(query);

    }

    private Connection getConnection() throws SQLException {
        String url="jdbc:postgresql://localhost:5432/test";
        String user="Nanuka";
        String password="postgre";
        Connection con= DriverManager.getConnection(url, user, password);
        return con;
    }

}
