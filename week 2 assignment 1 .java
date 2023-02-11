import java.util.Scanner;

//import your_net_salary.about_NPS;

interface gross_salary
{
  public void gross_salary_Fun();

}

interface Net_salary
{
  public void Net_salary_Fun();
}

class your_net_salary implements gross_salary,Net_salary
{
 

    double basic,DA,HRA,TA=3600 ,TA_on_DA;

    double DA_cal,HRA_cal;

    double Gross_salary;
    Scanner obj=new Scanner(System.in);
  
    public void gross_salary_Fun()
    {
   

    

    System.out.println("enter your Basic Salary");
    basic=obj.nextDouble();
    
    System.out.println("enter your HRA Percantage 24 or 16 or 8 ");
    
    HRA=obj.nextDouble();


        DA=(basic*17)/100;

        HRA_cal=(basic*HRA)/100;
        
        TA_on_DA=(TA*17)/100;

        Gross_salary=basic+DA+HRA_cal+TA+TA_on_DA;

        System.out.println("=================================================================================================================");

        System.out.println("Your Gross Salary : "+Gross_salary+" INR");

        System.out.println("=================================================================================================================");
    }
    
   ///////////////////////////////////////////NET_SALARY_/////////////////////////////////////////////////////////

 

    double deduction,NPS,professional_tax=200,Medical=500;
    public void Net_salary_Fun()
    {
         
        NPS=((basic+DA)*10)/100;

        deduction=Gross_salary-(NPS+professional_tax+Medical);

        System.out.println("=================================================================================================================");

        System.out.println("NET_salary : "+deduction+" INR");
    
    

       
   }
  
   double PRAN_account;
   /////////////////////////////////////////INNER  CLASS////////////////////////////////////////////////////////
   class about_NPS
   
   {
      public void inner_class_fun()
      {
        double employee_share=((basic+DA)*10)/100;
        double government_share =((basic+DA)*14)/100;
        PRAN_account=employee_share+government_share;

        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println(" About NPS amount : "+PRAN_account);
        System.out.println("--------------------------------------------------------------------------------------------------------");


      }
    }

    double CTC;
    void detailed_veiw()
    {
        System.out.println("Basic Salary= "+basic+" INR");
        System.out.println("Dearness Allowance(DA)= "+DA+" INR");
        System.out.println("House Rent Allowance(HRA)= "+HRA_cal+" INR");
        System.out.println("Transport Allowance(TA)= "+TA+" INR");
        System.out.println("DA_on_TA= "+TA_on_DA+" INR");
        System.out.println("=================================================================================================================");
        System.out.println("Gross_Salary= "+Gross_salary+" INR");
        System.out.println("=================================================================================================================");
        System.out.println("=================================================================================================================");

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("=========================Deduction In your salary=====================");
        System.out.println("Nation Pension System(NPS)= "+NPS+" INR");
        System.out.println("Professional= "+professional_tax+" INR");
        System.out.println("Medical "+Medical+" INR");
        System.out.println("Total Deduction= "+(NPS+professional_tax+Medical)+" INR");

        System.out.println("=================================================================================================================");
        System.out.println("Net Salary/ In Hand = "+deduction);
        

        CTC = Gross_salary+PRAN_account;
        System.out.println("Your CTC = "+CTC*12 +" INR " +" Per annum");
        
    }
    
}




public class salary {

     public static void main(String[] args)
      {
        double salary_slip;
        your_net_salary mainobj=new your_net_salary();

        mainobj.gross_salary_Fun();
        mainobj.Net_salary_Fun();

        

    your_net_salary.about_NPS inner_obj=mainobj.new about_NPS();

    Scanner salary_slip_obj= new Scanner(System.in);
    
    
    inner_obj.inner_class_fun();

    System.out.println("Press 1 to see salary slip ");
    salary_slip=salary_slip_obj.nextDouble();
    
        if(salary_slip==1)
        {
        mainobj.detailed_veiw();
        }
        else 
        {
            System.out.println("Invalid input ");
        }



       

        
    }
    
}
