

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    table(scanner);
    }

    public static String request(Scanner scanner){
        System.out.print("Type the author's name: ");
        String request;
        request = scanner.nextLine();
        return request;
    }

    public static void table(Scanner scanner){
        String request = request(scanner);
        File fileReference = new File ("spravka.txt");
        {
            try {
                FileReader fileReader = new FileReader(fileReference);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String lineReference;
                String type;
                String autor;
                String title;
                String year;
                String ISBN;
                String pages;
                String cover;
                String duration;
                String format;
                int numberOfBooks = 0;
                int numberOfEbooks = 0;
                int numberOfClassics = 0;
                int numberOfAudioBooks = 0;
                System.out.println("Type      " + "    Author      " + "       Title          " + "               " +
                                   "              Year" +
                                   "     ISBN      " + "         Page " + "    Cover  " + "   Time" + "   Format");
                while ((lineReference = bufferedReader.readLine()) != null) {

                    String[] storeData = lineReference.split("@");
                    for(int i = 0; i < storeData.length; i++) {
                        String[] bookData = storeData[i].split(";");
                        autor = bookData[1];
                        if (autor.equals(request)) {
                            type = bookData[0];
                            title = bookData[2];
                            year = bookData[3];
                            ISBN = bookData[4];
                            pages = bookData[5];
                            cover = bookData[6];
                            duration = bookData[7];
                            format = bookData[8];
                            if(type.equals("classic")) {
                                numberOfClassics++;
                                numberOfBooks++;
                                System.out.println(type + "      " + autor + "      " + title + "       " + year +
                                        "       " + ISBN + "      " + pages + "      " + cover + "            " + duration +
                                        "       " + format);
                            }
                            if(type.equals("audiobook")) {
                                numberOfAudioBooks++;
                                numberOfBooks++;
                                System.out.println(type + "    " + autor + "      " + title + "       " + year +
                                        "       " + ISBN + "      " + pages + "      " + cover + "            " + duration +
                                        "    " + format);
                            }
                            if(type.equals("ebook")) {
                                numberOfBooks++;
                                numberOfEbooks++;
                                System.out.println(type + "        " + autor + "      " + title + "       " + year +
                                        "       " + ISBN + "      " + pages + "      " + cover + "            " + duration +
                                        "     " + format);
                            }
                        }
                    }
                }
                System.out.println("Total: " + numberOfBooks + " books " + "(classic: " + numberOfClassics + ", audiobook: " +
                        numberOfAudioBooks +", ebook: " + numberOfEbooks + ")" );

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}