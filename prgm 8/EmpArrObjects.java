import java.util.Scanner;

class Employee{
	int eno;
	String ename;
	double esal;

	public Employee(){}

	Employee(int eno,String ename,double esal){
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}

	public void showdata(){
		System.out.println("Empid:"+eno+" Name: "+ename+" Salary: "+esal);	
		System.out.println();
	}
}

public class EmpArrObjects{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        System.out.print("Enter employees details one by one.. ");
        Employee[] emp = new Employee[n];
        Scanner scemp = new Scanner(System.in);
        
        int eid;
        String ename;
        double esal;
        
        for (int i=0;i<n;i++) {
          System.out.println("Enter employee details....");

          System.out.print("Enter Employee ID: ");
          eid = sc.nextInt();

          System.out.print("Enter Name: ");
          String nam = scemp.next();
          ename = new String(nam);
          
          System.out.print("Enter Salary: ");
          esal = sc.nextDouble();

          Employee e = new Employee(eid, ename, esal);
          emp[i] = e;
        }

        System.out.println("Employee Details:");
        for(Employee y : emp){
           y.showdata();
        }
    }
}
