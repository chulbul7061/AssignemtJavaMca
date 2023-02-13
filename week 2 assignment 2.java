import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


class taxsaving

{
    double CTC2=0;
    
    void taxable()
    {

        System.out.println("enter your annual income ");
        Scanner input=new Scanner(System.in);
        CTC2=input.nextDouble();


        if (CTC2 <= 300000)
        {
        System.out.println("Your tax is Nill");

        } else if (CTC2 >= 300001 && CTC2 <= 600000) {
        System.out.println("Your tax amount is 5% " + ((CTC2 * 5) / 100));
        } else if (CTC2 >= 600001 && CTC2 <= 900000) {
        System.out.println("Your tax amount is 10% " + ((CTC2 * 10) / 100));
        } else if (CTC2 >= 900001 && CTC2 <= 1200000) {
        System.out.println("Your tax amount is 15% " + ((CTC2 * 15) / 100));
        } else if (CTC2 >= 1300001 && CTC2 <= 1500000) {
        System.out.println("Your tax amount is 20% " + ((CTC2 * 20) / 100));
        } else if (CTC2 >= 1500001) {
        System.out.println("Your tax amount is 30% " + ((CTC2 * 30) / 100));
        }


    }

    double result=0;
    int ch;
    System.out.println("enter your annual income ");
    Scanner inputt=new Scanner(System.in);
    ch=inputt.nextInt();
    void taxsavingScheam()
    {
        switch (ch) 
        {
            case 1:
            System.out.println("Term Life Insurance premium");
            result = (CTC2 * 20) / 100;
            System.out.println("Term Life Insurance premium" + result);
            break;
            
            case 2:
            System.out.println("PPF (Public Provident Fund)");
            result = (CTC2 * 7.9) / 100;
            System.out.println("(Public Provident Fund)" + result);
            break;
            
            case 3:
            System.out.println("National Savings Certificates");
            result = (CTC2 * 7.9) / 100;
            System.out.println("National Savings Certificates" + result);
            break;
            
            case 4:
            System.out.println("Tuition fees:");
            result = (CTC2 * 15) / 100;
            System.out.println("Tuition fees:" + result);
            break;
            
            case 5:
            System.out.println("Sukanya Samriddhi Yojana (SSY):");
            result = (CTC2 * 7.60) / 100;
            System.out.println("Sukanya Samriddhi Yojana (SSY):" + result);
            break;
            
            case 6:
            System.out.println("Senior Citizen Saving Scheme (SCSS):");
            result = (CTC2 * 7.40) / 100;
            System.out.println("Senior Citizen Saving Scheme (SCSS):" + result);
            break;
            
            case 7:
            System.out.println("Home Loan:");
            result = (CTC2 * 10) / 100;
            System.out.println("Home Loan:" + result);
            break;
            
            default:System.out.println("Invalid choice.....");
        }
    }



}




public class taxsaving{

    public static void main(String[] args)
    {
        double salary_slip;


        Scanner salary_slip_obj= new Scanner(System.in);


        inner_obj.inner_class_fun();

        System.out.println("Press 1 to see salary slip or 2 press to see taxable amount : ");
        salary_slip=salary_slip_obj.nextDouble();

        if(salary_slip==1)
        {
            mainobj.detailed_veiw();

        }
        else if (salary_slip==2)
        {
            mainobj.taxable();


        } else
        {
            System.out.println("Invalid input ");
        }






    }

}
