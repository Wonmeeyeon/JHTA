package meeyeon;

public class Person {
	
	String name;
	String email;
	int age;
	double weight;
	double height;
	
	Person() {}
	
	Person(String name, String email) {
		this(name, email,0,0.0,0.0);
	}
	
	Person(String name, String email, int age) {
		
		this(name,email,age,0.0,0.0);
	}
	
	Person(String name, String email, int age, double weight, double height) {
		this.name = name;
		 this.email = email;
		 this.age = age;
		 this.weight = weight;
		 this.height = height;
			
		}
	}


