class  Human {
    String name;
    int age;
   
    public Human( String name,int age){
    this.name=name;
    this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class constructorExample {
    public static void main(String[] args) {
        Human obj= new Human("swikriti",20);
    System.out.println(obj.getName()+ obj.getAge());
    
    }
}
