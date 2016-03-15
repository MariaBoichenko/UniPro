package com.company;

public class Objects {

    public static void main(String[] args)throws Exception{
        String name1 = "Буль-тер'єр";
        String name2 = "Той-тер'єр";
        String group1 = "Б";
        String group2 = "А";
        String location1 = "Європа";
        String location2 = "Європа, Америка";
        int count1 = 560000;
        int count2 = 2500;

        Dogs dog = new Dogs();
        Dogs dog1 = new Dogs(name1, group1, location1, count1);

        dog.Header();
        dog1.Data(dog.name, dog.group, dog.location, dog.count);
        dog1.Data(name1, group1, location1, count1);
        dog1.Data(name2, group2, location2, count2);
        dog.Foot();
    }
}
