package com.cdac.encapculation_learn;

import com.cdac.encapculation.person;

public class maininEncapsulation {
  
	    public static void main(String[] args) {
			    person p1 = new person();
			     
			     p1.setAge(23,"sunil");
			     p1.getAge();
			     
			     p1.count = 50;
			     
			     person p2 =  new person();
			     System.out.println(p2.count);
			     System.out.println(person.count);  // count is static member that's we can access this by using just a class name also
			     
			    
		}
}
