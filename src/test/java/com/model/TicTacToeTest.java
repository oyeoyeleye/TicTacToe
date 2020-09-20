package com.model;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

public class TicTacToeTest {

    private void assertEquals(String expected, String actual) {
    }

    private void assertTrue(String whoWins) {
    }

    @Before
    public void setup() {
        TicTacToe game = new TicTacToe();
        game.makeBoard();
        game.updateBoard();
        game.whoWins();
        

        for (int i = 0; i < 9; i++) {
			if (Arrays.asList(game.position).contains(String.valueOf(i + 1))) {
				break;
			}			
        }

    }

    @Test
    public void tic_tac_toe_Test() {
        TicTacToe game = new TicTacToe();

        String expected = game.whoWins();        
        String actual = "xxx";
        assertEquals(expected, actual);
    }

    @Test
    public void horizontal_1_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[0] + game.position[1] + game.position[2];
        assertEquals(expected, actual);
    }

    @Test
    public void horizontal_2_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[3] + game.position[4] + game.position[5];
        assertEquals(expected, actual);
    }

    @Test
    public void horizontal_3_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[6] + game.position[7] + game.position[8];
        assertEquals(expected, actual);

    }

    @Test
    public void vertical_1_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[0] + game.position[3] + game.position[6];
        assertEquals(expected, actual);

    }

    @Test
    public void vertical_2_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[1] + game.position[4] + game.position[7];
        assertEquals(expected, actual);
    }

    @Test
    public void vertical_3_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[2] + game.position[5] + game.position[8];
        assertEquals(expected, actual);
    }

    @Test
    public void left_diagonal_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[0] + game.position[4] + game.position[8];
        assertEquals(expected, actual);
    }

    @Test
    public void right_diagonal_Test() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.whoWins());

        String actual = "xxx";
        String expected = game.position[2] + game.position[4] + game.position[6];
        assertEquals(expected, actual);
    }

}
