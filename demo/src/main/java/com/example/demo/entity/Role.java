package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "roles")
public class Role {
	 @Id
	    @Column(name = "role_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	     
	    private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Role(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Role() {
			super();
			
		}

		@Override
		public String toString() {
			return "Role [id=" + id + ", name=" + name + "]";
		}
		
}
