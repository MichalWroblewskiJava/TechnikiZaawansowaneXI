package stream.task;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 2, 3, 5};
        System.out.println(findLastIndexInArrayOfSubArray(a, b));
    }

    public static int findLastIndexInArrayOfSubArray(int[] array, int[] subArray) {
        int indexOfArray = -1;
        try {
            if (array != null && subArray != null && array.length >= subArray.length && array.length > 0 && subArray.length > 0) {

                Integer[] subArrayBox = IntStream.of(subArray)
                        .boxed()
                        .toArray(Integer[]::new);

                for (int i = array.length - subArray.length; 0 <= i; i--) {

                    Integer[] tempArrays = IntStream.of(Arrays.copyOfRange(array, i, i + subArray.length))
                            .boxed()
                            .toArray(Integer[]::new);

                    if (Arrays.equals(subArrayBox, tempArrays)) {
                        indexOfArray = i;
                    } else {
                        throw new IndexOutOfBoundsException("SubArray couldn't be found  in Array");
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return indexOfArray;
    }
}
