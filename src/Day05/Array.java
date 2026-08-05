package Day05;

public class Array {
	public static void main(String[] args){
	//1. working with array with PDT - int
			int[] ia = new int[5];
			
			System.out.println(ia); //ia.toString() -> [I@1dbd16a6
			
			System.out.println(ia[0]); //0
			System.out.println(ia[1]); //0
			System.out.println(ia[2]); //0
			System.out.println(ia[3]); //0
			System.out.println(ia[4]); //0
			System.out.println();
			
			ia[0] = 3; 
			ia[1] = 4; 
			ia[2] = 5; 
			ia[3] = 6; 
			ia[4] = 7;
			
			System.out.println(ia[0]); //3
			System.out.println(ia[1]); //4
			System.out.println(ia[2]); //5
			System.out.println(ia[3]); //6
			System.out.println(ia[4]); //7
			System.out.println();
			
		//2. Working with array with String type
					
			String[] sa = new String[5];
			
			System.out.println(sa); //sa.toString() -> [Ljava.lang.String;@7ad041f3
			System.out.println(sa[0]); //null
			System.out.println(sa[1]); //null
			System.out.println(sa[2]); //null
			System.out.println(sa[3]); //null
			System.out.println(sa[4]); //null
			System.out.println();
			
			sa[0] = "a";
			sa[1] = "b";
			sa[2] = "c";
			sa[3] = "d";
			sa[4] = "e";

			System.out.println(sa[0]); //sa[0].toString() -> a
			System.out.println(sa[1]); //sa[1].toString() -> b
			System.out.println(sa[2]); //sa[2].toString() -> c
			System.out.println(sa[3]); //sa[3].toString() -> d
			System.out.println(sa[4]); //sa[4].toString() -> e
			System.out.println();
			
		//3. Working with array with our own user defined class Example
			
			Example[] ea = new Example[5];
			
			System.out.println(ea); 	//[Lcom.nit.hk.arrays.Example;@251a69d7
			
			System.out.println(ea[0]); 	//null
			System.out.println(ea[1]);	//null
			System.out.println(ea[2]);	//null
			System.out.println(ea[3]);	//null
			System.out.println(ea[4]);	//null
			System.out.println();
			
			ea[0] = new Example();
			ea[1] = new Example(30, 40);
			ea[2] = new Example();
			ea[3] = new Example(70, 80);
			
			System.out.println(ea);  	//[Lcom.nit.hk.arrays.Example;@251a69d7
			
			System.out.println(ea[0]);	
			System.out.println(ea[1]);
			System.out.println(ea[2]);
			System.out.println(ea[3]);
			
			
		}
	}

