public class longestcommonprefix {
    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) return ""; // Edge case

        String prefix = arr[0]; // Start with first word

        for (String word : arr) {
            while (!word.startsWith(prefix)) { // Trim prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return ""; // No common prefix
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = {"flow", "flying", "flo"};
        System.out.println(longestCommonPrefix(arr)); // ✅ Output: "flo"
    }
}
