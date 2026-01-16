import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDao {

    public void createAccount(int accNo, String name, String type) throws Exception{
        Connection con = DBConnection.getConnection();
        String sql = "INSERT INTO accounts VALUES (?, ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, accNo);
        stmt.setString(2, name);
        stmt.setString(3, type);
        stmt.setDouble(4, 0.0);
        stmt.setString(5, "Active");

        stmt.executeUpdate();
        con.close();
    }

    public Account getAccount(int accNo) throws Exception {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM accounts WHERE account_number=?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, accNo);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Account acc = new Account(
                    rs.getInt("account_number"),
                    rs.getString("name"),
                    rs.getString("account_type"),
                    rs.getDouble("balance"),
                    rs.getString("status")
            );
            con.close();
            return acc;
        }
        rs.close();
        con.close();
        return null;
    }

    public void updateBalance(int accNo, double balance) throws Exception {
        Connection con = DBConnection.getConnection();
        String sql = "UPDATE accounts SET balance=? WHERE account_number=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setDouble(1, balance);
        stmt.setInt(2, accNo);
        stmt.executeUpdate();
        con.close();
    }
}
