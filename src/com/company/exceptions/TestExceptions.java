package com.company.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) throws ScannerException {
     Scanner scanner = new Scanner(System.in);
     while (true){
         int x = Integer.parseInt(scanner.nextLine());

         if(x != 0){
           throw new ScannerException("Problem occured");
         }
     }
    }
}
