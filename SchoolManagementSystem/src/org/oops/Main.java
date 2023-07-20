package org.oops;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
	 public static void main(String[] args) {
	        Teacher sathish = new Teacher(1,"sathish",15000);
	        Teacher raghu = new Teacher(2,"raghu",20000);
	        Teacher sisira = new Teacher(3,"sisira",25000);

	        List<Teacher> teacherList = new ArrayList<>();
	        teacherList.add(sathish);
	        teacherList.add(raghu);
	        teacherList.add(sisira);


	        Student pradeep = new Student(1,"pradeep",4);
	        Student mahesh = new Student(2,"mahesh",12);
	        Student ashok = new Student(3,"ashok",5);
	        List<Student> studentList = new ArrayList<>();

	        studentList.add(pradeep);
	        studentList.add(ashok);
	        studentList.add(mahesh);




	        School jspiders = new School(teacherList,studentList);


	        pradeep.payFees(35000);
	        mahesh.payFees(40000);
	        System.out.println("jspiders has earned $"+ jspiders.getTotalMoneyEarned());

	        System.out.println("------Making SCHOOL PAY SALARY----");
	        sathish.receiveSalary(sathish.getSalary());
	        System.out.println("jspiders has spent for salary to " + sathish.getName()
	        +" and now jspiders has $" + jspiders.getTotalMoneyEarned());

	        sisira.receiveSalary(sisira.getSalary());
	        System.out.println("jspiders has spent for salary to " + sisira.getName()
	                +" and now jspiders has $" + jspiders.getTotalMoneyEarned());


	        raghu.receiveSalary(raghu.getSalary());

	        System.out.println(raghu);
	        //getting student details
	        System.out.println(mahesh);



	    }

}
