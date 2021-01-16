package DataBaseConn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 
/**
 *
 * @author sqlitetutorial.net
 */
public class sqldatabaseconn {
 Connection conn = null;
// ResultSet r ;
    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    public Connection connect() {
    //   String url = "jdbc:ucanaccess:///media/root/PROGRAMMING2/JAVA/Restaurants_Manager1/Restaurants_Manager_db.accdb;memory=false";
    
         String url = "jdbc:ucanaccess:///media/safisoft/Data1/programming/JAVA/Restaurants_Manager1/Restaurants_Manager_db.accdb;memory=false";


    //    String url = "jdbc:ucanaccess://D:/Restaurants_Manager_db.accdb;memory=false";
        
    //   String url = "jdbc:ucanaccess://D:/SafiSoft_RM/dist/Restaurants_Manager_db.accdb;memory=false";
             
        System.out.println("Database Connected");
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
           
        }
        return conn;
    }
    
    
  
 
    /**
     * 
     *
     * @param name
     * @param capacity
     */
    public void insert(String tabel_name,String product_name, String product_description,String product_price) {
        String sql = "INSERT INTO "+tabel_name +" (product_name,product_description,product_price) VALUES(?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, product_name);
            pstmt.setString(2, product_description);
            pstmt.setString(3, product_price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
        }
    }
    
     public void insert_all_days_cashe(String tabel_name,String day_date, String day_total_deliviry,String day_total_takeaway,String day_total_all) {
        String sql = "INSERT INTO "+tabel_name +" (day_date,day_total_deliviry,day_total_takeaway,day_total_all) VALUES(?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, day_date);
            pstmt.setString(2, day_total_deliviry);
            pstmt.setString(3, day_total_takeaway);
            pstmt.setString(4, day_total_all);
            pstmt.executeUpdate();
        } catch (SQLException e) {
           
        }
    }
    
    
    public void insert_takeaway(String tabel_name,int order_num, String takeaway_details,int order_total,String order_date) {
        String sql = "INSERT INTO "+tabel_name +" (order_num,takeaway_details,order_total,order_date) VALUES(?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, order_num);
            pstmt.setString(2, takeaway_details);
            pstmt.setInt(3, order_total);
            pstmt.setString(4, order_date);
            pstmt.executeUpdate();
             System.out.println("insert done");
        } catch (SQLException e) {
           
        }
    }
    
    
    
    public void insert_gard(String tabel_name,String gard_product_name,String gard_product_count,String gard_product_total_price,String gard_order_num,String gard_time_and_date) {
        String sql = "INSERT INTO "+tabel_name +" (gard_product_name,gard_product_count,gard_product_total_price,gard_order_num,gard_time_and_date) VALUES(?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, gard_product_name);
            pstmt.setString(2, gard_product_count);
            pstmt.setString(3, gard_product_total_price);
            pstmt.setString(4, gard_order_num);
            pstmt.setString(5, gard_time_and_date);
            pstmt.executeUpdate();
             System.out.println("insert done");
        } catch (SQLException e) {
            
            System.out.println(e);
           
        }
    }
    
    
    
     public void insert_Deliviry(String tabel_name,int order_num, String Deliviry_details,int order_total,String order_date,String customer_name,String customer_phone,String customer_address) {
        String sql = "INSERT INTO "+tabel_name +" (order_num,takeaway_details,order_total,order_date,customer_name,customer_phone,customer_address) VALUES(?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, order_num);
            pstmt.setString(2, Deliviry_details);
            pstmt.setInt(3, order_total);
            pstmt.setString(4, order_date);
            pstmt.setString(5, customer_name);
            pstmt.setString(6, customer_phone);
            pstmt.setString(7, customer_address);
            pstmt.executeUpdate();
             System.out.println("insert done");
        } catch (SQLException e) {
            
        }
    }
    
     public void insert_costmer_data(String tabel_name,String costmer_name, String costmer_mobile,String costmer_phone,String costmer_address,String floor,String aprt_num, String know_sign,String aria,int aria_cost) {
        String sql = "INSERT INTO "+tabel_name +" (costmer_name,costmer_mobile,costmer_phone,costmer_address,floor,aprt_num,know_sign,aria,aria_cost) VALUES(?,?,?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, costmer_name);
            pstmt.setString(2, costmer_mobile);
            pstmt.setString(3, costmer_phone);
            pstmt.setString(4, costmer_address);
            pstmt.setString(5, floor);
            pstmt.setString(6, aprt_num);
            pstmt.setString(7, know_sign);
            pstmt.setString(8, aria);
            pstmt.setInt(9, aria_cost);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
     
      public void insert_supplier_data(String tabel_name,String supplier_name, String supplier_phone,String supplier_company,String supplier_hint) {
        String sql = "INSERT INTO "+tabel_name +" (supplier_name,supplier_phone,supplier_company,supplier_hint) VALUES(?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, supplier_name);
            pstmt.setString(2, supplier_phone);
            pstmt.setString(3, supplier_company);
            pstmt.setString(4, supplier_hint);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
        }
    }
      
       public void insert_supplier_dealings(String tabel_name,String supplier_name, String supplier_phone,String supplier_company,String supplier_hint,String type_of_goods,String he_want,String i_want,String transaction_date,String transaction_hint) {
        String sql = "INSERT INTO "+tabel_name +" (supplier_name,supplier_phone,supplier_company,supplier_hint,type_of_goods,he_want,i_want,transaction_date,transaction_hint) VALUES(?,?,?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, supplier_name);
            pstmt.setString(2, supplier_phone);
            pstmt.setString(3, supplier_company);
            pstmt.setString(4, supplier_hint);
            pstmt.setString(5, type_of_goods);
            pstmt.setString(6, he_want);
            pstmt.setString(7, i_want);
            pstmt.setString(8, transaction_date);
            pstmt.setString(9, transaction_hint);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
      
      
    
    
     public void insert_Aria(String tabel_name,String Aria, int Cost) {
        String sql = "INSERT INTO "+tabel_name +" (Aria,Cost) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Aria);
            pstmt.setInt(2, Cost);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
        }
    }
    
    public void update_order_num(String Tabel_name,int _id, int total_order_num) {
        String sql = "UPDATE "+Tabel_name+" SET total_order_num = ?  WHERE _id = ?";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,total_order_num);
             pstmt.setInt(2,_id); 
            pstmt.executeUpdate();
        } catch (SQLException e) {   
        }
    }
    
     public void update_login_data(String Tabel_name,int _id, String username,String password) {
        String sql = "UPDATE "+Tabel_name+" SET username = ? ,"+" password = ? "+" WHERE  _id = ?";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,username);
             pstmt.setString(2,password); 
             pstmt.setInt(3, _id);
            pstmt.executeUpdate();
             System.out.println("updatee log");
        } catch (SQLException e) {  
            
        }
    }
     
    
     public void update_customer_data(String tabel_name,String costmer_name, String costmer_mobile,String costmer_phone,String costmer_address,String floor,String aprt_num, String know_sign,String aria,int aria_cost,int _id) {
String sql = "UPDATE "+tabel_name+" SET costmer_name = ? , "
                + "costmer_mobile = ?, "
                + "costmer_phone = ?, "
                + "costmer_address = ?, "
                + "floor = ?, "
                + "aprt_num = ?, "
                + "know_sign = ?, "
                + "aria = ?, "
                + "aria_cost = ? "
                + "WHERE _id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, costmer_name);
            pstmt.setString(2, costmer_mobile);
            pstmt.setString(3, costmer_phone);
            pstmt.setString(4, costmer_address);
            pstmt.setString(5, floor);
            pstmt.setString(6, aprt_num);
            pstmt.setString(7, know_sign);
            pstmt.setString(8, aria);
            pstmt.setInt(9, aria_cost);
            pstmt.setInt(10, _id);
            
            // update 
            pstmt.executeUpdate();
            System.out.println("updatee num done");
        } catch (SQLException e) {
           
        }
    }
     
     
       public void update_supplier_data(String tabel_name,String supplier_name,String supplier_phone,String supplier_company,String supplier_hint,int _id) {
       String sql = "UPDATE "+tabel_name+" SET supplier_name = ? , "
                + "supplier_phone = ?, "
                + "supplier_company = ?, "
                + "supplier_hint = ?"
                + "WHERE _id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, supplier_name);
            pstmt.setString(2, supplier_phone);
            pstmt.setString(3, supplier_company);
            pstmt.setString(4, supplier_hint);
            pstmt.setInt(5, _id);
            
            // update 
            pstmt.executeUpdate();
            System.out.println("updatee num done");
        } catch (SQLException e) {
           
        }
    }
       
        public void update_transaction_data(String tabel_name,String type_of_goods,String he_want,String i_want,String transaction_hint,int _id) {
       String sql = "UPDATE "+tabel_name+" SET type_of_goods = ? , "
                + "he_want = ?, "
                + "i_want = ?, "
                + "transaction_hint = ?"
                + "WHERE _id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, type_of_goods);
            pstmt.setString(2, he_want);
            pstmt.setString(3, i_want);
            pstmt.setString(4, transaction_hint);
            pstmt.setInt(5, _id);
            
            // update 
            pstmt.executeUpdate();
            System.out.println("updatee num done");
        } catch (SQLException e) {
           
        }
    }
     
    
    
    
    public void update(String Tabel_name,int _id, String product_name, String product_description,String product_price) {
        String sql = "UPDATE "+Tabel_name+" SET product_name = ? , "
                + "product_description = ?, "
                + "product_price = ? "
                + "WHERE _id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1,product_name);
            pstmt.setString(2, product_description);
            pstmt.setString(3, product_price);
            pstmt.setInt(4, _id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            
        }
    }
    
    
     public void delete(String tabel_name ,int _id) {
        String sql = "DELETE FROM "+tabel_name+" WHERE _id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, _id);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
           
        }
    }
     
      public void delete_all(String tabel_name ) {
        String sql = "DELETE FROM "+tabel_name+" ";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.executeUpdate();
        } catch (SQLException e) {
           
        }
    }
     
     
 
 

    
    
    
   
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
         
 
      
    }

   
 
}