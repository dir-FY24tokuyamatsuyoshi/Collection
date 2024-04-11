package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample_re {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        for (String place : places) {
            System.out.println(place);
        }
        
        for (int i = 0; i < places.size(); i++){
            System.out.println(places.get(i));
        }
        
        System.out.println("サイズ：" + places.size());
        
        System.out.println("一番目：" + places.get(0));
        places.remove(0);
        System.out.println("一番目：" + places.get(0));
        
        places.set(0, "カナダ");
        System.out.println("一番目：" + places.get(0));
        
        places.forEach((place) -> System.out.println(place));
        
        System.out.println("サイズ：" + places.size());
        
        places.clear();
        System.out.println("サイズ：" + places.size());
    }

}
