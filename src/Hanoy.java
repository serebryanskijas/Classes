public class Hanoy {
    static int count = 5;
    static int[] counts = new int[3];
    static int[][] discs = new int[count][3];

    public static void main(String[] args) {
        init();
        //moveOne(0, 2);
        move(count,0,1,2);
        System.out.println(toStringAligned());
    }

    static void init() {
        for (int i = 0; i < count; i++)
            discs[i][0] = count - i;
        counts[0] = count;
    }

    static void moveOne(int from, int to) {
        if (counts[from] == 0) return;
        discs[counts[to]++][to] = discs[--counts[from]][from];
        discs[counts[from]][from] = 0;


        //System.out.println("From "+from+" to "+to);
    }

    static void move(int count, int from, int aux, int to) {
        if (count == 1) {
            moveOne(from, to);
            return;
        }
        else {
            move(count-1, from, to, aux);
            moveOne(from, to);
            move(count-1, aux, from, to);
        }
    }

    //Преобразовать в строку с выравниванием
    public static String toStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = count - 1; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                String sNumber = Integer.toString(discs[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        result.append("___________\n");
        return result.toString();
    }
}

