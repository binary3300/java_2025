package com.company.dao;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.DBManager.DBManager;
import com.company.domain.BoardVo;

public class BoardDao { //컨트롤 쉬프트 o
//	1. 글쓰기	insert into board ( btitle, bcontent, bname, bip ) values ( ?, ?, ?, ? );
	public int insert( BoardVo vo ){ //##
		String sql = "insert into board ( btitle, bcontent, bname, bip ) values ( ?, ?, ?, ? )";
		int result = -1;
		
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getBtitle());
			pstmt.setString(2, vo.getBcontent());
			pstmt.setString(3, vo.getBname());
			pstmt.setString(4, InetAddress.getLocalHost().getHostAddress());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {e.printStackTrace(); 
		} finally {
			//if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////
		
		return result;
	} //end insert
//
//	2. 최신글 읽기	select * from board order by nbo desc;
	public ArrayList<BoardVo> selectAll(){ 
		String sql = "select * from board order by bno desc";
		ArrayList<BoardVo> result = new ArrayList<>();
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery(); //표
			while(rset.next()){ //줄
				result.add( new BoardVo(
						rset.getInt("bno")			, rset.getString("btitle"),
						rset.getString("bcontent")	, rset.getString("bname"),
						rset.getInt("bhit")			, rset.getString("bdate"),
						rset.getString("bip")
					) );
			}
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////
		
		return result;
	} //end selectAll
//
//	3. 해당글 읽기	select * from board "where bno=?";
//	    해당글 수정폼(유저가보는거)	select * from board "where bno=?";	#읽기랑 겹친당 
	public BoardVo select(int bno){ 
		String sql = "select * from board where bno=?";
		BoardVo result = new BoardVo();
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rset = pstmt.executeQuery(); //표
			if(rset.next()) { //줄
				result = new BoardVo(
							rset.getInt("bno")			, rset.getString("btitle"),
							rset.getString("bcontent")	, rset.getString("bname"),
							rset.getInt("bhit")			, rset.getString("bdate"),
							rset.getString("bip")
						);
			}
			
			//int bno, String btitle, String bcontent, String bname, int bhit, String bdate, String bip) { super(); this.bno = bno; this.btitle = btitle; this.bcontent = bcontent; this.bname = bname; this.bhit = bhit; this.bdate = bdate; this.bip = bip;
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////
		return result;
	} //end select
//
//	4. 조회수		update board set bhit=bhit+1 where bno=?;
	public int updateHit(int bno){ 
		String sql = "update board set bhit=bhit+1 where bno=?";
		int result = -1;
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,bno);
			result = pstmt.executeUpdate(); 
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			//if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////
		return result;
	} //end update
//
//	5. 해당 글 수정	update "board set btitle=?, bcontrnt=? where bno=?";
	public int update(BoardVo vo){ //넘겨주는값
		String sql = "update board set btitle=?, bcontent=? where bno=?";
		int result = -1;
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getBtitle());
			pstmt.setString(2, vo.getBcontent());
			pstmt.setInt(3, vo.getBno());
			
			result = pstmt.executeUpdate(); 
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			//if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////
		return result;
	} //end update
//
//	6. 해당 글 삭제	delete from board where "bno=?";
	public int delete(int bno){ 
		String sql = "delete from board where bno=?";
		int result = -1;
		///////////////////////////////////////////////////////
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;
		//DB연동
		conn = db.getConnection();
		
		//sql처리
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,bno); //##
			result = pstmt.executeUpdate(); //##
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			//if(rset != null) {try { rset.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) {e.printStackTrace(); }}
			if(conn != null) {try { conn.close(); } catch (SQLException e) {e.printStackTrace(); }}
		}
		///////////////////////////////////////////////////////\
		return result;
	} //end update delete
	
	
}
/*
	1. 글쓰기	insert into board ( btitle, bcontent, bname, bip ) values ( ?, ?, ?, ? );
	public int insert( BorderVo vo ){ return 0; }

	2. 최신글 읽기	select * from board order by nbo desc;
	public ArrayList<BorderVo> selectAll(){ return null; }

	3. 해당글 읽기	select * from board "where bno=?";
	    해당글 수정폼(유저가보는거)	select * from board "where bno=?";	#읽기랑 겹친당 
	public BorderVo select(int bno){ return null; }

	4. 조회수		update board set bhit=bhit+1 where bno=?;
	public int updateHit(int bno){ return 0; }

	5. 해당 글 수정	update "board set btitlr=?, bcontrnt=? where bno=?";
	public int update(BorderVo vo){ return 0; }

	6. 해당 글 삭제	delete from board where "bno=?";  zzzz>num=?;
	public int delete(int bno){ return 0; }

 * */
