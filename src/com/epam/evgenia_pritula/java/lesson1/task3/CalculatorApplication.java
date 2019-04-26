package com.epam.evgenia_pritula.java.lesson1.task3;

import java.util.Scanner;

public class CalculatorApplication {

    public int result;
    String operand = "";
    public void run()
    {       do {
        showMenu();
        operand = readOperand();
        if (operand.equals("Q")) break;
        showMenuNum();
            int number = readNum();
            int number1 = readNum();

            switch (operand) {
                case "+":
                    addMethod(number, number1);
                    break;
                case "-":
                    deductMethod(number, number1);
                    break;
                case "*":
                    multiplyMethod(number, number1);
                    break;
                case "/":
                    devideMethod(number, number1);
                    break;
                }
        } while (!operand.equals("Q")) ;
    }

 public void showMenuNum() {
     System.out.println("Input A and B for calculation:");
          }
  public void showMenu(){
      System.out.println("Input operetion:");
     System.out.println("operation +");
     System.out.println("operation -");
     System.out.println("operation *");
     System.out.println("operation /");
     System.out.println("Q Qiut");
     }

    public void showMenuRes() {
        System.out.println("Result A "+ operand + " B =  "+ result);}


    public String readOperand(){
           Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    return str;
    }

    public int readNum(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    return i;
    }

    public void addMethod(int number, int number1){
        result = number + number1;  showMenuRes();
    }

    public void deductMethod(int number, int number1){
        result = number - number1; showMenuRes();
    }

    public void devideMethod(int number, int number1){
        result = number / number1; showMenuRes();
    }

    public void multiplyMethod(int number, int number1){
        result = number * number1; showMenuRes();
    }
}
