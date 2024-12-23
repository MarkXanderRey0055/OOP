public class Main
{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1234);
        student1.setName("Student_1");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getName());

        Book book1 = new Book();
        book1.setBookNumber(1);
        book1.setTitle("Holy Bible");
        book1.setPrice(500.00f);

        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Price: " + book1.getPrice());

        Book book2 = new Book();
        book2.setBookNumber(2);
        book2.setTitle("To Kill a Mockingbird");
        book2.setAuthor("Harper Lee");
        book2.setPrice(700.00f);

        System.out.println("Book Number: " + book2.getBookNumber());
        System.out.println("Book Title: " + book2.getTitle());
        System.out.println("Book Author: " + book2.getAuthor());
        System.out.println("Book Price: " + book2.getPrice());
    }
}
