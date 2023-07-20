package org.oops;

/**
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     *  id id for the teacher.
     *  name name of the teacher.
     *  salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     *  the id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     *  name of the teacher.
     */
    public String getName(){
        return name;
    }


    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){
        return  salary;
    }

    /**
     * set the salary.
     *  salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     *  salary
     */
    public void receiveSalary(int salary){
        salaryEarned=salaryEarned+salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}