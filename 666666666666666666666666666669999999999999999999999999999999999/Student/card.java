package Student;

public class card {
    
    private Student owner;

    private int borrowCnt;

    public card() {
        owner = null;
        borrowCnt = 0;
    }

    public void out(int numofBooks) {
        borrowCnt = borrowCnt + numofBooks;
    }
    public void in(int numofBooks) {
        borrowCnt = borrowCnt - numofBooks;
    }

    public int getNumofBooks() {
        return borrowCnt;
    }

    public String getownername() {
        return owner.getName();
    }

    public void setOwner(Student student) {
        owner = student;
    }

    public String toString() {
        return "    Owner name:    " + owner.getName() + "\n" + "         Email:    "+ owner.getEmail() + "\n" + "    Student ID:    "+ owner.getid() + "\n"+"Books borrowed:    " + borrowCnt ;
    }
}
