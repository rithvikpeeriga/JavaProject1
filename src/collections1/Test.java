package collections1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


  /**   Employees s1 = new Employees(11);
        s1.setFirstNamea("Rithvik");
        s1.setJobDescription("TechLead "); **/

        AccountType s1 =new AccountType("Employee",89);
        s1.setLastNamea("Peeriga");
        s1.setFirstNamea("Rithvik");
        s1.setJobDescription("Managers Technology of the company");
        s1.setEmployeeID(9);
        s1.setAccountType("Manager");
        s1.checkUser(s1);

        AccountType s2 = new AccountType("Employee",12);
        s2.setLastNamea("Rosen");
        s2.setFirstNamea("Heidi");
        s2.setJobDescription("Employee in Human resources");
        s1.setAccountType("Employee");
        s1.checkUser(s1);

        List<Employees> accountList = new ArrayList<Employees>();
        accountList.add(s1);
        accountList.add(s2);





          System.out.println(accountList);
      System.out.println(s1.getSalary());
          System.out.println(s2.getSalary());
    //     System.out.println(s1.getEmployeeID());





    }




}
