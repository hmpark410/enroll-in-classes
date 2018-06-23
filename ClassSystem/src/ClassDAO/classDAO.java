package ClassDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ClassVO.classVO;
import ClassVO.resultVO;
import ClassController.JDBCUtil;

public class classDAO {
	private static classDAO dao = new classDAO();
	
	private classDAO() {}
	
	public static classDAO getInstance() {
		return dao;
	}
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void classInsert(classVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql= "insert into enrollment values (?,?,?,?,?,?);";
	      System.out.println("==> JDBC濡� classInsert() : "+sql);
	      try {
	         conn = (Connection) JDBCUtil.getConnection();
	         stmt = conn.prepareStatement(sql);
	         stmt.setInt(1,  vo.getNumber());
	         stmt.setString(2,  vo.getGrade());
	         stmt.setString(3,  vo.getName());
	         stmt.setInt(4, vo.getCredit());
	         stmt.setString(5, vo.getProfessor());
	         stmt.setString(6, vo.getMajor());
	         stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	public classVO enrollmentSearch(classVO vo) {
		String sql = "select * from enrollment where major=?";	
		classVO cs =null;
		try {
			conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getMajor());
            rs = pstmt.executeQuery();
			while(rs.next()) {
				cs = new classVO();
				cs.setNumber(rs.getInt(1));
				cs.setGrade(rs.getString(2));
				cs.setName(rs.getString(3));
				cs.setCredit(rs.getInt(4));
				cs.setProfessor(rs.getString(5));
				cs.setMajor(rs.getString(6));
			}
		}
		catch (Exception e) {
	       	 e.printStackTrace();
	        } 
	        finally {
	       	 JDBCUtil.close(conn, pstmt, rs);
	        }
		return cs;
	}
	
	public ArrayList<classVO> classDeleteSearch(classVO vo) {
		String sql = "select * from enrollment where number=?";
		ArrayList<classVO> list = new ArrayList<classVO> ();		
		classVO cs =null;
		try {
			conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getNumber());
            rs = pstmt.executeQuery();
			while(rs.next()) {
				cs = new classVO();
				cs.setNumber(rs.getInt(1));
				cs.setGrade(rs.getString(2));
				cs.setName(rs.getString(3));
				cs.setCredit(rs.getInt(4));
				cs.setProfessor(rs.getString(5));
				cs.setMajor(rs.getString(6));
				list.add(cs);
				
			}
		} catch (Exception e) {
       	 e.printStackTrace();
        } 
        finally {
       	 JDBCUtil.close(conn, pstmt, rs);
        }
		return list;
	}
	
	public void classDelete(classVO vo) {
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      String sql= "delete from enrollment where number=?;";
	      System.out.println("==> JDBC濡� classdelete() : "+sql);
	      try {
	         conn = (Connection) JDBCUtil.getConnection();
	         stmt = conn.prepareStatement(sql);
	         stmt.setInt(1,  vo.getNumber());
	         stmt.executeUpdate();
	      }
	      catch(Exception e) {}
	      finally {
	    	  JDBCUtil.close(conn,stmt);
	      }
	   }
	
	public ArrayList<classVO> enrollment(classVO vo) {
		String sql = "select * from enrollment where major=?";
		ArrayList<classVO> list = new ArrayList<classVO> ();		
		classVO cs =null;
		try {
			conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getMajor());
            rs = pstmt.executeQuery();
			while(rs.next()) {
				cs = new classVO();
				cs.setNumber(rs.getInt(1));
				cs.setGrade(rs.getString(2));
				cs.setName(rs.getString(3));
				cs.setCredit(rs.getInt(4));
				cs.setProfessor(rs.getString(5));
				cs.setMajor(rs.getString(6));
				list.add(cs);
				
			}
		} catch (Exception e) {
       	 e.printStackTrace();
        } 
        finally {
       	 JDBCUtil.close(conn, pstmt, rs);
        }
		return list;
	}
	
	
}
