
class InheritanceDemoParent{

    public void show(){
        System.out.println("i am in parent");
    }

}

public class InheritanceDemo extends InheritanceDemoParent{
    
        public void show1(){
            System.out.println("im a child");
        }
        public void greet(){
            System.out.println("heyy");
        }
    public static void main(String[] args) {
        InheritanceDemo obj= new InheritanceDemo();
        obj.show();
        obj.show1();
        obj.greet();


    }

}
