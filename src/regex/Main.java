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

//    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//        if (this == object){
//            return true;
//        }
//        if (object instanceof String){
//            String str = (String)object;
//            if (this.length() != str.length()) {
//                return false;
//            }
//            for (int i = 0; i < str.length(); i++) {
//                if (this.charAt(i) != str.charAt(i)){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

}
