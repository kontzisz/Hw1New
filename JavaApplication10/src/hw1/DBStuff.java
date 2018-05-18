import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class DBStuff {

    Connection dbConn;
    Statement commStmt;
    ResultSet dbResults;
    ResultSetMetaData rsmd;

    public static void main(String[] args) {
        DBStuff stuff = new DBStuff();
        stuff.createTable();
    }
    //Creates tables depending on type 

    public void createTable() {
        String sqlCustomer = "Create Table Customer (CustID integer primary key, "
                + "name varchar(100), "
                + "phone integer,"
                + "address varchar(100))";
              

        String sqlProduct = "Create Table Product (prodID integer primary key, "
                + "name varchar(100), "
                + "price integer,"
                + "desc varchar(100))";
                

        String sqlSupplier = "Create Table Supplier(supID integer primary key, "
                + "name varchar(100), "
                + "address varchar(100),"
                + "contactName varchar(100),"
                + "contactPhone integer,"
                + "email varchar(100))";
                

        sendDBCommand(sqlCustomer);
        sendDBCommand(sqlProduct);
        sendDBCommand(sqlSupplier);
        
        String sqlStoreArea = "Create Table StoreArea(storeID integer primary key,"
                + "storeName varchar(100),"
                + "dept varchar(100),"
                + "desc varChar(100))";
    
               
        
        sendDBCommand(sqlStoreArea);
        
         String sqlService = "Create Table Service (serviceID integer primary key,"
                + "name varchar(100),"
                + "level varchar(100),"
                + "cellphone integer)";
                sendDBCommand(sqlService);

         String sqlTech = "Create Table Technician (techID integer primary key,"
                + "town varchar(100),"
                + "cellphone integer)";
                sendDBCommand(sqlTech);
 
   
    }
    
    //Primary key retrival even after app is closed and re-oppened
    public String getMaxPK(String pkColumn, String tableName) throws SQLException
    {

        
       String PK = "select max(";
       PK += "" + pkColumn + ") from javauser." + tableName
              + "";
       sendDBCommand(PK);
       String pk = "";
       while (dbResults.next())
       {

        pk = dbResults.getString("Max(" + pkColumn
                + ")");
        System.out.println(pk);
       }
       
       if (pk == null)
           pk = "0";
            
       
       return pk;
    }
    //int count = 0;


    public void sendDBCommand(String sqlQuery) {

        // Set up your connection strings
        // IF YOU ARE IN CIS330 NOW: use YOUR Oracle Username/Password
        String URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String userID = "javauser"; // Change to YOUR Oracle username
        String userPASS = "javapass"; // Change to YOUR Oracle password
        OracleDataSource ds;

        // Clear Box Testing - Print each query to check SQL syntax
        //  sent to this method.
        // You can comment this line out when your program is finished
        System.out.println(sqlQuery);

        // Lets try to connect
        try {
            // instantiate a new data source object
            ds = new OracleDataSource();
            // Where is the database located? Web? Local?
            ds.setURL(URL);
            // Send the user/pass and get an open connection.
            dbConn = ds.getConnection(userID, userPASS);
            // When we get results
            //  -TYPE_SCROLL_SENSITIVE means if the database data changes we
            //   will see our resultset update in real time.
            //  -CONCUR_READ_ONLY means that we cannot accidentally change the
            //   data in our database by using the .update____() methods of
            //   the ResultSet class - TableView controls are impacted by
            //   this setting as well.
            commStmt = dbConn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // We send the query to the DB. A ResultSet object is instantiated
            //  and we are returned a reference to it, that we point to from
            // dbResults.
            // Because we declared dbResults at the datafield level
            // we can see the results from anywhere in our Class.
            dbResults = commStmt.executeQuery(sqlQuery); // Sends the Query to the DB
            // The results are stored in a ResultSet structure object
            // pointed to by the reference variable dbResults
            // Because we declared this variable globally above, we can use
            // the results in any method in the class.
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
