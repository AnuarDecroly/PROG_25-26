package com.decroly;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> heroNames = SQLAccessDCuniverse.getCharactersName();

        for(String heroName : heroNames){
            System.out.println(heroName);
        }

        List<Character> characters = SQLAccessDCuniverse.getCharacters();
        for(Character character : characters){
            System.out.println(character);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character ID: ");
        int id = scan.nextInt();

        Character ch = SQLAccessDCuniverse.getCharacter(id);
        System.out.println("\nSoy Batman!!! "+ch);

        System.out.print("Enter character name: ");
        scan = new Scanner(System.in);
        String name = scan.nextLine();
        List<Character> ch2 = SQLAccessDCuniverse.getCharacterByName(name);
        if(ch2.isEmpty()){
            System.out.println("No character found with that name");
        }else{
            for(Character character : ch2){
                System.out.println(character);
            }
        }

        scan = new Scanner(System.in);
        System.out.print("Enter character name: ");
        String nameHero = scan.nextLine();

        System.out.print("Enter characert alter Ego: ");
        String alterEgo = scan.nextLine();
        List<Character> ch3 = SQLAccessDCuniverse.getCharacterByNameAndAlterEgo(nameHero,alterEgo);
        if(ch3.isEmpty()){
            System.out.println("No character found with that name and alter Ego");
        }else{
            for(Character character : ch3){
                System.out.println(character);
            }
        }







    }
}