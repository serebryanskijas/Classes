import java.util.Arrays;

public class TreeTraversal {
    public static void main(String[] args) {
        Tree1 tree = new Tree1();
        tree.addRoot('0');
        tree.addLeft('1', 0);
        tree.addRight('2', 0);
        tree.addLeft('3', 1);
        tree.addRight('4', 1);
        tree.addLeft('5', 3);
        tree.addRight('6', 3);
        tree.print();
        tree.preOrder('0');
    }
}

class Tree1 {
    int root = 0;
    char[] arr = new char[100];

    public void addRoot(char key) {
        arr[0] = key;
    }

    public void addLeft(char key, int root) {
        int left = root * 2 + 1;
        arr[left] = key;
    }

    public void addRight(char key, int root) {
        int right = root * 2 + 2;
        arr[right] = key;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int findNode(char key) {
        if (key == 0) return -1;
        return Arrays.binarySearch(arr, key);
    }

    public char getLeft(char key) {
        int node = findNode(key);
        if (key == -1) return 0;
        if (node * 2 + 1 < arr.length)
            return arr[node * 2 + 1];
        else return 0;
    }

    public char getRight(char key) {
        int node = findNode(key);
        if (key == -1) return 0;
        if (node * 2 + 2 < arr.length)
            return arr[node * 2 + 2];
        else return 0;
    }

    public void preOrder(char key) {
        if (key == 0) return;
        System.out.print(key+" ");
    preOrder(getLeft(key));
    preOrder(getRight(key));
    }

}