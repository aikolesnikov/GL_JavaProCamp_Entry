import java.sql.*;

public class TryDB {

    // private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String URL =
            "jdbc:mysql://localhost:3306/aircraft?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final static String USERNAME = "kaim";
    private final static String PASSWORD = "kaimka";

    public static void main(String[] args) throws SQLException {

        Connection connection;
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);


        String sql = "select * from tbl_aEngines";

        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(rs.getMetaData().getColumnCount());

            System.out.println();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ",  " +
                                rs.getString("name") + ", " +
                                rs.getString("serialNum") + ", " +
                                rs.getString("model_id") + ", "
                );
            }

            System.out.println();
            rs.beforeFirst();
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + ", ");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*

        if (!connection.isClosed()) {
            System.out.println("Соединение с БД Установлено!");
        }

        connection.close();
        if (connection.isClosed()) {
            System.out.println("Соединение с БД Закрыто!");
        }

 */