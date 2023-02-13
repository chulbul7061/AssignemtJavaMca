import java.util.Scanner;
class tax

{
    double CTC2=0;

    Scanner input=new Scanner(System.in);
    void taxable()
    {

        System.out.println("enter your annual income ");

        CTC2=input.nextDouble();


        if (CTC2 <= 300000)
        {
            System.out.println("Your tax is Nill");



        } else if (CTC2 >= 300001 && CTC2 <= 600000) {
            System.out.println("Your tax amount is 5% " + ((CTC2 * 5) / 100)+" INR");

        } else if (CTC2 >= 600001 && CTC2 <= 900000) {
            System.out.println("Your tax amount is 10% " + ((CTC2 * 10) / 100)+" INR");

        } else if (CTC2 >= 900001 && CTC2 <= 1200000) {
            System.out.println("Your tax amount is 15% " + ((CTC2 * 15) / 100)+" INR");

        } else if (CTC2 >= 1300001 && CTC2 <= 1500000) {
            System.out.println("Your tax amount is 20% " + ((CTC2 * 20) / 100)+" INR");

        } else if (CTC2 >= 1500001) {
            System.out.println("Your tax amount is 30% " + ((CTC2 * 30) / 100)+" INR");

        }


    }

    double result=0;




    void taxsavingScheam()
    {
        System.out.println("Enter your choice for saving taxs ");
        int ch=input.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Term Life Insurance premium");
                result +=15000;
                System.out.println("Term Life Insurance premium " + result+" INR");
                break;

            case 2:
                System.out.println("PPF (Public Provident Fund)");
                result += 50000;
                System.out.println("(Public Provident Fund)" + result+" INR");
                break;

            case 3:
                System.out.println("National Savings Certificates");
                result += 40000;
                System.out.println("National Savings Certificates " + result+" INR");
                break;

            case 4:
                System.out.println("Tuition fees:");
                result += 96000;
                System.out.println("Tuition fees:" + result+" INR");
                break;

            case 5:
                System.out.println("Sukanya Samriddhi Yojana (SSY):");
                result += 50000;
                System.out.println("Sukanya Samriddhi Yojana (SSY):" + result+" INR");
                break;

            case 6:
                System.out.println("Senior Citizen Saving Scheme (SCSS):");
                result += 500000 ;
                System.out.println("Senior Citizen Saving Scheme (SCSS):" + result+" INR");
                break;

            case 7:
                System.out.println("Home Loan:");
                result += 60000;
                System.out.println("Home Loan:" + result+" INR");
                break;

            default:System.out.println("Invalid choice.....");
        }
    }

    void showscheme()
    {
        System.out.println(" press 1 Term Life Insurance premium");
        System.out.println(" press 2 PPF (Public Provident Fund)");
        System.out.println(" press 3 National Savings Certificates");
        System.out.println(" press 4 Tuition fees:");
        System.out.println(" press 5 Sukanya Samriddhi Yojana (SSY):");
        System.out.println(" press 6 Senior Citizen Saving Scheme (SCSS):");
        System.out.println(" press 7 Home Loan:");
    }



}




public class taxsaving{

    public static void main(String[] args)
    {

        tax obj1=new tax();
        obj1.taxable();
        obj1.showscheme();
        obj1.taxsavingScheam();

    }

}
