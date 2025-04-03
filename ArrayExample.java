class Student {
    String name;
    int roll;
}

public class ArrayExample {
    public static void main(String[] args) {
        // int num[] = { 5, 6, 7, 8 };

        // num[1] = 10;

        // System.out.println(num[1]);
        // for (int i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }

        // ..........two dimensional array

        // int nums[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {

        // for (int j = 0; j < 4; j++) {
        // nums[i][j] = (int) (Math.random() * 10);
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();

        // }

        // jagged array

        // int nums[][] = new int[3][];
        // nums[0] = new int[2];
        // nums[1] = new int[3];
        // nums[2] = new int[4];
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // nums[i][j] = (int) (Math.random() * 10);
        // }
        // }

        // for (int n[] : nums) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // creating array using obj reference

        Student s1 = new Student();
        s1.name = "ram";
        s1.roll = 1;

        Student s2 = new Student();
        s2.name = "rita";
        s2.roll = 2;

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
        }

        int nums[] = new int[2];
        nums[0] = 4;
        nums[1] = 2;

        for (int n : nums) {
            System.out.println(n);

        }

    }
}
