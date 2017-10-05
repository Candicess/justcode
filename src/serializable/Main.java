package serializable;

import java.io.*;

public class Main {
    public static void main(String[] msg){
        Student s = new Student("wukong",25);
        File studentlist = new File("src/serializable/studentlist.txt");
        try {
            FileOutputStream fos = new FileOutputStream(studentlist);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(studentlist);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            System.out.println(object);
            System.out.println(s == object);
            System.out.println(s.equals(object));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
