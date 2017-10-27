package regex;

import java.util.regex.Pattern;

/**
 * Created by huan on 2017/10/27.
 */
public class Main {

    public static void main(String[] args) {
        String ip = "172.20.201.233";

        String regex = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";

        Pattern pattern = Pattern.compile(regex);

        System.out.println(pattern.matcher(ip).matches());
    }

}
