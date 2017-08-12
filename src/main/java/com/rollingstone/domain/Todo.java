package com.rollingstone.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "todo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String taskName;
	
	@Column(nullable = false)
	private String taskDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
