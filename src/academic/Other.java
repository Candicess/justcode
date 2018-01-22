package academic;

import java.util.ArrayList;

/**
 * Created by huan on 2018/01/13.
 */
public class Other {

    public static void main(String[] args) {
        double pa = 0.34;
        double pb = 0.33;
        double pc = 0.33;
        double q1 = 0.6;
        double q2 = 0.7;


        bayesDeduction(pa, pb, pc, q1, q2);
    }

    private static void method2Answer2Worker(double pa, double pb, double q1, double q2) {
        double first = (pa * q1 * q2) / (pa * q1 * q2 + pb * (1 - q1) * (1 - q2));  //两个工人都选A时,答案A的准确性
        double second = (pa * q1 * (1 - q2)) / (pa * q1 * (1 - q2) + pb * (1 - q1) * q2);  //两个工人分别选A,B时,答案A的准确性
        double third = (pa * (1 - q1) * q2 ) / (pa * (1 - q1) * q2 + pb * q1 * (1 - q2));  //两个工人分别选B,A时,答案A的准确性
        double fourth = (pa * (1 - q1) * (1 - q2)) / (pa * (1 - q1) * (1 - q2) + pb * q1 * q2);  //两个工人都选B时,答案A的准确性
        System.out.println("两个答案时：AA:"+first+",AB:"+second+",BA:"+third+",BB"+fourth);
    }


    //求解3个答案选项在2个工人中可能的答案情况


    private static void  bayesDeduction(double pa, double pb, double pc, double q1, double q2){
        double unq1 = (1 - q1) / 2;
        double unq2 = (1 - q2) / 2;
        double aa = (pa * q1 * q2) / (pa * q1 * q2 + pb * unq1  * unq2 + pc * unq1 * unq2);
        double ab = (pa * q1 * unq2) / (pa * q1 * q2 + pb * unq1 * unq2 + pc * unq1 * unq2);
        double ac = (pa * q1 * unq2) / (pa * q1 * unq2 + pb * unq1 * unq2 + pc * unq1 * q2);
        double ba = (pa * unq1 * q2) / (pa * unq1 * q2 + pa * q1 * unq2 + pc * unq1 * unq2);
        double bb = (pa *unq1 * unq2) / (pa *unq1 * unq2 + pb * q1 * q2 + pc * unq1 * unq2);
        double bc = (pa *unq1 * unq2) / (pa *unq1 * unq2 + pb * q1 * unq2 + pc * unq1 * q2);
        double ca = (pa * unq1 * q2) / (pa * unq1 * q2 + pb * unq1 * unq2 + pc * q1 * unq2);
        double cb = (pa * unq1 * unq2) / (pa * unq1 * unq2 + pb * unq1 * q2 + pc * q1 * unq2);
        double cc = (pa * unq1 * unq2) / (pa * unq1 * unq2 + pb * unq1 * unq2 + pc * q1 * q2);
        System.out.println("三个答案时：AA "+aa+",AB "+ab+",AC "+ac+",BA "+ba+",BB "+bb+",BC "+bc+",CA "+ca+",CB "+cb+",CC "+cc);
    }
}
