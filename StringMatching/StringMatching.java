package StringMatching;

public class StringMatching {
    public static void main(String[] args) {
        SearchPattern sp = new SearchPattern();
        sp.search(new String[]{"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"}, new String[]{"abc", "def", "ghi"});
    }
}
