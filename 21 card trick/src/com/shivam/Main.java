
// Created by Shivam Shukla.

package com.shivam;



import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        action();

//        char c= '\u2660';
//        System.out.println(c);
//        _21_card_trick();

//
//        String diamonds[] = createArray('\u2666');
//        String spades[] = createArray('\u2660');
//        String heart[] = createArray('\u2665');
//        String clubs[] = createArray('\u2663');
//
//        for (int i = 0; i < 13; i++) {
//            System.out.println(spades[i] + "\t\t" + clubs[i] + "\t\t" + diamonds[i] + "\t\t" + heart[i]);
//
//
//        }
//
//        System.out.println((int)(Math.random()*10)%4);
//
//        String shuffledCards [] = shuffleCards();
//
//        for (String s:shuffledCards){
//            System.out.println(s);
//        }
//
//
//        for (int i = 0; i <=17; i++) {
//            System.out.println();
//        }

//        showCardStack(1);


    }

//    public static void _21_card_trick(){
//
//        String spades[] = new String[13];
//        spades[0]="A "+'\u2660';
//        for (int i=2; i<=10;i++){
//            spades[i-1]=i+"  "+'\u2660';
//        }
//
//        spades[10] = "K "+'\u2660';
//        spades[11] = "Q "+'\u2660';
//        spades[12] = "J "+'\u2660';
//
//        String clubs[] = new String[13];
//
//        clubs[0]="A "+'\u2663';
//        for (int i=2; i<=10;i++){
//            clubs[i-1]=i+"  "+'\u2663';
//        }
//
//        clubs[10] = "K "+'\u2663';
//        clubs[11] = "Q "+'\u2663';
//        clubs[12] = "J "+'\u2663';
//
//
//        String heart[] = new String[13];
//        heart[0]="A "+'\u2665';
//        for (int i=2; i<=10;i++){
//            heart[i-1]=i+"  "+'\u2665';
//        }
//
//        heart[10] = "K "+'\u2665';
//        heart[11] = "Q "+'\u2665';
//        heart[12] = "J "+'\u2665';
//
//
//        String diamond[] = new String[13];
//        diamond[0]="A "+'\u2666';
//        for (int i=2; i<10;i++){
//            diamond[i-1]=i+"  "+'\u2666';
//        }
//        diamond[9]=10+" "+'\u2666';
//        diamond[10] = "K "+'\u2666';
//        diamond[11] = "Q "+'\u2666';
//        diamond[12] = "J "+'\u2666';
//
//
//        for (int i = 0; i < 13 ; i++) {
//            System.out.println(spades[i]+"\t\t"+clubs[i]+"\t\t"+diamond[i]+"\t\t"+heart[i]);
//        }
//
//
//
//    }

    public static String [] createArray(char unicode){

        String card[] = new String[13];
        card[0]="A  "+unicode;
        for (int i=2; i<10;i++){
            card[i-1]=i+"  "+unicode;
        }
        card[9]=10+" "+unicode;
        card[10] = "K  "+unicode;
        card[11] = "Q  "+unicode;
        card[12] = "J  "+unicode;

        return card;

    }

    public static String[] shuffleCards(){

        String [] cards = new String[21];
        LinkedHashSet<String> selectedCards = new LinkedHashSet<>();


        String diamonds[] = createArray('\u2666');
        String spades[] = createArray('\u2660');
        String heart[] = createArray('\u2665');
        String clubs[] = createArray('\u2663');

        int count =0;


        while (count<=20){

            int deckNumber =(int) (Math.random()*10%4);

            String selectedDeck[] = new String[13];

            switch (deckNumber){
                case 0:
                    selectedDeck=diamonds;
                    break;
                case 1:
                    selectedDeck=spades;
                    break;
                case 2:
                    selectedDeck= heart;
                    break;
                case 3:
                    selectedDeck=clubs;
                    break;
            }


            if (selectedCards.add(selectedDeck[(int)(Math.random()*100%13)])){
                count++;
            }


        }

        selectedCards.toArray(cards);
        return cards;

    }

