 // method overriding
 class demo1 {
    void animal(){
        System.out.println("bhaw bhaw");
    }
    
}
 class demo extends demo1 {
    void animal(String type){
        System.out.println(type);


    }
 }
 public class voice1{
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.animal();
        demo d2 = new demo();
        d2.animal("meow meow");

    }
 }
