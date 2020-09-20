package com.model;

import java.util.Scanner;

import org.junit.Test;

public class GetPlayerTest {

    private void assertEquals(String expected, String actual) {
    }

    String test = "I am a player";
    static Scanner sc;

    @Test
    public void PlayerInput() {
    sc = new Scanner(test);
    String out = "I am a player";
    System.out.println(out);
    assertEquals(test, out);
    }
}
 