//    public static String[][] createStackOfSize3(){
//
//        String [][] stacks = new String[3][7];
//
//        String[] shuffeledCards = shuffleCards();
//
//        int j=0, k=0;
//        for (int i=0;i<3;i++){
//
//            k=j*i;
//            j=0;
//            for (;j<7;j++,k++){
//                stacks[i][j]=shuffeledCards[k];
//
//            }
//        }
//
//
//
//        return stacks;
//
//    }
    private static String[][] createStack(String[] cards){

        String [][] stack = new String[3][7];

        String[] shuffeledCards = cards;

        int i=0;

        for (int j=0;j<7;j++){

            stack[0][j] = shuffeledCards[i++];
            stack[1][j] = shuffeledCards[i++];
            stack[2][j] = shuffeledCards[i++];

        }

        return stack;
    }

    private static void showCardStack(String[][] cardsSet) throws Exception{



        System.out.println("STACK-1\t\t\t\t"+"STACK-2\t\t\t\t"+"STACK-3");
        System.out.println("-------\t\t\t\t"+"-------\t\t\t\t"+"-------");

        String[][] cards = cardsSet;



       for (int j = 0; j < 7; j++) {
           Thread.sleep(600);
           System.out.print(" "+cards[0][j]+"  \t\t\t\t ");
           Thread.sleep(600);
           System.out.print(cards[1][j]+"  \t\t\t\t ");
           Thread.sleep(600);
           System.out.print(cards[2][j]+"\n");

       }



    }

//    public static void codeInAction(){
//
//        String[][] cards = createStackOfSize3();
//
//        String[][] finalCards = showCardStack(cards,1);
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int noOfRepetition = 2;
//        int selectedStack=0;
//        while (noOfRepetition>0){
//            selectedStack = sc.nextInt();
//            showCardStack(cards,selectedStack);
//            noOfRepetition--;
//        }
//
//        System.out.println("Your Guessed card : "+finalCards[selectedStack-1][3]);
//    }

    public static void action() throws Exception{

        String [] cards = shuffleCards();
//        System.out.println(Arrays.toString(cards));


        String[][] stacks = createStack(cards);


        System.out.println("\n******************************************************************************************************************************");
        System.out.println("\nGUESS ANY CARD FROM : " + Arrays.toString(cards));
        System.out.println("\n---------NOW FIND THAT CARD IN FOLLOWING STACKS AND ENTER THE STACK NUMBER IN WHICH IT IS KEPT---------\n");

        showCardStack(stacks);
        Scanner sc = new Scanner(System.in);

        int count = 2;
        String [] newOrderdCards = new String[21];
        String [][] newStacks = stacks;
        while (count>0){

            System.out.println("\nENTER STACK NUMBER : ");
            int stackSelected = sc.nextInt();

            newOrderdCards = mergeStacks(newStacks,stackSelected);
//            System.out.println(Arrays.toString(newOrderdCards));

            newStacks = createStack( newOrderdCards);

            showCardStack(newStacks);

            count--;
        }
        System.out.println("\nENTER STACK NUMBER : ");
        newOrderdCards = mergeStacks(newStacks,sc.nextInt());
        System.out.println("\n\nYOUR GUESSED CARD IS : "+newOrderdCards[10]);
        System.out.println("\n\n******************************************************************************************************************************");



    }

    private static String[] mergeStacks(String[][] stacks, int n){

        String[] newOrderedCards = new String[21];

        switch (n) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i] = stacks[1][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 7] = stacks[0][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 14] = stacks[2][i];
                }
                break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i] = stacks[0][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 7] = stacks[1][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 14] = stacks[2][i];
                }
                break;
            case 3:
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i] = stacks[0][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 7] = stacks[2][i];
                }
                for (int i = 0; i < 7; i++) {
                    newOrderedCards[i + 14] = stacks[1][i];
                }
                break;
            }
            return newOrderedCards;
    }

}

