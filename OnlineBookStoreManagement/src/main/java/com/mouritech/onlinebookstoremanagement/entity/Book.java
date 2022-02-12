package com.mouritech.onlinebookstoremanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@
	private String bookISBN;
	private String bookName;
	private String author;
	private int eoq;
	private double price;
	private int noOfCopies;

}
