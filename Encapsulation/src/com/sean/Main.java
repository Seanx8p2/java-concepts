package com.sean;

import GameStuff.EnhancedPlayer;

public class Main {

    public static void main(String[] args)
    {
        /*
        Player player = new Player();
        player.fullName = "Sean";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        damage = 111;
        //because the variables are public, the "rules and parameters" can be redefined
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());
        */


        EnhancedPlayer Player = new EnhancedPlayer("Sean", 200, "Sword");
        System.out.println("Initial health is: " + Player.getHealth());
    }
}
