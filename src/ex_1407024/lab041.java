package ex_1407024;

public class lab041 {
    public static void main(String[] args)
    {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC -
    }
}
