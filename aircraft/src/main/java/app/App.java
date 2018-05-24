package app;

import DB.DB_Worker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class App {

    public final static Properties appProps = new Properties();
    private final static String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private final static String appConfigPath = rootPath + ".." + File.separator + ".." + File.separator + "app.properties";


    static {
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }



    public static void main(String[] args) throws SQLException {

        ResultSet rs = DB_Worker.getData("select * from tbl_aEngines");

        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println(rs.getMetaData().getColumnCount());
        System.out.println(rs.getMetaData());

    }

}