package io;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOExample {
    public static void main(String[] msg){
        write();
        read();
        readNetwork();
    }

    public static void readNetwork(){
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL("http://zhouwut.cn");
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder builder = new StringBuilder();
            String line = "";
            while ( (line = bufferedReader.readLine()) != null) {
                builder.append(line).append(System.lineSeparator());
            }
            System.out.println(builder);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void read() {
        File file = new File("src/io/readme.txt");
        System.out.println(file.exists());
        FileInputStream fis = null;
        BufferedReader bufferedReader = null;
        try {
            fis = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(fis));
            StringBuilder builder = new StringBuilder();

            String line = "";
            while ( (line = bufferedReader.readLine()) != null) {
                builder.append(line).append(System.lineSeparator());
            }
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void write(){
        File file = new File("src/io/readme.txt");
        FileOutputStream fos = null;
        BufferedWriter bufferedWriter = null;
        try {
            fos = new FileOutputStream(file);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos));
            bufferedWriter.write("Hello Bunny Drop",4,5);
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
