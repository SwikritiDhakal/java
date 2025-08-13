 class A{
    public A(){
    System.out.println("I'm in A");
    }
    public A(int n){
        System.out.println("parameterized A cons");
    }
}

class B extends A{
    public B(int n){
        super();
        System.out.println("im in class b");
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        B obj= new B(2);

    }

}
