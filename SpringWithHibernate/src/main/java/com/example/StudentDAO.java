package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {
HibernateTemplate temp;

public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}

	public int insert(Student s) {
		return (Integer) temp.save(s);
	}
	public String update(Student s) {
		temp.saveOrUpdate(s);
		return "Updated";
	}
	public String delete(Student s) {
		temp.delete(s);
		return "Deleted";
	}
	
	
	public List<Student> getAll(){
		String sql="from Student";
		return (List<Student>) temp.find(sql);
	}
}
