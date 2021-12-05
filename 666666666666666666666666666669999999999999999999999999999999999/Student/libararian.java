package Student;

public class libararian {
    
    public static void main(String[] args) {
        Student student;
        Student student2;
        card card;
        card card2;

        student = new Student();
        student.setName("John Conner");
        student.setEmail("john.c@cmu.ac.th");
        student.setid("63598");

        card = new card();
        card.setOwner(student);
        card.out(3);
        card.in(2);

        student2 = new Student();
        student2.setName("party");
        student2.setEmail("party.c@cmu.ac.th");
        student2.setid("35029");

        card2 = new card();
        card2.setOwner(student2);
        card2.out(6);
        card2.in(2);

        System.out.println("Card1 info:");
        System.out.println(card.toString() + "\n");
        System.out.println("Card2 info:");
        System.out.println(card2.toString() + "\n");
    }
}
