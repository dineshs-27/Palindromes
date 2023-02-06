package PalindromeNames;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> ReverseName = new ArrayList<>();
        ArrayList<String> Palindrome = new ArrayList<>();
        System.out.println("Enter the number of names : ");
        int x = getInput.nextInt();
        for (int i=0; i<x; i++) {
            System.out.println("Name " + (i + 1) + " : ");
            String S1 = Input.readLine();
            Name.add(S1);
        }
        System.out.println();
        System.out.println("Name list : ");
        for (int j = 0; j < x; j++) {
            String S2 = Name.get(j);
            String S3 = "";
            System.out.println((j+1) + "." + S2);
            for (int k = S2.length() - 1; k >= 0; k--) {
                char C = S2.charAt(k);
                S3 = S3 + C;
            }
            ReverseName.add(S3);
            if(Name.get(j).equals(ReverseName.get(j))) {
                Palindrome.add(Name.get(j));
            }
        }
        System.out.println("\nTotal Palindrome names : " + Palindrome.size());
        System.out.println("\nPalindrome Names : ");
        for (int k=0; k<Palindrome.size(); k++) {
            System.out.println(((Name.indexOf(Palindrome.get(k)))+1) + "." + Palindrome.get(k));
        }
    }
}