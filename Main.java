public class Main {
    public static void main(String[] args) {

        Student student1 = new Student ("Kai Sotto", "Manila", "BSIT", 2);
        System.out.println("Student Name   : " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year   : " + student1.getYear());

        Staff staff1 = new Staff ("LeBron Jaime", "Cebu", "BSU ", 1700.00);
        System.out.println("Staff Name   : " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School : " + staff1.getSchool());
        System.out.println("Staff Salary : " + staff1.getSalary());

    }
}   