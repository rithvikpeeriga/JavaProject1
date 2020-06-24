package collections1;

public class AccountType extends EmployeeAccount{

    String accountNotes;

    String Manager ="Manager";
    String Contracor="Contractor";
    String Employee="Employee";
    double baseSalary=500;

    public  AccountType(String accountType,int employeeID){
        super(employeeID,accountType);

    }


    public String getAccountNotes() {
        return accountNotes;
    }

    public void setAccountNotes(String accountNotes) {
        accountNotes = accountNotes;
    }


    public  void checkUser(AccountType a){

        if (Manager.equals(accountType)){

             salary=baseSalary*2;
             //return salary;


        }
        else if (Employee.equals(accountType)){

              salary=baseSalary*1;
              //return  salary;
        }else if (Contracor.equals(accountType)){

            salary=baseSalary*1.5;
            //return  salary;
        }

    }


}
