
import java.util.*;
import java.util.Scanner;


interface tollPlaza
{
    void Userinput();
}

class main_inheritance implements tollPlaza
{

    int vechileNum,wheels;


    public String cato="pass";
    public  String catog;



    float km;

    public void Userinput()
    {
        Scanner mm=new Scanner(System.in);


        System.out.println("enter your vechile Number : ");
        vechileNum=mm.nextInt();

        System.out.println("enter your vechile wheels like 2 3 4 8:");
        wheels=mm.nextInt();

        System.out.println("enter km :");
        km=mm.nextInt();

        mm.nextLine();
        System.out.println("enter your categories vip or gereral or pass :");
        catog=mm.nextLine();








    }


}

class calculation_inheritance2 extends main_inheritance
{
    void calulation()
    {
        if (vechileNum==1111 && wheels==4 )
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("welcome to national highway road of india");
            System.out.println("Your categories is VIP so");
            System.out.println("your toll tax is  "+(km*5)+(" ")+("INR"));
        }

        else if (vechileNum==2222 && wheels==4 )
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to National highway road of India");
            System.out.println("Your categories is VIP so");
            System.out.println("your toll tax is  "+(km*5)+(" ")+("INR"));
        }

        else if (vechileNum==2222 && wheels==4 )
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");

            System.out.println("Welcome to National highway road of India");
            System.out.println("Your categories is VIP so");
            System.out.println("your toll tax is  "+(km*5)+(" ")+("INR"));
        }

        else if (vechileNum==0001 && wheels==4 )
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to National highway road of India");
            System.out.println("Your categories is VIP so");
            System.out.println("your toll tax is  "+(km*5)+(" ")+("INR"));
        }
        else if (vechileNum==101 && wheels==4 )
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to National highway road of India");
            System.out.println("Your categories is Ambulance so");
            System.out.println("your toll tax is Free ");
        }

        else if (catog==cato)
        {
            if(km<=60)
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println("Welcome to National highway road of India");
                System.out.println("Your categories is Monthly pass so");
                System.out.println("your toll tax is  "+(km*8)+(" ")+("INR"));
            }

            else
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println("Welcome to National highway road of India");
                System.out.println("Your categories is Monthly pass so");
                System.out.println("your toll tax is  "+(km*10)+(" ")+("INR"));
            }
        }

        else

        {
            if(km<=50)
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println("Welcome to National highway road of India");
                System.out.println("Your categories is General  so");
                System.out.println("your toll tax is  "+(km*8)+(" ")+("INR"));
            }

            else
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println("Welcome to National highway road of India");
                System.out.println("Your categories is General  so");
                System.out.println("your toll tax is  "+(km*9)+(" ")+("INR"));

            }




        }
    }
}



public class Tolltax{

    public static void main(String args[])
    {

        System.out.println("------------------------WELCOME-----------------------------------");
        calculation_inheritance2 obj2=new calculation_inheritance2();
        obj2.Userinput();
        obj2.calulation();


        System.out.println("------------------------------------------------------------------");

        System.out.println("one more toll calcualte press 1 or 0 (exit)");

        int ch;
        Scanner objj=new Scanner(System.in);
        ch=objj.nextInt();
        switch(ch)
        {
            case 1:
                obj2.Userinput();
                obj2.calulation();

            case 0:
                System.exit(0);

            default:
                System.out.println("invalid  Entry");

        }


    }
}
