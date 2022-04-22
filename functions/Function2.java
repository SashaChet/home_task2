package functions;

public class Function2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{-5, -6, -7};
        // test 1
        System.out.printf("Test 1 %s.\n", ClassForTest.compareResults(merge(a, b), new int[]{-7, -6, -5, 1, 2, 3, 4, 5}) ? "passed" : "failed");

        //test 2
        System.out.printf("Test 2 %s.\n", ClassForTest.compareResults(merge(new int[0], new int[0]), new int[]{}) ? "passed" : "failed");

        //test 3
        System.out.printf("Test 3 %s.\n", ClassForTest.compareResults(merge(b, a), new int[]{5, 4, 3, 2, 1, -5, -6, -7}) ? "passed" : "failed");

    }

    /*
    методу передаются два упорядоченных массива(могут быть упорядочены по-разному), реализуйте функцию,
    которая объединит их и вернет упорядоченный массив с порядком таким же как и a
     */
    private static int[] merge(int[] a, int[] b) {
        int len_a = a.length;
        int len_b = b.length;
        if(len_a == 0 & len_b == 0){
            int[] common = new int[]{};
            return common;
        }
        if(len_a != 0 & len_b == 0){ return a;}
        if(len_a == 0 & len_b != 0){ return b;}
        if(len_a != 0 & len_b != 0){
            int[] common = new int[len_a + len_b];
            int len_common = common.length;
            int counter = 0;
            int exchange_;
            for (int i = 0; i < len_a; i++){
                common[i] = a[i];
                counter++;
            }
            for(int j = 0; j < len_b; j++){
                common[counter] = b[j];
                counter++;
            }
            if (a[len_a-1] >= a[0]){
                for (int i = 0; i < len_common; i++){
                    for(int j = 0; j < len_common - i; j++){
                        if(common[j] > common[j+1]){
                            exchange_ = common[j];
                            common[j] = common[j+1];
                            common[j+1] = exchange_;
                        }
                    }
                }
            } else {
                for (int i = 0; i < len_common; i++){
                    for(int j = 0; j < len_common - i; j++){
                        if(common[j] < common[j+1]){
                            exchange_ = common[j];
                            common[j] = common[j+1];
                            common[j+1] = exchange_;
                        }
                    }
                }
            }
            return common;
        }
        return new int[]{1};
    }
}
