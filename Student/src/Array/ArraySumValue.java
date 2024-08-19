package Array;
public class ArraySumValue {
    public static void main(String[] args) {
        int [] nums = new int[6];
        int value =100;
        for(int i=0;i<5;i++){
            nums[i] = value;
            value += 100;
        }
        int sum =0;
        for(int i=0;i<5;i++){
            sum = sum + nums[i];
        }
        for(int i=0;i<5;i++)
            System.out.print(nums[i]+"+");
            System.out.println("\b="+sum);
        
//        for(int i=0;i<5;i++){
//            System.out.print(nums[i]+"+");
//            System.out.println("\b="+sum);
//        }
//        System.out.println("\b="+sum);
    }
}
