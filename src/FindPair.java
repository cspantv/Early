public class FindPair {


    public static void main(String[] args) {

        int[] arrayA = { 2,4 ,5, 8, 10, 19};
        int x = 15;

        findPair(arrayA, x);

        x = 16;
        findPair(arrayA, x);

        x = 25;
        findPair(arrayA, x);


    }

    public static boolean findPair(int[]arrayA, int x){

        for (int first = 0; first < arrayA.length; first++){
            for (int second = first; second < arrayA.length; second++){
                if (arrayA[first] + arrayA[second] == x){
                    System.out.printf("Found: %d + %d = %d. \n", arrayA[first], arrayA[second], x);
                    return true;
                }
            }
        }

        System.out.printf("Not Found: Sum to %d.", x);
        return false;
    }

}
