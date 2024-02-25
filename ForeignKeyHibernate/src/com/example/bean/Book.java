package com.example.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {
			@Id
			private int bid;
			private String title;
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name="id")
			private Author author;
			public int getBid() {
				return bid;
			}
			public void setBid(int bid) {
				this.bid = bid;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public Author getAuthor() {
				return author;
			}
			public void setAuthor(Author author) {
				this.author = author;
			}

}
