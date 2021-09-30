package com.company;

public class TicTacToe {

    public static void main(String[] args) {
        userCase1();

    }

    static void userCase1() {
        char[] Board = new char[10];
        int i;
        for (i = 1; i <= Board.length; i++) {
            Board[i] = ' ';
        }

    }
}


