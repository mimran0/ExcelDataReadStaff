package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
      EmployeeInfo obj=new EmployeeInfo("md imran",106);
      obj.assignDepartment("Information Technology");
      System.out.println("Employee name is "+obj.employeeName());
      System.out.println("Employee id is "+obj.employeeId());
      System.out.println("Total salary with employee bonos is "+EmployeeInfo.calculateEmployeeBonus(100000,"Best"));
      System.out.println("Potentila pension info "+EmployeeInfo.calculateEmployeePension() );

	}

}
