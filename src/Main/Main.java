package Main;

public class Main {

    public static void main(String[] args){

        Person p1 = new Person("张三",22);
        Person p2 = new Person( "张三",22);

        System.out.println(p1+"\n"+p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println();

        String a  = "aa";
        String b = "aa";
        String s = new String("aa");

        System.out.println(a+"\n"+b+"\n"+s);

        System.out.println();

        System.out.println(a == b);
        System.out.println(a == s);
        System.out.println(a.equals(b));
        System.out.println(a.equals(s));

    }
}
