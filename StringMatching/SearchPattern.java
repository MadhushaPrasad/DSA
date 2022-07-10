package StringMatching;

public class SearchPattern {
    //search for a pattern in a string
    public void search(String[] text, String[] pattern) {
        int m = pattern.length;
        int n = text.length;
        int i = 0;
        int j = 0;
        while (i < n - m + 1) {
            while (j < m && text[i + j].equals(pattern[j])) {
                j++;
            }
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
            i++;
            j = 0;
        }
    }
}
