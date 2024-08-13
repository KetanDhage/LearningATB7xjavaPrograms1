package ex_1407024;

public class lab045 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11


            int a1 = 10;
            System.out.println(a1++ + ++a1);
            System.out.println(a1);
            // A - a1++  -> Exp = 10 | a1 = 11
            // + - operator
            // B- a1++  -> Exp = 12 | a1 = 12

    }
}
