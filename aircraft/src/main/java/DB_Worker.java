import java.sql.*;

class DB_Worker {

    static ResultSet getData(String sql_string) throws SQLException {

        if (sql_string == null) return null;

        ResultSet res = null;

        Connection db_connection = null;
        try {
            db_connection = DriverManager.getConnection(App.db, App.db_login, App.db_password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (db_connection != null) {
            Statement stmt = db_connection.createStatement();
            try {
                res = stmt.executeQuery(sql_string);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}
