package demo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/10/23.
 * JavaEE_Framework.
 */
public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        new Driver();
        Connection connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");

        String username = "Tom";
        String password = "123";

        String sql = "INSERT INTO db_test.user VALUES (NULL ,? ,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }
}
