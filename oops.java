class Human{
private String name;
private int age;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

}



public class oops {
    public static void main(String[] args) {
        Human obj= new Human();
        obj.setAge(20);
        obj.setName("swikriti");
        System.out.println(obj.getAge()+":"+obj.getName());

    }
}
