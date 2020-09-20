package com.model;

import java.util.Scanner;

public class Actions {
    
    static Scanner sc;

    public void BoardActions() {
        TicTacToe game = new TicTacToe();
        
        String turn = "X";
        String winner = null;

        game.updateBoard();
        game.makeBoard();
        System.out.println("Player X kindly start the game by picking a number");
       
        while (winner == null) {
            sc = new Scanner(System.in);
            int num = sc.nextInt();
            if ( num < 1 || num > 9 ) {
                System.out.println("Invalid input is given. It should be between 0 and 9");
                continue;
            }

            game.position[num-1] = ( String.valueOf(num) );  // This line is use to force the condition below to work

            if (game.position[num-1].equals( String.valueOf(num) )) {
				game.position[num-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				game.makeBoard();
				winner = game.whoWins();
			} else {
				System.out.println("Try again");
				continue;
			}
        }

        if (winner.equalsIgnoreCase("draw")) {
			System.out.println("This is a draw!");
		} else {
			System.out.println( winner + " won.");
        } 
    }
    
}