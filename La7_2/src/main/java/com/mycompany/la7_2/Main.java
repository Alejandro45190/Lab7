package com.mycompany.la7_2;

import edu.tarleton.caesarcipher.Caesar;

public class Main {
    
    public static void main(String[] args) {
        Caesar cipher = new Caesar(2);
        Encrypt enc = new Encrypt();
        enc.encrypt();
        Decrypt dec = new Decrypt();
	dec.decrypt();
    }
}
