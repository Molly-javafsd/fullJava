package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class TutionDAO {
private JdbcTemplate temp;


public void setTemp(JdbcTemplate temp) {
	this.temp = temp;
}

public int insert(Tution t) {
	 String sql="insert into tution values("+t.gettId()+",'"+t.gettName()+"','"+t.gettType()+"',"+t.getPhno()+")";
	 System.out.println(sql);
	 return temp.update(sql);
 }

public int update(Tution t) {
	String sql="update tution set tname='"+t.gettName()+"' where tid= "+t.gettId();
	System.out.println(sql);
	return temp.update(sql);
}
public int delete(Tution t) {
	String sql="delete from tution where tid="+t.gettId();
	System.out.println(sql);
	return temp.update(sql);
}

public List<Tution> getAll(){
	String sql="select * from tution";
	return temp.query(sql, new ResultSetExtractor<List<Tution>>(){

		public List<Tution> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Tution> li= new ArrayList<Tution>();
			while(rs.next()) {
				Tution t=new Tution();
				t.settId(rs.getInt(1));
				t.settName(rs.getString(2));
				t.settType(rs.getString(3));
				t.setPhno(rs.getLong(4));
				li.add(t);
			}
			return li;
		}
		
		
		
		
		
	});
}
}
