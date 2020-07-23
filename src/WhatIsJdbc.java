import java.sql.*;

public class WhatIsJdbc {
    public static void main(String args[]) throws SQLException {
        String url="jdbc:postgresql://localhost:5432/test";
        String user="Nanuka";
        String password="postgre";
      Connection con=DriverManager.getConnection(url, user, password);
      Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet resultSet=statement.executeQuery("select * from student");
      while (resultSet.next()){

          System.out.println(" This is students id: "+resultSet.getInt(1)+", Student's name is "+resultSet.getString(2)+"  "+
                  resultSet.getString(3)+",  Student's identity number: "+resultSet.getString(4)+",  student's age: "+
                  resultSet.getInt(5));
      }





        //help

    }
}
