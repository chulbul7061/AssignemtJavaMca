//
//import java.util.Scanner;

//class Grade {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] subjects = {"ENGLISH", "HINDI", "SANSKRIT", "SCIENCE", "GEOGRAPHY"};
//        int[] scores = new int[5];
//        char[] grades = new char[5];
//
//        // Take input of the score of the subjects
//        for (int i = 0; i < 5; i++) {
//            while (true) {
//                System.out.print("Enter MARK : " + subjects[i] + " MARK : ");
//                int score = sc.nextInt();
//                if (score >= 0 && score <= 100) {
//                    scores[i] = score;
//                    break;
//                } else {
//                    System.out.println("Please enter a score between 0 and 100 : ");
//                }
//            }
//
//            /////////////////////////// // grades is based on score////////////////////////////////////////////
//            if (scores[i] >= 80) {
//                grades[i] = 'A';
//            } else if (scores[i] >= 60) {
//                grades[i] = 'B';
//            } else if (scores[i] >= 40) {
//                grades[i] = 'C';
//            } else {
//                grades[i] = 'D';
//            }
//        }
//
//        //////////////////////////// Print the table///////////////////////////////////
//        System.out.println("+-----------+-------+--------+");
//        System.out.println("| Subject   | Score | Grade  |");
//        System.out.println("+-----------+-------+--------+");
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("| %-10s| %3d   | %s     |\n", subjects[i], scores[i], grades[i]);
//        }
//        System.out.println("+-----------+-------+--------+");
//
//        /////////////////////////////// Calculate grade :////////////////////////////////////////////////////
//        int totalScore = 0;
//        for (int score : scores) {
//            totalScore += score;
//        }
//        double averageScore = (double) totalScore / 5;
//        char overallGrade;
//        if (averageScore >= 80) {
//            overallGrade = 'A';
//        } else if (averageScore >= 60) {
//            overallGrade = 'B';
//        } else if (averageScore >= 40) {
//            overallGrade = 'C';
//        } else {
//            overallGrade = 'D';
//        }
//
//        System.out.printf("Overall grade: %c (average score: %.2f)\n", overallGrade, averageScore);
//    }
//}
/////////////////////////////////ALL CODE IS READY OF JAVA ASSIGNMENT 5////////////////////////////////////////
//
/////////// RAHUL NAYAK ///////////////
//
///////////END//////////////

import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Userinput{

    String subject[] = {"English", "Hindi", "Maths", "Science", "GK"};
    int marksStore[] = new int[5];
    double Totall_marks=0,weigthSubject,MTE;
    Scanner input = new Scanner(System.in);
    void enteringdata()
    {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks of " + subject[i]+"  ");
            marksStore[i] = input.nextInt();

        }
        System.out.print("enter the Marks of (out/50) MTE ");
        MTE=input.nextDouble();
    }
        void result_calculation()
        {
            for(int i=0;i<5;i++)

            {
                Totall_marks+=marksStore[i];
            }
             weigthSubject=((Totall_marks*100)/500)+((MTE*40)/100);
           // System.out.println(weigthSubject);


        }

        void resultConditions()
        {
           //this average marks of 5 subjects
           // System.out.println(String.format("%.3f", weigthSubject));


            if(weigthSubject>=80)
            {
                System.out.print("   A");
            }
           else if(weigthSubject>=60 && weigthSubject<=79)
            {
                System.out.print("   B");
            }
            else if(weigthSubject>=40 && weigthSubject<=59)
            {
                System.out.print("   C");
            }
            else if(weigthSubject>=39 && weigthSubject<=30)
            {
                System.out.print("   D");
            }
            else
            {
                System.out.print("   E");
            }

            System.out.println("\n");
        }

        void coloumsprinting()
        {
            for(int i=0;i<5;i++)
            {
                System.out.print("  "+subject[i]+"  ");
            }
            System.out.print(" "+"GRADE\n");
        }

        void tabularformate()
        {
            for(int i=0;i<5;i++)
            {
                System.out.print("      "+marksStore[i]+" ");

            }
        }
}

public class Grade{
    public static void main(String a[])
    {
       // int calfivetimes[] =new int[5];
        Userinput[] obj=new Userinput[5];
        for(int i=0;i<5;i++)
        {
            obj[i]=new Userinput();
        }
        for(int i=0;i<5;i++)
        {

            obj[i].enteringdata();

        }
        for(int i=0;i<1;i++)
        {
            obj[i].coloumsprinting();
        }

        for(int i=0;i<5;i++)
        {

            obj[i].result_calculation();
            obj[i].tabularformate();
            obj[i].resultConditions();
        }
    }
}
