package ex_1407024;

public class lab047
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13

            int a1 = 20;
            long b1 = 22;
            String s1 = "KK";
            String s2 = "VV";
            //System.out.println(s1+s2+a+b);
            System.out.println(s1+s2+(a1+b1));
            //System.out.println(KK+vv+87+91);

    }
}
