package com.epam.evgenia_pritula.java.lesson1.task2;

import java.util.Scanner;

public class StringProcess {
    Scanner scan = new Scanner(System.in);

    public void run() {
        Menu();
        int num = scan.nextInt();

        String[] str = InputStr(num);
        double s = avg(num, str);
        System.out.println("Avg string = (" + s + ")");
        maxavg(num, str , s);

    }

    public void Menu() {
        System.out.println("Input count string:");
    }

    public String[] InputStr(int n) {
        String[] mass = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input string №" + (i + 1));
            mass[i] = scan.next();
        }

        return mass;
    }

    public double avg(int n, String[] mass) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mass[i].length();
        }
        return (double) sum / n;

    }


  public void maxavg(int n, String[] mass, double s){
      for (int i=0; i < n; i++) {
          if (mass[i].length()> s)
              System.out.println("There is a string with a length of more than average:    " + mass[i] +"    ("+ mass[i].length() + ")");

      }


    }

}
