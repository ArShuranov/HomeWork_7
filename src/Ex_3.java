public class Ex_3 {
    public static void main(String[] args) {
        int[] arrayOfHoleNumbers = new int[]{1, 2, 3};
        double[] arrayOfFractionalNumbers = new double[]{1.57, 7.654, 9.986};
        String[] arbitraryArray = {"first", "second", "third" };

        for (int i = arrayOfHoleNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfHoleNumbers[i]);
            if (i !=  0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrayOfFractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfFractionalNumbers[i]);
            if (i !=  0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arbitraryArray.length - 1; i >= 0; i--) {
            System.out.print(arbitraryArray[i]);
            if (i !=  0) {
                System.out.print(", ");
            }
        }



    }
}
