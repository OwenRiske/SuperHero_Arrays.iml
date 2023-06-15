package com.company;

public class Main {

    public static void main(String[] args) {
	String[] superHero = new String[5];

	superHero[0]="Iron Man";
	superHero[1]="Super Man";
	superHero[2]="Hulk";
	superHero[3]="Batman";
	superHero[4]="Doctor Strange";





    String[] weakness= new String[superHero.length];
    weakness[0]="EMP";
    weakness[1]="Kryptonite";
    weakness[2]="Not being Angry";
    weakness[3]="His Parents";
    weakness[4]="His Principles";


    String[] powers=new String[superHero.length];
    powers[0]="Technology";
    powers[1]="Flight, Superhuman Strength, X-Ray Vision, Heat Vision, Cold Breath, Super-Speed, Enhanced Hearing, and Nigh-Invulnerability";
    powers[2]="Healing Factor, Superhuman Durability, Superhuman Strength, Size and Shape Alteration";
    powers[3]="Gadgets";
    powers[4]="Eldritch Magic";




        for (int count=0; count<=4; count++) {
            System.out.println("Name: "+superHero[count]);
            System.out.println("    Powers: "+powers[count]);
            System.out.println("    Weaknesses: "+weakness[count]);
            System.out.println();

        }


    }
}
