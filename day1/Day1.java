package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<Integer> inputValues = new ArrayList<>();
        String line;
        
        int acumulator = 0;
        while((line = br.readLine()) != null) {
            
            if(!line.isEmpty()) {
                acumulator += Integer.parseInt(line);
            } else {
                inputValues.add(acumulator);
                acumulator = 0;
            }
            
        }
        
        List<Integer> sortedInputValues = inputValues.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int maxCalories = sortedInputValues.get(0);
        int secondMaxCalories = sortedInputValues.get(1);
        int thirdMaxCalories = sortedInputValues.get(2);
        int total = maxCalories + secondMaxCalories + thirdMaxCalories;
        
        System.out.println("Max amount of calories: " + maxCalories);
        System.out.println("Second max amount of calories: " + secondMaxCalories);
        System.out.println("Third max amount of calories: " + thirdMaxCalories);
        System.out.println("Total amount: " + total);
    }
}
