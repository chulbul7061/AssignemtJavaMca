import java.util.Scanner;

import your_net_salary.about_NPS;

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
   //@Override
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

 //  @Override

    double deduction,NPS,professional_tax=200,Medical=500;
    public void Net_salary_Fun()
    {
         
        NPS=((basic+DA)*10)/100;

        deduction=Gross_salary-(NPS+professional_tax+Medical);

        System.out.println("=================================================================================================================");
        System.out.println("=================================================================================================================");

        System.out.println("NET_salary : "+deduction+" INR");
    
    

       
   }
  
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   class about_NPS
   
   {
      public void inner_class_fun()
      {
        double employee_share=((basic+DA)*10)/100;
        double government_share =((basic+DA)*14)/100;
        double PRAN_account=employee_share+government_share;

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(" About NPS amount : "+PRAN_account);
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");


      }
    }
    
}


public class salary {

     public static void main(String[] args)
      {
        your_net_salary mainobj=new your_net_salary();

        mainobj.gross_salary_Fun();
        mainobj.Net_salary_Fun();

        ///////////////////////////////

    your_net_salary.about_NPS inner_obj=mainobj.new about_NPS();

    inner_obj.inner_class_fun();

       

        
    }
    
}
