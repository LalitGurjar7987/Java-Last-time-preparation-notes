import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBCUsingThread extends Thread {
    int roll;
    String name;

    public DBCUsingThread(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
  public void run() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ DBUThrid",
                    "root",
                    "Root");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO Thread(id, name) VALUES(?, ?)");

            ps.setInt(1, roll);
            ps.setString(2, name);
            int rows = ps.executeUpdate();

            System.out.println(
                    Thread.currentThread().getName()
                            + " inserted "
                            + rows
                            + " row(s)");
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        DBCUsingThread t1 = new DBCUsingThread(101, "Lalit");
        DBCUsingThread t2 = new DBCUsingThread(102, "Gurjar");
        DBCUsingThread t3 = new DBCUsingThread(103, "Patel");

        t1.start();
        t2.start();
        t3.start();
    }
}