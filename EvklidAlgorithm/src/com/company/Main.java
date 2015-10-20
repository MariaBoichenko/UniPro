package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Алгоритм Евкліда
* Знаходження найбільшого спільного дільника двох чисел m і n
*
* Бойченко Марія, група КН-24
* */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int l, p;

       if(m>n){
           l=m/n; p=m-n*l; m=l*n+p;
           if(p==0){
               System.out.println(n);
           }else{
           do{
               l=m/n; p=m-n*l; m=l*n+p;
               if(p==0)
                   System.out.println(n);
               else{
                   m=n=p;
               }
           }while(p==0);
               System.out.println(n);
           }
       }else System.out.println("Error");
    }
}
