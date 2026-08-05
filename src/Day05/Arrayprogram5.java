package Day05;

public class Arrayprogram5 {
public static void main(String[] args) {
		
		int[] res = addSub(10, 20);
		System.out.println("addition of 10 and 20 is " + res[0]);
		System.out.println("subtraction of 10 and 20 is " + res[1]);
		
	}
	
	static int[] addSub(int a, int b) {
		
//		int add = a + b;
//		int sub = a - b;
		
//		int[] ia = new int[2];		//length code
//		ia[0] = add;				//array object creation, initialization in diff lines
//		ia[1] = sub;
//		return ia;

//		int[] ia = {add, sub};		//less code, array obj creation, initailizatin in one line
//		return ia;				
		
//		return {add, sub}; //compiler does not know the type
							//so it throws CE: illegal start of expression
		
//		return new int[] {add, sub}; //more less code -> aoc, init, and returning in one line
									//now there is no error, array type is specified
									//this array creation is called anonymous array
									//array object creation without
		
		return new int[] {a+b, a-b}; //further more less code 
									//-> aoc, cal, init, and returning in one line
									//no extra variables, so less memory is consumed 
									//and we will get fast execution
	}
}
