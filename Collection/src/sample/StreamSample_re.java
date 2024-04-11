package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class StreamSample_re {

    public static void main(String[] args) {
        List<Integer> places = new ArrayList<>();
        
        places.add(1);
        places.add(18);
        places.add(7);
        places.add(5);
        places.add(19);
        
        places.stream().forEach((place) -> System.out.println(place));
   

        places.stream()
              .map((place) -> "i love " + place)
              .forEach((place) -> System.out.println(place)); 
       
        
        List<String> numbers = places.stream()
                        .sorted()
                        .map(number -> "I love " + number) 
                        .collect(Collectors.toList());
        
        System.out.println(numbers);
        
        int[] list = new int[5];
        
        for (int li : list) {
            System.out.println(li);
        }
    }

}
