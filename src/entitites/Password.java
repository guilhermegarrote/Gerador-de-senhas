package entitites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Password {
    private String[] characters;

    public Password() {
    }

    public Password(int quantityCharacters){
        characters = new String[quantityCharacters];
    }

    public void generatePassword(){
        List<Character> alphabet = new ArrayList<>();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(letter);
        }


        for (int i = 0; i != characters.length; i++){
            Collections.shuffle(alphabet);
            characters[i] = String.valueOf(alphabet.get(0));
        }
    }

    @Override
    public String toString() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i != characters.length; i++){
            password.append(characters[i]);
        }
        return password.toString();
    }
}
