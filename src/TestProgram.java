public class TestProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Maureen Sebastian");
        Student student2 = new Student("Juan Dela Cruz");

        Book book1 = new Book("Animatronics", "BK-1234");
        Book book2 = new Book("The Lord of the Rings Trilogy", "BK-LOTR");

        Journal journal1 = new Journal("One with Nature", "JR-5678");
        Journal journal2 = new Journal("Game Boy", "JR-8989");
        
        System.out.println("Student Name: " + student1.getName());
        student1.borrowResource(book1);
        student1.borrowResource(journal1);
        System.out.println();

        System.out.println("Student Name: " + student2.getName());
        student2.borrowResource(journal2);
        student2.borrowResource(book2);

    }
}