package collections1;

public class EmployeeAccount extends Employees {

    int accountID;
    double salary;
    String accountType;

    public EmployeeAccount(int employeeID,String accountType) {
        super(employeeID);
    }

   // public EmployeeAccount(String accountType, int employeeID) {
     //   super();
    //}

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
