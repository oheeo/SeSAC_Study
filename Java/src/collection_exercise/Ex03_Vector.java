package collection_exercise;

import java.util.List;
import java.util.Vector;
import java.util.Arrays;

public class Ex03_Vector {

    public static void main(String[] args) {
        List<Boolean> list = new Vector<>();
        list.add(true);
        list.add(false);
        list.add(true);
        Boolean[] bArray = list.toArray(new Boolean[5]);
        System.out.println(Arrays.toString(bArray));  // [true, false, true, null, null]
    }
}
