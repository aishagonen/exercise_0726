package oo;

public class O142TestAvail {

	public static void main(String[] args) {
		
		O142TestAvail ts = new O142TestAvail();
		
		System.out.print(isAvailable + " ");
		
		isAvailable = ts.doStuff();
		
		System.out.println(isAvailable);

	}
	
	public static boolean doStuff() {
		return !isAvailable;
	}
	
	static boolean isAvailable = false;

}


/*




	Answ: false true


*/