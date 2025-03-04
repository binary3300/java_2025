package com.company.java011;

import com.company.java011_ex.Cat;

public class Modifier1_public {
public static void main(String[] args) {
	Cat cat = new Cat();
	cat.public_=10;
	//cat.protected_ 안보여용 cat cannot be resolved to a type
	//cat.package_ 안보여용 cat cannot be resolved to a type
	//cat.private_ 안보여용 cat cannot be resolved to a type
	cat.setPrivate_(100);
	
	System.out.println(cat.public_ + "/" + cat.getPrivate_());
	
	
}
}
