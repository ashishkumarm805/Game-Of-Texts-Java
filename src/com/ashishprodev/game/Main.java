package com.ashishprodev.game;

public class Main {
    static AsciiArtGen agent;
    public static void main(String[] args){
       welcome();
    }
    static void welcome(){
        agent = new AsciiArtGen();
        agent.asciiFromText("_G A M E_");
        agent.asciiFromText("__ O F___");
        agent.asciiFromText("_T E X T_");
    }
}
