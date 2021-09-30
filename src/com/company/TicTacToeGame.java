package com.company;

public class TicTacToeGame {

    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe Game");
        boardPrinting();

    }

    static void boardPrinting() {
        char[] board = new char[10];
        int i;
        for (i = 1; i < board.length; i++) {
            board[i] = ' ';
        }

    }
}


