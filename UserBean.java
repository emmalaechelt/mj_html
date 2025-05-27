package edu.ruby.java.ch12;

import java.io.Serializable;

public class UserBean implements Serializable {

		private static final long serialVersionUID = 123;
		private String id;
		private String name;
		private String tel;
		private String address;

		public UserBean() {
		}

		public UserBean(String id, String name, String tel, String address) {
			super();
			this.id = id;
			this.name = name;
			this.tel = tel;
			this.address = address;
		}

		public String geID() {
			return id;
		}
		
		public void setID(String ID) {
			this.id = id;
		}		
		
		public String getName() {
			return name;
		}
		
		public void setName(String Name) {
			this.name = name;
		}

		public String getTel() {
			return tel;
		}
		
		public void setTel(String Tel) {
			this.tel = tel;
		}
		
		public String getAddress() {
			return address;
		}

		public void setAddress(String Address) {
			this.address = address;
		}
		public void test() {
		}
		
		@Override
		public String toString() {
			return "UserBean [id=" + id + ", name=" + name + ", tel=" + tel + ", address=" + address + "]";
		}
}
