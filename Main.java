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


// import java.lang.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
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
//         int x = 0;
//         int y = 0;
//         while (x < 5) {
//             x = x + 1;
//             y = y + x;
//             System.out.println(x + "" + y + " ");
//             x = x + 1;
//         } 
//     }
// }



// public class GuessGame {
//     Player p1;
//     Player p2;
//     Player p3;
//     public void startGame() {
//     p1 = new Player();
//     p2 = new Player();
//     p3 = new Player();
//     int guessp1 = 0;
//     int guessp2 = 0;
//     int guessp3 = 0;
//     boolean p1isRight = false;
//     boolean p2isRight = false;
//     boolean p3isRight = false;
//     int targetNumber = (int) (Math.random() * 10);
//     System.out.println("I'm thinking of a number between 0 and 9...");
//     while (true) {
//     System.out.println("Number to guess is " + targetNumber);
//     p1.guess();
//     p2.guess();
//     p3.guess();
//     guessp1 = p1.number;
//     System.out.println("Player one guessed " + guessp1);
//     guessp2 = p2.number;
//     System.out.println("Player two guessed " + guessp2);
//     guessp3 = p3.number;
//     System.out.println("Player three guessed " + guessp3);
//     if (guessp1 == targetNumber) {
//     p1isRight = true;
//     }
//     if (guessp2 == targetNumber) {
//     p2isRight = true;
//     }
//     if (guessp3 == targetNumber) {
//     p3isRight = true;
//     }
//     if (p1isRight || p2isRight || p3isRight) {
//     System.out.println("We have a winner!");
//     System.out.println("Player one got it right? " + p1isRight);
//     System.out.println("Player two got it right? " + p2isRight);
//     System.out.println("Player three got it right? " + p3isRight);
//     System.out.println("Game is over.");
//     break; // game over, so break out of the loop
//     } else {
//     // we must keep going because nobody got it right!
//     System.out.println("Players will have to try again.");
//     } // end if/else
//     } // end loop
//     } // end method
//     } // end class

// public class Main {
//         public static void main(String[] args) {
                
//         }
// }