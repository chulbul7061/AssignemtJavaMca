Interface Employee
{
  void input_user();
}

class employeeInherit
{
  pubic input_user()
  {
    double bs,da,hra,ca,ea,mi,it,pf;
    double gs,ns;

    Scanner obj=new Scanner(System.in);

    System.out.println("Enter Your Basic Salary");
    System.out.println("Enter Your Dearness Allowance");
    System.out.println("Enter Your House Rent Allowance");
    System.out.println("Enter Your Conveyeance Allowance");
    System.out.println("Enter Your Entertainment Allowance");
    System.out.println("Enter Your Medical Insurance");
    System.out.println("Enter Your Income Tax");
    System.out.println("Enter Your Provident Fund");
    System.out.println("Enter Your Gross Salary");
    System.out.println("Your Net Salary");
    

  }
}
