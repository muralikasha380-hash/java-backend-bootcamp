package Day43;

public class Employee {

   private int empId;
   private String empName;
   private String department;
   private int attendanceDays;

   public Employee(int empId,String empName,String department,int attendanceDays) {
	   this.empId = empId;
	   this.empName = empName;
	   this.department = department;
	   this.attendanceDays = attendanceDays;
    }
    public int getEmpId() {
    	return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public String getDepartment() {
        return department;
    }
    public int getAttendanceDays() {
        return attendanceDays;
    }
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Department: " + department + ", Attendance Days: " + attendanceDays;
    }
}