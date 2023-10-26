import java.util.*;
class employee
{
    private String employeid;
    private String empname;
    private int basicsalary,HRA,TA,MA,PF,GS,incometax,netsalary;
    public static void main(String args[])
    {
        employee employeobj=new employee();
        employeobj.read(); 
        employeobj.display(); 
    }
    public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee id");
        employeid=scan.next();
        System.out.println("Enter the employee name");
        empname=scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
        calculate();
     }
     public void calculate()  
     {
        HRA=(50/100)*basicsalary;
        TA=(30/100)*basicsalary;
        MA=(25/100)*basicsalary;
        PF=(10/100)*basicsalary;
        GS=basicsalary+HRA+TA+MA;
        incometax=(10/100)*GS;
        netsalary=GS-incometax-PF;
     }
     public void display()  
     {
        System.out.println("Employeeid  :  "+employeid+"n"+"Employename  :  "+empname+"n"+"Employee basic salary :  "+basicsalary+"n"+"HRA  :  "+HRA+"n"+"TA  :  "+TA+"n"+"MA  :  "+MA+"n"+"PF  :  "+PF+"n"+"GS  :  "+GS+"n"+"Incometax  :  "+incometax+"n"+"netsalary  :  "+netsalary);
     }
}