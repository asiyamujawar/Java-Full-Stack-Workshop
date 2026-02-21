//overloading

class Testoverlaod{

	void add(int a){

		a++;
		System.out.println(a);
	}
	void add(int a, int b){

		System.out.println(a+b);
	}
	public static void main(String[] args){

		Testoverlaod t=new Testoverlaod();
		Testoverlaod t1=new Testoverlaod();
		System.out.println(t);
		System.out.println(t1);
		t.add(1);
		t.add(1,2);
		
	
	}

	 public String toString(){

 	    	return "This is an instance of Testoverlaod class";
   	}

}


/*
t -> ndew object in heap memory
t will be stored in main method call stack
if we try bto print a ref variable- toString() method object will be called 

we must overide it to have our owb way of describing the object because we know 

*/