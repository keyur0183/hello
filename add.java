public class add{
    void hello(int a, int b)
    {
        int c=a+b;
        System.out.println("add is"+c);
    }
    public static void main(String[] args) {
        add v1 = new add();
        v1.hello(5,2);

    }
}