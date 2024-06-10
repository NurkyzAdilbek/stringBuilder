import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//636283

        FileWriter fileWriter=new FileWriter("java14.txt");
        try(fileWriter){//fileWriter.close();


        fileWriter.write("" +
                "-----Products------\n" +
                "--Category--\n" +
                "-ELECRTONICS \n" +
                "-ACSESSORIES \n" +
                "-FOOD_PRODUCTS");
            fileWriter.close();
            }

        FileReader fileReader=new FileReader("java14.txt");
        Scanner scanner=new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        Song song=new Song("Imagine\n","John Lennon\n","Imagine there's no heaven\n" +
                "It's easy if you try\n" +
                "No hell below us\n" +
                "Above us, only sky\n" +
                "Imagine all the people\n" +
                "Living for today");
        FileWriter fileWriter1=new FileWriter("song.txt");
        try(fileWriter1) {fileWriter1.write(song.toString());
fileWriter1.close();
        }

        FileReader fileReader1=new FileReader("song.txt");
        Scanner scanner1=new Scanner(fileReader1);
        while (scanner1.hasNextLine()){
            System.out.println(scanner1.nextLine());
        }




        StringBuilder stringBuilder=new StringBuilder(" Kyrgyzstan" );
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(1));   // K
        stringBuilder.setCharAt(2,'i');
        System.out.println(stringBuilder);// Kirgyzstan
        System.out.println(stringBuilder.append(" Bishkek")); //ein wort hizufugen
     //   System.out.println(stringBuilder.reverse());// wird von hinter gelesen kekhsiB
       // System.out.println(stringBuilder.delete(1, 5)); //wird 1. und 5.Buchsteben gelosht
     //   System.out.println(stringBuilder.deleteCharAt(10));
        System.out.println(stringBuilder.replace(2, 7, "azak"));


    }
}