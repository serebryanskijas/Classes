public class Permutation {
    static String str = "123";
    static int count = str.length();
    static StringBuilder s = new StringBuilder(str);


    public static void main(String[] args) {
        permute(0);
    }

    public static void swap(int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    public static void permute(int i) {
        if (i == count - 1) System.out.println(s.toString());
        else for (int j = i; j < count; j++) {
            swap(i, j);
            permute(i + 1);
            swap(i, j);
        }
    }
}
