package com.model;

import java.util.Scanner;

public class GetPlayer {
    
    static Scanner sc;

    public void GetInfo() {
        System.out.println('\n' + "Game begins with player X" + '\n');
        System.out.println("Player X enter your name in the format \"Tag_Number,Name. Note: First Quotation mark is included.");
        sc = new Scanner(System.in);
        String commandX = sc.nextLine();
        String[] cmdtokensX = commandX.split(",");
        Item playerX = new Item(ItemUtil.extractNumberFromInput(cmdtokensX[0]), cmdtokensX[1]);
        System.out.println("## 01: " + playerX.toString());
        ItemRepository dao = new ItemRepository();
        dao.insert(playerX);

        System.out.println("Player O enter your name in the format \"Tag_Number,Name. Note: First Quotation mark is included. ");
        sc = new Scanner(System.in);
        String commandO = sc.nextLine();
        String[] cmdtokensO = commandO.split(",");
        Item playerO = new Item(ItemUtil.extractNumberFromInput(cmdtokensO[0]), cmdtokensO[1]);
        System.out.println("## 02: " + playerO.toString());
        dao.insert(playerO);
    }
    
}