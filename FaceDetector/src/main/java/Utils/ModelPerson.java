
package Utils;

public class ModelPerson {
    private int id;
    private String fname;
    private String lname;
    private String dob;
    private String office;

    public ModelPerson(int id, String fname, String lname, String dob, String office) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.office = office;
    }

    public ModelPerson() {
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDob() {
        return dob;
    }

    public String getOffice() {
        return office;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    
    
    
    
}
