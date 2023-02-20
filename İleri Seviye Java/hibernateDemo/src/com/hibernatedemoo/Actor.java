package com.hibernatedemoo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {
		@Id
		@Column(name="actor_id")	
		private int id;
		
		@Column(name="first_name")	
		private String name;
		
		@Column(name="last_name")
		private String lastname;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
}
