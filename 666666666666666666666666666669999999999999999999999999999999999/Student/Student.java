package Student;

public class Student {
    private String name;
    private String email;
    private String id;
    
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
        id = "Unassigned";
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getid() {
        return id;
    }

    public void setEmail(String address) {
        email = address;
    }

    public void setName(String studentName) {
        name = studentName;
    }

    public void setid(String studentid) {
        id = studentid;
    }
}
