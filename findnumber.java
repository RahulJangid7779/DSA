import java.util.ArrayList;

public class FindNumber {

    // ✅ Method returns ArrayList, not boolean
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 12};
        int target = 4;

        // ✅ Use the correct method name
        ArrayList<Integer> ans = findAllIndex(arr, target, 0, new ArrayList<>());
        System.out.print(ans);  // Output: [2, 3]
    }
}
