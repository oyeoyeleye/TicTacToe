package com.model;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * This class job is to access the Database (ItemRepository == DataAccessObject)
 */
public class ItemRepository {
    private static String filename = "Register.csv";

    public List<Item> load() {
        List<Item> register = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String[] item = sc.nextLine().split(",");
                register.add(new Item(ItemUtil.extractNumberFromInput(item[0]), item[1])); 
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return register;
    }
    
    public void save(List<Item> table) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for(Item i : table) {
                fileWriter.write(i.toString() + "\n");
                System.out.println("SaveToFile: " + i.toString());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void insert(Item item) {
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            fileWriter.append(item.toString() + "\n");
            System.out.println("SaveToFile: " + item.toString());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}