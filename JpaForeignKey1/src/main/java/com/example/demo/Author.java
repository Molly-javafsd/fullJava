package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Author {
@Id
private int id;
private String aname;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "author_book",
joinColumns = {@JoinColumn(name="aid",referencedColumnName = "id")},
inverseJoinColumns = {@JoinColumn(name="bid",referencedColumnName = "id")}
		)

private List<Book> book;
}
