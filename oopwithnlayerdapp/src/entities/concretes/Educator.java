package entities.concretes;

public class Educator {
    
    private int id;
    private String educatorName;
    private String educatorLastName;
    private String email;

    
    public Educator() {
    }

    
    public Educator(int id, String educatorName, String educatorLastName, String email) {
        this.id = id;
        this.educatorName = educatorName;
        this.educatorLastName = educatorLastName;
        this.email = email;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEducatorName() {
        return educatorName;
    }
    public void setEducatorName(String educatorName) {
        this.educatorName = educatorName;
    }
    public String getEducatorLastName() {
        return educatorLastName;
    }
    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

}
