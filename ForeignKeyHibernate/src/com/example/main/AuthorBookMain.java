package com.example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.example.bean.Author;
import com.example.bean.Book;

public class AuthorBookMain {
public static void main(String[] args) {
	
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	
	Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	
	Session session=sf.openSession();

	Transaction tran=session.beginTransaction();
	
Author au=new Author();
	au.setId(1);
	au.setName("molly");
	au.setEmail("m@c.c");
	session.save(au);
	
	
	Book book=new Book();
	book.setBid(101);
	book.setTitle("java");
	book.setAuthor(au);
	session.save(book);
	
//	Query q=session.createQuery("select name from Author join Book as Book.id=Author.id and Book.title=java");
//	String authorname= (String) q.uniqueResult();
	tran.commit();
	session.close();
	sf.close();

}
}
