package ClassDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ClassController.JDBCUtil;
import ClassVO.StudentVO;
import ClassVO.classVO;
import ClassVO.resultVO;

public class resultDAO {
	private static resultDAO dao = new resultDAO();
	
	private resultDAO() {}
	
	public static resultDAO getInstance() {
		return dao;
	}
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void classInsert(resultVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql= "insert into result values (?,?,?,?,?,?);";
	      System.out.println("==> JDBC ClassInsert() : "+sql);
	      try {
	         conn = (Connection) JDBCUtil.getConnection();
	         stmt = conn.prepareStatement(sql);
	         stmt.setString(1,  vo.getId());
	         stmt.setString(2,  vo.getNumber());
	         stmt.setString(3, vo.getGrade());
	         stmt.setString(4, vo.getName());
	         stmt.setString(5, vo.getCredit());
	         stmt.setString(6, vo.getProfessor());
	         stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	public void resultDelete(resultVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql= "delete from result where number=?;";
	      System.out.println("==> JDBC嚥∽옙 resultdelete() : "+sql);
	      try {
	         conn = (Connection) JDBCUtil.getConnection();
	         stmt = conn.prepareStatement(sql);
	         stmt.setString(1,  vo.getNumber());
	         stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	 public ArrayList<resultVO> resultList(resultVO vo) {
	      ArrayList<resultVO> list = new ArrayList<resultVO> ();
	      Connection conn=null;
	      PreparedStatement stmt=null;
	      ResultSet rs = null;      
	      String sql= "select * from result where id=? ";
	      resultVO result=null;
	      try {
	    	 conn=(Connection) JDBCUtil.getConnection();
	    	 stmt = conn.prepareStatement(sql);
	    	 stmt.setString(1, vo.getId());
	         rs = stmt.executeQuery();
	         while(rs.next()) {
	        	 result = new resultVO();
	        	 result.setId(rs.getString(1));
	        	 result.setNumber(rs.getString(2));
	        	 result.setGrade(rs.getString(3));
	        	 result.setName(rs.getString(4));
	        	 result.setCredit(rs.getString(5));
	        	 result.setProfessor(rs.getString(6));
	             list.add(result);   
	         }
	      } catch (Exception e) {} 
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	      return list;
	   }
}
