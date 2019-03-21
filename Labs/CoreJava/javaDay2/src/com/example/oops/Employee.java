package com.example.oops;
//interface=implement   & inheritance = extends
//1)toString ==>covert obj into string format
//2)
//conversion of primitive datatype(stored in stack) to object==>boxing and vice versa==>non-boxing
public class Employee<T extends Number> extends Person implements Apprasiable{
	//???????????????/call by value and address  Static(based on parameters/over-loading/same method in same class) Dynamic(over-riding/same method in different class i.e parent and child class) compile runtime polymorphism?????????????????????????
//primitive variable ::stores actual value  eg. int a=10;
//reference variable ::reference to primitive var eg. int b = a;
	//local var =stored in stack
	//interface -includes abstract methods(includes essentials details exposed to outside[abstract and interface])
	
	//objects are stored in heap memory depending upon instances and value passed to that instance
	//eg. String maker="Epson" ::String -2 bytes each and 2*5=10 bytes	
	/*private static int id;
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

	private int Age;
	private String dept;
	private double salary;
	
	
	public Employee() 
	{
		System.out.println("default constructor");
	};
	public void UpdateEmployee() {
		//this.id = 2;
		this.Age = 20;
		this.dept= "IT";
		this.salary = 40000;
		id++;
		System.out.println("Updated id of the Employe is::"+id);
		System.out.println("Updated Age of the Employe is::"+Age);
		System.out.println("Updated Dept of the Employe is::"+dept);
		System.out.println("Updated salary of the Employe is::"+salary);
	}
	public Employee(int Age,String dept,double salary)
	{

		this.Age = Age;
		this.dept = dept;
		this.salary = salary;
		id++;//whenever new obj is created from single class ,for every employee id is incremented automatically
		
		System.out.println(" id of the Employe is::"+id);
		System.out.println("Age of the Employe is::"+Age);
		System.out.println("Dept of the Employe is::"+dept);
		System.out.println("salary of the Employe is::"+salary);
	}
	//static function:://instance member(propety/method)//within static method we cannot create instance members

	public static void PrintEmp() {
	  
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
	
	Employee emp = new Employee();
	Employee emp2 = new Employee(23,"CS",20000);
	Employee.id = 10; //static member(property)
    emp2.UpdateEmployee();    
    Employee emp3  = new Employee();
    emp3.UpdateEmployee();
    Employee.PrintEmp();//static member(method)
		
	}*/
	// properties
		private int empId;
		private String designation;
		private String department;
		private T salary;
		
		// default constructor
		public Employee()
		{
			//this(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
			System.out.println("Employee class default constructor");
		}

		// overloaded custom constructor
		public Employee(int empId, String name, int age, String gender, String designation, String department, T salary) {
			super(name, age, gender);
			this.empId = empId;
			this.designation = designation;
			this.salary = salary;
		}
		
		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public T getSalary() {
			return salary;
		}

		public void setSalary(T salary) {
			this.salary = salary;
		}
		
		
		public void printDetails() {
			// print employee details
			System.out.println("EmpId: " + this.getEmpId());
			System.out.println("Name: " + this.getName()); //******
		    System.out.println("Age: " + this.getAge());
			System.out.println("Gender: " + this.getGender());
			System.out.println("Designation: " + this.getDesignation());
			System.out.println("Department: " + this.getDepartment());
			System.out.println("Salary: " + this.getSalary());
		}	
		@Override
		public void appraise() {
			System.out.println("appraise method");
		}
	}



