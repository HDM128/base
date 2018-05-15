//import java.io.DataInputStream;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedInputStream;

public class base {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for(int i=0;i<3;i++) {
            arr[i] = br.readLine();
        }

        System.out.println();

        for(int i=0; i<3; i++) {
            System.out.print(arr[i] + ' ');
        }
    }
}
