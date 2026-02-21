/*
local variables - inside methods or as arg -have no default values
instance variable - per object
static variable - per class - have default values
*/
class Employee{
	int id;
	String name;
	int salary;
	static int count;
	
	Employee(int eid, String ename, int esalary){
		System.out.println("employee object created using 3 arg constructor");
		this.id=eid;
		this.name=ename;
		this.salary=esalary;
		count++;
		System.out.println(count);
	}

	Employee(){
		count++;
		System.out.println(count);	
	}

	public static void main(String[] args){
		Employee e = new Employee();
		System.out.println("e.id:"+e.id);
		System.out.println("e.name:"+e.name);
		System.out.println("e.salary:"+e.salary);

		Employee e1 = new Employee(1, "aaa", 100000);
		System.out.println("e1.id:"+e1.id);
		System.out.println("e1.name:"+e1.name);
		System.out.println("e1.salary:"+e1.salary);

		Employee e2 = new Employee(2, "bbb", 200000);
		System.out.println("e2.id:"+e2.id);
		System.out.println("e2.name:"+e2.name);
		System.out.println("e2.salary:"+e2.salary);

	}
}