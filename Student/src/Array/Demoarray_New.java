package Array;

public class Demoarray_New {

    public static void main(String[] args) {
        int[] nums = new int[10];

        int value = 10;
        for (int i = 0; i < 10; i++) {
            nums[i] = value;
            value += 100;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("nums[" + i + "]:" + nums[i]);
        }
    }
}
