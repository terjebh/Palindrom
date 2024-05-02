package no.itfakultetet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Tast inn en tekst: ");
        Scanner in = new Scanner(System.in);
        String tekst = in.nextLine();
        int high = tekst.length() - 1;
        int low = 0;
        Boolean isPalindrome = true;
        while (low < high) {

            if (tekst.charAt(low) != tekst.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        System.out.println(tekst + (isPalindrome == true ? " er" : "er ikke") + " et palindrom");

    }

}