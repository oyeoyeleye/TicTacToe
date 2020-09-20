package com.model;

import java.util.Arrays;

public class TicTacToe {
    
    public String[] position = new String[9];
    static String turn = "X";
    
	public void makeBoard() {
		System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + position[0] + "   | " + position[1] + "  | "     + position[2]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + position[3] + "   | " + position[4] + "  | "     + position[5]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + position[6] + "   | " + position[7] + "  | "     + position[8]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
    }

    public void updateBoard() {
            for (int i = 0; i < 9; i++) {
                position[i] = String.valueOf(i+1);
            }
    }
    
    public String whoWins() {
		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = position[0] + position[1] + position[2];
				break;
			case 1:
                line = position[3] + position[4] + position[5];
				break;
			case 2:
                line = position[6] + position[7] + position[8];
				break;
			case 3:
				line = position[0] + position[3] + position[6];
				break;
			case 4:
				line = position[1] + position[4] + position[7];
				break;
			case 5:
				line = position[2] + position[5] + position[8];
				break;
			case 6:
				line = position[0] + position[4] + position[8];
				break;
			case 7:
                line = position[2] + position[4] + position[6];
                break;
            default:
                System.out.println("No winner");
            }
            
			if (line.equals("XXX")) {
				return "Player X wins";
			} else if (line.equals("OOO")) {
				return "Player O wins";
			    }
        }
        
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(position).contains(String.valueOf(i + 1))) {
				break;
			}
			else if (i == 8) return "draw";
        }
        
        System.out.println("Next player pick any number not selected");
        return null;
    }           
}

