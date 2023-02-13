import java.util.Arrays;

public class Ex_4 {
    public static void main(String[] args) {
        int[] arrayOfHoleNumbers = new int[]{1, 2, 3};

        for (int i = 0; i < arrayOfHoleNumbers.length; i++) {
            if (arrayOfHoleNumbers[i] % 2 != 0) {
                arrayOfHoleNumbers[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayOfHoleNumbers));
    }
}
