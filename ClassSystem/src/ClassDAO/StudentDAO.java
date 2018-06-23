package ClassDAO;

import ClassController.JDBCUtil;
import ClassVO.StudentVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class StudentDAO {
	private static StudentDAO dao = new StudentDAO();
	   
	private StudentDAO() {}
	
	public static StudentDAO getInstance() {
		return dao;
	}
	
	private Connection conn=null;
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	 public void StudentInsert(StudentVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql= "insert into student (id,passwd,name) values (?,?,?);";
	      System.out.println("==> JDBC濡� userInsert() : "+sql);
	      try {
	         conn = (Connection) JDBCUtil.getConnection();
	         stmt = conn.prepareStatement(sql);
	         stmt.setString(1,  vo.getId());
	         stmt.setString(2,  vo.getPassword());
	         stmt.setString(3,  vo.getName());
	         stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	 
	 public StudentVO forgetPasswd(StudentVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      String sql= "select * from student where id=? and name=? and email=?";
	      StudentVO user = null;
	      System.out.println("==> JDBC嚥∽옙 forgetPasswd() : "+sql);
	      try {
				conn=(Connection) JDBCUtil.getConnection();
				stmt=conn.prepareStatement(sql);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getName());
				stmt.setString(3, vo.getEmail());
				rs = stmt.executeQuery();
	         while(rs.next()) {
	            user = new StudentVO();
	            user.setId(rs.getString(1));
	            user.setPassword(rs.getString(2));
	            user.setName(rs.getString(3));
	            user.setEmail(rs.getString(4));
	            user.setPhone(rs.getString(5));
	         }
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	      return user;
	   }


	public StudentVO userSearch(StudentVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      String sql= "select * from student where id=? and passwd=?";
	      StudentVO user = null;
	      System.out.println("==> JDBC濡� userSearch() : "+sql);
	      try {
				conn=(Connection) JDBCUtil.getConnection();
				stmt=conn.prepareStatement(sql);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getPassword());
				rs = stmt.executeQuery();
	         while(rs.next()) {
	            user = new StudentVO();
	            user.setId(rs.getString(1));
	            user.setPassword(rs.getString(2));
	            user.setName(rs.getString(3));
	            user.setEmail(rs.getString(4));
	            user.setPhone(rs.getString(5));
	         }
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	      return user;
	   }
	
	public StudentVO studentSearch(String id) {
		Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    String sql="select * from student where id=?";
	    StudentVO student=null;
	    System.out.println("==> JDBC濡� studentSearch() : "+sql);
	    try {
	    	conn=(Connection) JDBCUtil.getConnection();
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
         while(rs.next()) {
        	student = new StudentVO();
        	student.setId(rs.getString(1));
        	student.setPassword(rs.getString(2));
        	student.setName(rs.getString(3));
        	student.setEmail(rs.getString(4));
        	student.setPhone(rs.getString(5));
         	}
	    }
         catch(Exception e) {}
	     finally {
	    	  JDBCUtil.close(conn,stmt);
	     }
	      return student;
	    }
	
	public void studentUpdate(StudentVO student) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql="update student set passwd=?, name=?, email=?, phone=? where id=?";
	      System.out.println("==> JDBC濡� studentUpdate() : "+sql);
	      try {
	    	  conn=(Connection) JDBCUtil.getConnection();
	    	  stmt=conn.prepareStatement(sql);
	          stmt.setString(1,  student.getPassword());
	          stmt.setString(2,  student.getName());
	          stmt.setString(3,  student.getEmail());
	          stmt.setString(4,  student.getPhone());
	          stmt.setString(5,  student.getId());
	          stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	public void studentDelete(StudentVO student) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql="delete from student where id=?";
	      System.out.println("==> JDBC濡� studentDelete() : "+sql);
	      try {
	    	  conn=(Connection) JDBCUtil.getConnection();
	    	  stmt=conn.prepareStatement(sql);
	          stmt.setString(1, student.getId());
	          stmt.executeUpdate();

	      } catch (Exception e) {} 
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	 public ArrayList<StudentVO> studentList() {
	      ArrayList<StudentVO> list = new ArrayList<StudentVO> ();
	      Connection conn=null;
	      PreparedStatement stmt=null;
	      ResultSet rs = null;      
	      String sql= "select * from student ";
	      StudentVO student=null;
	      try {
	    	 conn=(Connection) JDBCUtil.getConnection();
	    	 stmt = conn.prepareStatement(sql);
	         rs = stmt.executeQuery();
	         while(rs.next()) {
	        	 student = new StudentVO();
	        	 student.setId(rs.getString(1));
	        	 student.setPassword(rs.getString(2));
	        	 student.setName(rs.getString(3));
	        	 student.setEmail(rs.getString(4));
	        	 student.setPhone(rs.getString(5));
	             list.add(student);   
	         }
	      } catch (Exception e) {} 
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	      return list;
	   }
	 
	}
	    