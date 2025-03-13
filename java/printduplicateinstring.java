public class printduplicateinstring {
  public static void main(String[] args) {
      String str = "ramram";
      int[] count = new int[256]; // Array to store character frequencies (ASCII)

      // Count occurrences of each character
      for (int i = 0; i < str.length(); i++) {
          count[str.charAt(i)]++;
      }

      // Print duplicates
      System.out.print("Duplicate characters: ");
      boolean found = false;
      for (int i = 0; i < 256; i++) {
          if (count[i] > 1) {
              System.out.print((char)i + " ");
              found = true;
          }
      }

      if (!found) {
          System.out.println("No duplicate characters found.");
      }
  }
}
