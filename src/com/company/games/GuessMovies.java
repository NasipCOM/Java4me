package com.company.games;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;



public class GuessMovies {
    public void guessMovies() throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        Scanner scannerInput = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            movies.add(line);
        }
        int randomNum = (int) (Math.random() * movies.size()) + 1;
        String randomMovie = movies.get(randomNum);
        int len = randomMovie.length();
        int guessedLetter = 0;

        String[] letters = randomMovie.split("");
        String dashes = "_".repeat(len);
        String[] dashesLetters = dashes.split("");

        while (guessedLetter != letters.length) {
            System.out.print("You are guessing:");

            for (String string:dashesLetters) {
                System.out.print(string);
            }
            System.out.println();
            System.out.println("You have guessed " + guessedLetter + " letters");
            System.out.print("Please enter your char:");

            String input = scannerInput.nextLine();

            for (int i = 0; i < letters.length; i++) {
                if (input.equals(letters[i])) {
                    dashesLetters[i] = letters[i];
                    guessedLetter++;
                    if (guessedLetter == letters.length) {
                        System.out.println("You win! The word is " + randomMovie);
                    }
                }
            }
        }

    }
}