/*abstract
1.its an incomplete class
why so:
we cant create object
we need another class to extend and implement the abstract methods not nessarilly it must have a abstract method
but ia a class has an


*/

abstract class Abc{

	void add (int a){
		a++;
		System.out.println(a);

		}
		abstract void add1(int a, int b);
     	   }

	class Abstest extends Abc{
		public void add1(int a, int b){
		System.out.println(a+b);

	  }
	

	public static void main(String[] args){

		Abc a=new Abstest();
		a.add(1);
		a.add1(12,23);
	}
}

/*/ a is athin clinet: it can access the methods in
// Abc and the same methods only in the extended class Testabs
*/	
