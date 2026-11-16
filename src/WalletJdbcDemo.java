import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletJdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/apex_wallet_db";
        String user = "postgres";
        String password = "Your_Password";

        String sql = "SELECT wallet_id, owner_name, balance_in_paise FROM wallets WHERE owner_name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "Prajwal");

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    long id = rs.getLong("wallet_id");
                    long balance = rs.getLong("balance_in_paise");
                    System.out.println("Found Wallet #" + id + " | Balance: " + balance + " paise");
                } else {
                    System.out.println("No wallet found!");
                }
            }
        } catch (SQLException ex) {
            System.err.println("Database error: " + ex.getMessage());
        }
    }
}
