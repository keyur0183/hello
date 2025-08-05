public class swapping{
    public static void main(String[] args) {
        int a=10,b=20,temp;
        System.out.println("before swapping");
        System.out.println("value of a"+a);
        System.out.println("value of b" +b);

        temp = a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("value of a"+a);
        System.out.println("valu of b"+b);
    }
}