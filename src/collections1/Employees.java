package collections1;

public class Employees {


    String firstNamea;
    String lastNamea;
    int employeeID;
    String jobDescription;


    public Employees(int employeeID) {

    }

    public String getLastNamea() {
        return this.lastNamea;
    }

    public void setLastNamea(String lastNamea) {
        this.lastNamea = lastNamea;
    }

    public String getFirstNamea() {
        return this.firstNamea;
    }

    public void setFirstNamea(String firstNamea) {
        this.firstNamea = firstNamea;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(int employeeIDa) {
        this.employeeID = employeeIDa;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstNamea='" +this. firstNamea + '\'' +
                ", lastNamea='" + this.lastNamea + '\'' +
                ", employeeIDa=" + this.employeeID +
                ", jobDescription='" + this.jobDescription + '\'' +
                '}';
    }
}


