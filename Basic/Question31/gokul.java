package JavaScript.Question31;

public class gokul {
    public static void main(String[] args) {
        char mat[][] = {
                { 'b', 'c', 'x', 'y', 'z', 's' },
                { 'x', 'y', 'z', 'h', 't', 'y', 'i', 's' },
                { 'p', 't', 'e', 'x', 'e', 'u', 'i', 'u' }
        };
        int x = 0, y = 0, z = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 'x') {
                    System.out.println(mat[i][j] + " position of occurrence: " + i + " " + j);
                    x++;
                } else if (mat[i][j] == 'y') {
                    System.out.println(mat[i][j] + " position of occurrence: " + i + " " + j);
                    y++;
                } else if (mat[i][j] == 'z') {
                    System.out.println(mat[i][j] + " position of occurrence: " + i + " " + j);
                    z++;
                }
            }
        }

        System.out.println("X =" + x + "\n" + "Y =" + y + "\n" + "Z =" + z);
    }
}