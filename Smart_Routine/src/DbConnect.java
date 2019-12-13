import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Code Warriors 
 */
public class DbConnect {
     static Connection conn=null;
//    private Statement st;
//    private ResultSet rs;
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost/project";
            String user="root";
            String pass="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection(url, user, pass);
            //JOptionPane.showConfirmDialog(null, "Connected to database", "Database Connect", JOptionPane.DEFAULT_OPTION);
            return conn;
        } catch (Exception e) {
        
        JOptionPane.showConfirmDialog(null, "Database Not Founding", "Database Connect", JOptionPane.ERROR_MESSAGE);
        return conn;
        }
        
        
//        try {

//            
//            Class.forName("com.mysql.jdbc.Driver");
//            conn=(Connection) DriverManager.getConnection(url, user, pass);
//        } catch (SQLException e) {
//            System.out.println("Error"+e.getMessage());
//        }catch(ClassNotFoundException ex){
//            System.out.println("Error"+ex.getMessage());
//        }
//        finally{
//            return conn;
//        }
//    }
//        public ResultSet searchQuery(String sql){
//            try {
//                getConnection();
//                st=(Statement) conn.createStatement();
//                rs= st.executeQuery(sql);
//            } catch (SQLException e) {
//                System.out.println("Error"+e.getMessage());
//            } 
//            return rs;
  
        }
}
