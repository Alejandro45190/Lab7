package com.mycompany.la7_2;

import edu.tarleton.caesarcipher.Caesar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decrypt {
    static void decrypt() {
        Caesar cipher = new Caesar(2);
    	try{
    	    File myobj2 = new File("toDecrypt.txt");
            Scanner myReader2 = new Scanner(myobj2);
            while (myReader2.hasNextLine()) {
                String data2 = myReader2.nextLine();
                String decrypt2 = cipher.decrypt(data2);
                System.out.println(decrypt2);
            }
            myReader2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
        }
     }
}
