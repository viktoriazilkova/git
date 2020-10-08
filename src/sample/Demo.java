package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("otazky");

            int znak = reader.read();

            while (znak != -1) {
                System.out.println((char) znak);
                znak = reader.read();
            }
            reader = new FileReader("otazky");
            BufferedReader reader1 = new BufferedReader(reader);
            System.out.println(reader1.readLine());
        }
        catch(FileNotFoundException e){
                System.out.println("subor nenajdeny");
            }
        catch(IOException e){
                e.printStackTrace();
            }
        }
    }

