package academic;

/**
 * Created by huan on 2018/01/13.
 */
public class Other {

    public static void main(String[] args) {
        double pa = 0.8;
        double pb = 0.2;
        double q1 = 0.5;
        double q2 = 0.3;

        System.out.println(method(pa, pb, q1, q2));
    }

    private static double method(double pa, double pb, double q1, double q2) {
        double first = (pa * q1 * q2) / (pa * q1 * q2 + pb * (1 - q1) * (1 - q2));  //两个工人都选A时,答案A的准确性
        double second = (pa * (1 - q1) * q2) / (pa * (1 - q1) * q2 + pb * q1 * (1 - q2));  //两个工人分别选B,A时,答案A的准确性
        double third = (pa * q1 * (1 - q2)) / (pa * q1 * (1 - q2) + pb * (1 - q1) * q2);  //两个工人分别选A,B时,答案A的准确性
        double fourth = (pa * (1 - q1) * (1 - q2)) / (pa * (1 - q1) * (1 - q2) + pb * q1 * q2);  //两个工人都选B时,答案A的准确性
        System.out.println("first:"+first+",second:"+second+",third:"+third+",fourth"+fourth);
        return (first + second + third + fourth)/4.0;
    }
}