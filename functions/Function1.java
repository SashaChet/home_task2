package functions;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest
                .compareResults(findMax(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

        try {
            findMax(new int[0]);
            System.out.println("Test 2: failed.");
        } catch (RuntimeException e) {
            System.out.println("Test 2: passed.");
        }
    }

    // реализовать функцию, которая будет находить максимум в массиве
    // обработать случай, когда длина массива равна нулю
    // в этом случае выбрасывать исключение
    private static int findMax(int[] arr) {
        int max_ = -10_000;
        int len = arr.length;
        if (len != 0){
            for (int i = 0; i < len; i++){
                if(arr[i] > max_){
                    max_ = arr[i];
                }
            }
        } else {
            throw new RuntimeException("Длина массива равна 0");
        }
        return max_;
    }
}