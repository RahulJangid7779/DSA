public class AnagramCheckOptimized {
  public static boolean isAnagram(String str1, String str2) {
      if (str1.length() != str2.length()) return false;

      int[] count = new int[26]; // For lowercase English letters

      for (int i = 0; i < str1.length(); i++) {
          count[str1.charAt(i) - 'a']++;  // Increase for str1
          count[str2.charAt(i) - 'a']--;  // Decrease for str2
      }

      for (int c : count) {
          if (c != 0) return false;
      }

      return true;
  }

  public static void main(String[] args) {
      System.out.println(isAnagram("rat", "tar"));  // true
      System.out.println(isAnagram("hello", "ollhe"));  // true
      System.out.println(isAnagram("java", "python")); // false
  }
}
