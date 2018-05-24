package DB;

import java.sql.*;

public class DB_Worker {

    public static ResultSet getData(String sql_string) throws SQLException {

        if (sql_string == null) return null;

        ResultSet res = null;

        Connection db_connection = DB_Connector.getConnection();
        try {
            if (db_connection != null) {
                Statement stmt = db_connection.createStatement();
                res = stmt.executeQuery(sql_string);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
}
