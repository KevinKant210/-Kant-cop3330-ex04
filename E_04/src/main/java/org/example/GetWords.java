package org.example;

import java.util.Scanner;

public class GetWords {
    public String Noun;
    public String Adjective;
    public String Verb;
    public String Adverb;
    private Scanner reader = new Scanner(System.in);
    public void setWords(){
        System.out.print("Enter a Adjective: ");
        this.Adjective = reader.nextLine();
        System.out.print("Enter a Noun: ");
        this.Noun = reader.nextLine();
        System.out.print("Enter a Verb: ");
        this.Verb = reader.nextLine();
        System.out.print("Enter an Adverb: ");
        this.Adverb = reader.nextLine();

    }

    public void showLib(){
        System.out.printf("%nDo you %s your %s %s %s! Funny stuff",Verb,Adjective,Noun,Adverb);
    }

}
