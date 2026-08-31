package Day31;

public class Employee {

	private String eid;
	private String efname;
	private String elname;
	private double esal;
	private String eaddress;
	
	public Employee(String eid, String efname,String elname, double esal,String eaddress) {
		
		this.eid = eid;
		this.efname = efname;
		this.elname = elname;
		this.esal = esal;
		this.eaddress = eaddress;
	}
	
	public String getEid() {
		return eid;
	}
	
	public String getEfname() {
		return efname;
	}
	
	public String getElname() {
		return elname;
	}
	
	public double getEsal() {
		return esal;
	}
	
	public String getEaddress() {
		return eaddress;
	}
}