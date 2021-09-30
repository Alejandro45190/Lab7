package com.mycompany.la7_2;

import edu.tarleton.caesarcipher.Caesar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Encrypt {
    static void encrypt() {
        Caesar cipher = new Caesar(2);
    	try {
            File myobj = new File("toEncrypt.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String encrypt = cipher.encrypt(data);
                System.out.println(encrypt);
           }
            myReader.close();
	} catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
        }
     }
}
