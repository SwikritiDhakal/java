class Calculator {

    public int getAdd(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int getAdd(int n1, int n2){
        return n1+n2;
    }

}

public class methodsExample {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.getAdd(5, 10, 15);
        int result1= calc.getAdd(5, 10);
        System.out.println(result);
        System.out.println(result1);

    }
}
