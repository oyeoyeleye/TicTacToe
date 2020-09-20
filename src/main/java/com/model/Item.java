package com.model;

/**
 * Make an item list of number of players and their names. 
 */
public class Item implements Comparable<Item> {
    int id;
    String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + "," + name;
    }

    @Override
    public int compareTo(Item item) {
        return Integer.valueOf(id).compareTo(item.id);
    }  
}