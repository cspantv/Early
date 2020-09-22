public class FindPair {


    public static void main(String[] args) {

        int[] arrayA = { 2,4 ,5, 8, 10, 19};
        int x = 15;

        findPair2(arrayA, x);

        x = 16;
        findPair2(arrayA, x);

        x = 25;
        findPair2(arrayA, x);


    }

    public static boolean findPair1(int[]array, int x){

        for (int first = 0; first < array.length; first++){
            for (int second = first; second < array.length; second++){
                if (array[first] + array[second] == x){
                    System.out.printf("Found: %d + %d = %d. \n", array[first], array[second], x);
                    return true;
                }
            }
        }

        System.out.printf("Not Found: Sum to %d.", x);
        return false;
    }

    public static boolean findPair2(int[]array, int x){

        for (int first : array){
            for (int second : array){
                if (first + second == x){
                    System.out.printf("Found: %d + %d = %d. \n", first, second, x);
                    return true;
                }
            }
        }

        System.out.printf("Not Found: Sum to %d.", x);
        return false;
    }


}
