public class operator {

    public static void main(String[] args) {
        int a = 10, b = 20;
        // assignment operator is run
        System.out.println(a+=2);
        System.out.println(a-=2);
        System.out.println(a*=2);
        System.out.println(a/=2);

        // conditional and tarnary operator
        System.out.println(a >= 2 ? a : b);

        // logical operator
        System.out.println(a >= 10 && a >= 10);
        System.out.println(a >= 10 || a >= 10);
        System.out.println(!(a >= 5));

        // arithmatic operation
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
// incremint dicrement operator
System.out.println(a++);
System.out.println(b--);
System.out.println(++a);
System.out.println(--b);


    }
}