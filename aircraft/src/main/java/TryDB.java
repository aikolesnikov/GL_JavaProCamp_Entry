import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class TryDB {

    private final static String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private final static String appConfigPath = rootPath + ".." + File.separator + ".." + File.separator + "app.properties";
    private final static Properties appProps = new Properties();


    public static void main(String[] args) throws SQLException {

        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        String db = appProps.getProperty("DB_URL");
        String db_login = appProps.getProperty("DB_Login");
        String db_password = appProps.getProperty("DB_Password");

        try (Connection connection = DriverManager.getConnection(db, db_login, db_password); Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("select * from tbl_aEngines");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ",  " +
                                rs.getString("name") + ", " +
                                rs.getString("serialNum") + ", " +
                                rs.getInt("model_id") + ", "
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