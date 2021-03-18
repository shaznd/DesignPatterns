package com.reflection;

public class Contact {

	 public String name;

	@Override
	public String toString() {
		
		 String temp="";
		if (this instanceof FriendContact) {
		
				temp=  "FriendContact [phoneNo=" + ((FriendContact)this).phoneNo + ", name=" + name + "]";
			}
		
		else if(this instanceof WorkContact ) {
			       temp=  "WorkContact [email=" + ((WorkContact)this).email + ", name=" + name + "]";
		}
		return temp;
	}
	 
	 
	 
}
