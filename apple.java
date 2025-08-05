public class apple {
    int a,b;
    void set(int a, int b)

    {
        this.a=a;
        this.b=b;

    }
    void get(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        apple a1= new apple();

        a1.set(10, 20);
        a1.get();
    }
}
