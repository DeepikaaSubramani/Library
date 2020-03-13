package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
//it is used for createdat & updateat
@EntityListeners(AuditingEntityListener.class)

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@NotBlank
	private String name;

	@NotBlank
	private String authorName;

	@NotNull
	public int price;

	@NotNull
	private int edition;

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	public void setId(long id) {
		Id = id;
	}

	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "book")
	private List<Students> students;

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	@Column(nullable = false, updatable = false) // to create column without null values and not to be updated
	@Temporal(TemporalType.TIMESTAMP) // to get the current time
	@CreatedDate // to get the date created and will not be modified
	private Date CreatedAt;

	@Column(nullable = false) // to create column without null values
	@Temporal(TemporalType.TIMESTAMP) // to get the current time
	@LastModifiedDate // to get the last modified row time and date
	private Date UpdatedAt;

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", authorName=" + authorName + ", price=" + price + ", Edition="
				+ edition + ", students=" + students + ", CreatedAt=" + CreatedAt + ", UpdatedAt=" + UpdatedAt + "]";
	}

}
