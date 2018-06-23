package ClassController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/class?useUnicode=true&characterEncoding=utf8","root","cs1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
	return null;	
	}
	

	 public static void close(Connection conn, PreparedStatement ps) {
	      if(ps != null) {
	         try {
	        	 if(!ps.isClosed())ps.close();
	         }catch(Exception e) {
	            e.printStackTrace();
	         }finally {
	        	 ps=null;
	         }
	      }
	      if(conn != null) {
	         try {
	            if(!conn.isClosed()) conn.close();
	         }catch(Exception e) {
	        	 e.printStackTrace();
	         }finally {
	        	 ps=null;
	         }
	      }
	   }
	 
	 
	 public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
	     if(rs != null) {
	    	 try {
		           if(!rs.isClosed())rs.close();
		         }catch(Exception e) {
		            e.printStackTrace();
		         }finally {
		        	 rs=null;
		         }
	     }
		 
		 if(ps != null) {
			 try {
				 	if(!ps.isClosed())ps.close();
         		 }catch(Exception e) {
         			 e.printStackTrace();
         		 }finally {
         			 ps=null;
         		 }
	      }
		 if(conn != null) {
			 try {
				 	if(!conn.isClosed())conn.close();
         		 }catch(Exception e) {
         			 e.printStackTrace();
         		 }finally {
         			 conn=null;
         		 }
	      }
	   }
	
}
