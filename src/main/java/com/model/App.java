package com.model;

/**
 * Main class
 */
public class App {

    public static void main(String[] args) {

       GetPlayer player = new GetPlayer();
       player.GetInfo();

        Actions playingGame = new Actions();
        playingGame.BoardActions();
        
        DBConnect db = new DBConnect();
        db.DBC();
    }
}