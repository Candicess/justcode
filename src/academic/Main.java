package academic;

/**
 * Created by huan on 2017/11/21.
 */
public class Main {

    public static void main(String[] args) {
        int n = 5;

        double data[] = new double[]{1.0, 0.6, 0.7, 0.7, 0.8, 0.8};

        double test[][] = new double[(n + 1) / 2][n];

        for (int i = 0; i <= (n + 1) / 2; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 ||j == 0) {
                    test[i][j] = 1;
                } else if (i > j){
                    test[i][j] = 0;
                }else {
                    test[i][j] = test[i - 1][j - 1] * data[j] + test[i][j - 1] * (1 - data[j]);
                    System.out.println(test[i][j] + " " + i + " " + j);
                    System.out.println();
                }

            }

        }





    }

}
