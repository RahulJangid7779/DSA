public class stringcompression {
  public static String compressString(String str) {
      if (str == null || str.isEmpty()) return str; // Edge case

      StringBuilder newString = new StringBuilder();
      int i = 0, n = str.length();

      while (i < n) {
          char currentChar = str.charAt(i);
          int count = 1;

          // Count consecutive characters
          while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
              count++;
              i++;
          }

          // Append character and count (only if > 1)
          newString.append(currentChar);
          if (count > 1) {
              newString.append(count);
          }

          i++; // Move to next character
      }
      return newString.toString();
  }

  public static void main(String[] args) {
      String str = "aaaabbbcccccccccccccccccccc";
      System.out.println(compressString(str)); // ✅ Expected Output: "a4b3c20"
  }
}
