package com.savitha.genericsexample;


public class GenericsSolution {

  public static void main(String[] args) {
    Printer myPrinter = new Printer();
    Integer[] intArray = { 1, 2, 3 };
    String[] stringArray = {"Hello", "World"};
    myPrinter.printArray(intArray);
    myPrinter.printArray(stringArray);
    //int count = 0;
  }

}
