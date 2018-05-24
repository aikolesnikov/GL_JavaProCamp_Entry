package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import app.App;

class DB_Connector {

    private final static String db = App.appProps.getProperty("DB_URL");
    private final static String db_login = App.appProps.getProperty("DB_Login");
    private final static String db_password = App.appProps.getProperty("DB_Password");

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(db, db_login, db_password);
    }

}
