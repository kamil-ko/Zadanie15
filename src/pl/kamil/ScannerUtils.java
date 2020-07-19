package pl.kamil;

import java.util.Scanner;


public class ScannerUtils {
    public static final Scanner scanner = new Scanner(System.in);

    public static float getFromScannerFloat(String message) {
        System.out.println(message);
        return scanner.nextFloat();
    }

    public static int getFromScannerInt(String message) {
        System.out.println(message);
        return scanner.nextInt();

    }

    public static String getFromScannerString(String message) {
        System.out.println(message);
        return scanner.nextLine();

    }




}
