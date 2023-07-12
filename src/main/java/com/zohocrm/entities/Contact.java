package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name= "contacts")
public class Contact extends AbstractClass {
		
		@Column(name="first_name" , nullable=false)
		 private String firstname;
		 
		@Column(name="last_name" , nullable=false)	
		 private String lastname;
		 
		@Column(name="email" , nullable=false, unique=true)	
		 private String email;
		 
		@Column(name="mobile" , nullable=false , unique=true)	
		 private Long mobile;
		 
		 private String source;

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getMobile() {
			return mobile;
		}

		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}
		 
		 
		 
		 
		 
}
