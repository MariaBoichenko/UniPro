package com.company;

/**
 * Created by maria on 15.03.2016.
 */
public class Dogs {
    String name;
    String group;
    String location;
    int count;

    Dogs(){
        name = "Пудель";
        group = "А";
        location = "Європа";
        count = 30000;
    }
    Dogs(String a, String b, String c, int d){
        name = a;
        group = b;
        location = c;
        count = d;
    }

    void Header(){
        System.out.printf("-----------------------------------------------------------------\n");
        System.out.printf("|                       Породи собак                            |\n");
        System.out.printf("|---------------------------------------------------------------|\n");
        System.out.printf("|     Назва     |Група|      Мешкання     |Чисельність популяції|\n");
        System.out.printf("|---------------------------------------------------------------|\n");
    }

    void Data(String a, String b, String c, int d){
        System.out.printf("| %-13s | %-3s | %-17s | %-19d |\n", a, b, c, d);
    }

    void Foot(){
        System.out.printf("|---------------------------------------------------------------|\n");
        System.out.printf("|Групи: А - неагресивні породи, Б - агресивні породи            |\n");
        System.out.printf("-----------------------------------------------------------------\n");
    }
}
