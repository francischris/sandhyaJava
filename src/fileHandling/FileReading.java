package fileHandling;

import java.io.*;

public class FileReading {


    public static void main(String[] args) throws Exception{

        read("C:\\Users\\caroline\\Desktop\\Sandhya\\code\\src\\fileHandling\\sandhya.txt");
        write("C:\\Users\\caroline\\Desktop\\Sandhya\\code\\src\\fileHandling\\sandhya.txt");
        read("C:\\Users\\caroline\\Desktop\\Sandhya\\code\\src\\fileHandling\\sandhya.txt");

    }



    private void BufferedReader() throws Exception{
        File file = new File("C:\\Users\\caroline\\Desktop\\Sandhya\\code\\src\\fileHandling\\sandhya.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String str;
        while ((str = reader.readLine()) != null){

            System.out.println(str);
        }
    }

    public static void write(String fileName){
        File file = new File(fileName);
        System.out.println(file.exists());
        String message = " \n I have been added in tot he file";
        FileWriter writer;
        try {
            writer = new FileWriter(fileName,true);
            writer.write(message);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void read(String fileName){

        FileReader reader;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new FileReader(fileName);
            int eof = 0;
            while ((eof = reader.read())!=-1){
                sb = sb.append((char)eof);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}
