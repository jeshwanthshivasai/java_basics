// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String st = scanner.nextLine();
//         int num = scanner.nextInt();
//         System.out.print(st);
//         System.out.print(num);
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         int a, b, c, d;
//         a = b = c = d = 20;
//         a += b -= c *= d /= 20;
//         System.out.println("A = " + a + " B = " + b + " C = " + c + " D = " + d);
//     }
// }

// 30

// import java.lang.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // YOUR CODE GOES HERE
//         // Please take input and print output to standard input/output (stdin/stdout)
//         // DO NOT USE ARGUMENTS FOR INPUTS
//         // E.g. 'Scanner' for input & 'System.out' for output
//          Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int rahul1 = (N - 5);
//         int karan1 = (M + 5);
//         int rahul2 = (rahul1 * 2);
//         System.out.print(rahul2 + " " + karan1);
//     }
// }


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        // Scanner sc = new Scanner(System.in);
        // int C = sc.nextInt();
        // int S = sc.nextInt();
        // if (C <= S)
        // {
        //     System.out.println(1);
        //     System.out.println(S - C);
        // } 
        // else
        // {
        //     System.out.println(-1);
        //     System.out.println(C - S);
        // }
        // int a=5, b=6;
        // if(a++ == --b){
        //     System.out.println("5=5");
        // } else{
        //     System.out.println("NONE");
        // boolean x, y, z;
        // x = y = z = true;
        // if(!x || (!y && !z))
        // System.out.println("WHY");
        // else
        // System.out.println("WHAT");
        int x = 0;
        int y = 0;
        while (x < 5) {
            x = x + 1;
            y = y + x;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        } 
    }
}