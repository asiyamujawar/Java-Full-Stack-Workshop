// inheritance

class Father{
	int age=50;
	void job(){
		System.out.println("Worker");
	}
	void property(){
		System.out.println("a house in native");

	}
	void hobby(){
		System.out.println("travel blogging football table tennis");

	}
}

class Daughter extends Father{
	int age = 21;
	void job(){
		System.out.println("Student");
	}
	void property(){
		System.out.println("nothing too special");

	}
	void hobby(){
		System.out.println("mobile game social media");

	}

	public static void main(String[] args){
		Father f = new Father();
		f.job();
		f.property();
		f.hobby();
		Daughter d = new Daughter();
		d.job();
		d.property();
		d.hobby();
		
	}

}