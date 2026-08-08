package Day08;

class Student {
	
		private int sno;
		private String sname;

		void setSno(int sno){
			this.sno = sno;
		}

		int getSno(){
			return sno;
		}

		void setSname(String sname){
	         this.sname = sname;
		}

		String getSname(){
			return sname;
		}

		public void display(){
			System.out.println(sno + "  " + sname);
			
		}
		
}
