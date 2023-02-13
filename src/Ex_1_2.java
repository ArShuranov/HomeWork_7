public class Ex_1_2 {
    public static void main(String[] args) {
        int[] arrayOfHoleNumbers = new int[]{1, 2, 3};
        double[] arrayOfFractionalNumbers = new double[]{1.57, 7.654, 9.986};
        String[] arbitraryArray = {"first", "second", "third" };

        for (int i = 0; i < arrayOfHoleNumbers.length; i++) {
            System.out.print(arrayOfHoleNumbers[i]);
            if (i < arrayOfHoleNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayOfFractionalNumbers.length; i++) {
            System.out.print(arrayOfFractionalNumbers[i]);
            if (i < arrayOfFractionalNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arbitraryArray.length; i++) {
            System.out.print(arbitraryArray[i]);
            if (i < arbitraryArray.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
