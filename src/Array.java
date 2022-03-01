import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        String [][] seatingchart = {{"Abby","Don","George","Kim"},
                                    {"Brian","Elenor","Harry","Lenny"},
                                    {"Cathy","Fred","Jill","Matt"}};

        seatingchart[1][2] = "Paul";

        String temp = seatingchart[0][0];
        seatingchart[0][0] = seatingchart[2][3];
        seatingchart[2][3] = temp;

        String[] tempArray = seatingchart[0];
        seatingchart[0] = seatingchart[1];
        seatingchart[1] = tempArray;

        System.out.println(seatingchart[0][2] + seatingchart[2][0]);

        for (String[] x : seatingchart)
        {
            System.out.println(Arrays.toString(x));
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] x : arr1)
        {
            System.out.println(Arrays.toString(x));
        }
        for (int[] x : arr2)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}
