//12:04am - 07/01/2024
//print star pattern

public class Patterns {
    public static void main(String[] args) {
    public static void main(String[] args) {
        for(int line = 1; line <=10; line++) {
            //one line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println(*);
        }
    }
}



//03:48pm - 07/01/2024
//print inverted star pattern

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i<=n; i++) {
            for (int star = 1; star <= n- i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//04:51pm - 07/01/2024
//half pyramid pattern

public class Patterns {
    public static void main(String[] args) {
        int n = 10;
        for (int line = 1; line <=n; line++) {
            //print numbers
            for (int number = 1; number <=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}



//09:37am - 08/01/2024
//character pattern

public class Patterns {
    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';

        //outer loop
        for (int line = 1; line <= n; line++) {

            //inner loop
            for (int alphabet = 1; alphabet <= line; alphabet++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}