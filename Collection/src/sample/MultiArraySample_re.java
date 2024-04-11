package sample;

import java.lang.management.OperatingSystemMXBean;

public class MultiArraySample_re {

    public static void main(String[] args) {
        var numbers = new int[3][4];
        
        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i * 3 + j + 1;
                
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "");
                
            }
            System.out.println();
        }
        
        

    }

}
