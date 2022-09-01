public class FizzBuzzArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (arr[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (arr[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
