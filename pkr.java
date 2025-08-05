public class pkr{
    void set(){
        int a=10;
        int b=20;
        get(10, 20);
    }
    void get(int a,int b){
System.out.println(a);
System.out.println(b);
    }
    public static void main(String[] args) {
        pkr p1=new pkr();
        p1.set();
    }
}

