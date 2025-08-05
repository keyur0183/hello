class inheritance{
    void parents(){
        System.out.println("hello");
    }
}

class AK extends inheritance{
    void child(){
        System.out.println("world");
    }
}

public class printt{
public static void main(String[] args){
AK a1 = new AK();

a1.parents();
a1.child();
}
}