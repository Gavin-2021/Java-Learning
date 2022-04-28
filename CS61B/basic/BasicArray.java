public class BasicArray {
    public static void main(String[] args){
        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 7;
        numbers[2] = 10;

        System.out.println(numbers[1]);
        int i = 0;
        int sum = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i += 1;
        }

        System.out.println(sum);

    }
    
}
