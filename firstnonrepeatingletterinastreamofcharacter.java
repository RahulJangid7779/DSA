public class firstnonrepeatingletterinastreamofcharacter {

    public static void main(String[] args) {
        String stream = "aabc";
        int freq[] = new int[26];  // For 'a' to 'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            // Remove all repeating characters from the front
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}


