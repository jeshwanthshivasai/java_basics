public class Conditional_Statements {
    public static void main(String[] args) {
        int age = 51;
        //poragallu only
        if (age<10) {
            System.out.println("You're still a Kid fool!");
        }
        else if (age>=15 && age<=20) {
            System.out.println("Ah teenage! have some adrenaline rush brother");
        }
        else if (age<50 && age>25) {
            System.out.println("ah! here comes a loser!");
        }
        else {
            System.out.println("musali na kodaka");
        }
    }
}


import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("miru pannu chellichakkarledu");
        } else if (income <= 1000000 && income >= 500000) {
            tax = (int) (income * 0.2);
            System.out.println(tax +"Rs"+ " pannu chellinchu ra kuyya");
        }
        else {
            tax = (int) (income * 0.3);
        System.out.println(tax +"Rs"+ " pannu chellinchu ra kuyya");
        }
    }
}


import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks = sc.nextInt();
        String result = marks >=33 ? "pass":"fail";
        System.out.println(result);
    }
}

---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------

/*Write a Java program to get a number from the user 
and print whether it is positive or negative.*/

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("number is greater than zero");
        } else {
            System.out.println("number is less than or equal to zero");

        }
    }
}


/*Finish the following code so that it prints You have a fever if your temperature is above 100 and 
otherwise prints You don't have a fever.*/

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature>100) {
            System.out.println("jaram ochindi gammunundu bey");
        } else {
            System.out.println("pannav endi bey baitki nadu");

        }
    }
}


/*Write a Java program to input week number(1-7)
and print day of week name using switch case.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ey vaaram kavalno ah number kotti chaavu");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("somavaram");
                break;
            case 2:
                System.out.println("mangalavaram");
                break;
            case 3:
                System.out.println("budhavaram");
                break;
            case 4:
                System.out.println("guruvaram");
                break;
            case 5:
                System.out.println("shukravaram");
                break;
            case 6:
                System.out.println("sanivaram");
                break;
            case 7:
                System.out.println("aadivaram");
                break;
            default:
                System.out.println("em number bey vaaram la enni rojulu untayo kuda telvada thu ni abba");
        }
    }
}


//What will be the value of x & y in the following program: X = False; Y = 63
public class Main {
    public static void main(String[] args) {
    int a = 63, b = 36;
    boolean x = (a<b) ? true : false;
    int y = (a>b) ? a : b;
    }
}


/*Write a Java program that takes a year from the user
and print whether that year is a leap year or not.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pelli cheskunte chesko gaani leap year oo kaado check cheddam");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println("kallu muskoni pelli chesko");
        } else {
            System.out.println("inko four years aagu apudu cheskochu le");
        }
    }
} 