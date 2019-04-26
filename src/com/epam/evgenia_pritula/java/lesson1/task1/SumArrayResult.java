package com.epam.evgenia_pritula.java.lesson1.task1;

public class SumArrayResult {
           int[] myList = new int[20];
        int total = 0;

        public void run() {
            int i = 0;

            myList = getArray(myList);
            Summ();
            printSumm();
        }

        public int[] getArray(int[] myArray) {
            myArray = new int[20];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = ((int) (Math.random() * 20) - 10);
                System.out.print("[" + i + "]:" + myArray[i] + "   ");
            }
            return myArray;
        }

        public void Summ() {

            for (int i = 0; i < myList.length; i += 2) {
                total += myList[i];
            }
        }

        public void printSumm() {
            System.out.println();
            System.out.println("Сумма элементов массива myList: " + total);
        }

    }

