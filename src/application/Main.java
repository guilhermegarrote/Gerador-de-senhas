package application;

import entitites.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de caracteres: ");
        int quantityCharacters = sc.nextInt();

        Password password = new Password(quantityCharacters);
        password.generatePassword();

        System.out.println(password);
    }
}