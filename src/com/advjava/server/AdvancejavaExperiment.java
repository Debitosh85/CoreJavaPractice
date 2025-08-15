
package com.advjava.server;
import java.sql.*;
public class AdvancejavaExperiment
{
public static void main(String[] args)
{
try {
//step-1 : Loading driver
Class.forName("oracle.jdbc.driver.OracleDriver");
//step-2 : Creating Connection to Database product
Connection con = DriverManager.getConnection
("jdbc:oracle:thin:@localhost:1521:xe","c##mydb40","oracle");
//step-3 : Preparing JDBC-statement
Statement stm = con.createStatement();
//step-4 : Executing query
ResultSet rs = stm.executeQuery("select * from BookDetails71");
System.out.println("------BookDetails-----");
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"
+rs.getString(2)+"\t"
+rs.getString(3)+"\t"
+rs.getFloat(4)+"\t"
+rs.getInt(5));
}//end of while
//step-5 : Close the Connection from Database product
con.close();
}catch(Exception e) {
e.printStackTrace();
}
}
}
