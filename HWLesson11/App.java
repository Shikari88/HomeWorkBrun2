package HWLesson11;

import java.sql.*;

public class App {
    /*
    Скачать базу данных sqlite (https://www.sqlitetutorial.net/sqlite-sample-database/)
    Настроить sqlite jdbc драйвер и подключение к этой базе данных
    Вывести список всех артистов (таблица artists)
     */
    public static void main(String[] args) {
        jdbcConnection();
    }


    static void jdbcConnection(){
        String url = "jdbc:sqlite:artist.db";
        try(Connection conn = DriverManager.getConnection(url)) {
            Statement statement = conn.createStatement();
            statement.executeUpdate("drop table if exists artist");
            statement.executeUpdate("create table artist(id integer, name string)");
            statement.executeUpdate("insert into artist values(1, 'John')");
            statement.executeUpdate("insert into artist values(2, 'Jane')");
            statement.executeUpdate("insert into artist values(1, 'Hanna')");

            ResultSet resultSet = statement.executeQuery("select * from artist");
            while (resultSet.next()) {
                System.out.printf(
                        "Artist %d with name: %s\n",
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                );
            }
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
