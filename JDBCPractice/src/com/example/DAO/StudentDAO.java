package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.dbUtil.DbUtil;
import com.example.pojo.Student;

public class StudentDAO {

	public int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("Connection with DB established!!");
		}
		else {
			System.out.println("Connection Failed!!");
		}
		
//		Statement st=con.createStatement();
//		String sql="insert into Student values("+s.getId()+",'"+s.getName()+"','"+s.getEmail()+"','"+s.getAddress()+"')";
//		System.out.println(sql);
//		int row=st.executeUpdate(sql);
		
		String sql="insert into Student values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getEmail());
		ps.setString(4, s.getAddress());
		int row=ps.executeUpdate();
		return row;
	}
	public int update(Student s) throws SQLException, ClassNotFoundException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("Connection with DB established!!");
		}
		else {
			System.out.println("Connection Failed!!");
		}
//		Statement st=con.createStatement();
//		String sql="update Student set name='"+s.getName()+"' where id="+s.getId();
//		int row=st.executeUpdate(sql);
		
		String sql="update Student set name=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, s.getName());
		ps.setInt(2, s.getId());
		int row=ps.executeUpdate();
		return row;
	}
	public int delete(Student s) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("Connection with DB established!!");
		}
		else {
			System.out.println("Connection Failed!!");
		}
//		Statement st=con.createStatement();
//		String sql="delete from Student where id="+s.getId();
//		int row=st.executeUpdate(sql);
		
		String sql="delete from Student where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.getId());
		int row=ps.executeUpdate();
		return row;
	}
	public List<Student> getAll() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("Connection with DB established!!");
		}
		else {
			System.out.println("Connection Failed!!");
		}
//		Statement st=con.createStatement();
//		String sql="select * from Student";
//		List<Student> list=new ArrayList<>();
//		ResultSet rs=st.executeQuery(sql);
//		while(rs.next()) {
//			Student s=new Student();
//			s.setId(rs.getInt(1));
//			s.setName(rs.getString(2));
//			s.setEmail(rs.getString(3));
//			s.setAddress(rs.getString(4));
//			list.add(s);
//		}
//		return list;
		
		String sql="select * from Student";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Student> list=new ArrayList<>();
		while(rs.next()) {
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setAddress(rs.getString(4));
			list.add(s);
		}
		return list;
		
	}
}
