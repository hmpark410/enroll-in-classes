package ClassDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ClassController.JDBCUtil;
import ClassVO.ProfessorVO;
import ClassVO.StudentVO;

public class ProfessorDAO {
	private static ProfessorDAO dao = new ProfessorDAO();
	   
	private ProfessorDAO() {}
	
	public static ProfessorDAO getInstance() {
		return dao;
	}
	
	private Connection conn=null;
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	public ProfessorVO userSearch2(ProfessorVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      String sql= "select * from professor where id=? and passwd=?";
	      ProfessorVO user = null;
	      System.out.println("==> JDBC로 userSearch2() : "+sql);
	      try {
				conn=(Connection) JDBCUtil.getConnection();
				stmt=conn.prepareStatement(sql);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getPassword());
				rs = stmt.executeQuery();
	         while(rs.next()) {
	            user = new ProfessorVO();
	            user.setId(rs.getString(1));
	            user.setPassword(rs.getString(2));
	            user.setName(rs.getString(3));
	            user.setEmail(rs.getString(4));
	            user.setPhone(rs.getString(5));
	            user.setAuthority(rs.getString(6));
	         }
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	      return user;
	   }
	
	public ProfessorVO professorSearch2(String id) {
		Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    String sql="select * from professor where id=?";
	    ProfessorVO professor=null;
	    System.out.println("==> JDBC로 professorSearch() : "+sql);
	    try {
	    	conn=(Connection) JDBCUtil.getConnection();
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
         while(rs.next()) {
        	 professor = new ProfessorVO();
        	 professor.setId(rs.getString(1));
        	 professor.setPassword(rs.getString(2));
        	 professor.setName(rs.getString(3));
        	 professor.setEmail(rs.getString(4));
        	 professor.setPhone(rs.getString(5));
         	}
	    }
         catch(Exception e) {}
	     finally {
	    	  JDBCUtil.close(conn,stmt);
	     }
	      return professor;
	    }
	
	public void professorUpdate(ProfessorVO professor) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql="update professor set passwd=?, name=?, email=?, phone=? where id=?";
	      System.out.println("==> JDBC로 professorUpdate() : "+sql);
	      try {
	    	  conn=(Connection) JDBCUtil.getConnection();
	    	  stmt=conn.prepareStatement(sql);
	          stmt.setString(1,  professor.getPassword());
	          stmt.setString(2,  professor.getName());
	          stmt.setString(3,  professor.getEmail());
	          stmt.setString(4,  professor.getPhone());
	          stmt.setString(5,  professor.getId());
	          stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }

}
