public class  removeconsecutivechar{
  public static String removeConsecutive(String s) {
      if (s.isEmpty()) return ""; // Edge case: Empty string
      
      StringBuilder result = new StringBuilder();
      result.append(s.charAt(0)); // Add first character

      for (int i = 1; i < s.length(); i++) {
          if (s.charAt(i) != s.charAt(i - 1)) {
              result.append(s.charAt(i)); // Only add if different from previous
          }
      }
      return result.toString();
  }

  public static void main(String[] args) {
      System.out.println(removeConsecutive("aaabbcddd"));  // ✅ "abc"
      System.out.println(removeConsecutive("aabbcc"));     // ✅ "abc"
      System.out.println(removeConsecutive("aaaa"));       // ✅ "a"
      System.out.println(removeConsecutive("abc"));        // ✅ "abc"
  }
}
