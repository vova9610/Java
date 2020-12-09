import java.util.Arrays;

public class Homework2 {
    public static void main (String[] args) {

//        Work1
        {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] == 1) ? 0 : 1;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


//        Work2
        {
            int[] brr = new int[8];
            for (int j = 0; j < brr.length; j++) {
                brr[j] = j * 3 + 1;
                System.out.println(j + " = " + brr[j]);
            }
            System.out.println();
        }

//        Work3
        {
            int[] crr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int r = 0; r < crr.length; r++)
                if (crr[r] < 6) crr[r] *= 2;
            System.out.print(Arrays.toString(crr));

        }

//        Work4
        {
            int[] drr = {1, 3, 5, 6, 12, 34, 323, 2};
            int min = drr[0], max = drr[0], indMax = 0, indMin = 0;
            for (int i = 0; i < drr.length; i++) {
                if (drr[i] > max) {
                    max = drr[i];
                    indMax = i;
                }
                if (drr[i] < min) {
                    min = drr[i];
                    indMin = i;
                }
            }
            System.out.println("Максимальный элемент находится в массиве " + max);
            System.out.println("Минимальный элемент находится в массиве  " + min);
        }
    }

}
