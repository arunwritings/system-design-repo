package com.system_design_repo.llds.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {

    private final char[][] board;
    private int currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = ' ';
            }
        }
        currentPlayer = 1;
    }

    public void printBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int column) {
        if (row < 0 || row >= 3 || column < 0 || column >= 3
                || board[row][column] != ' ') {
            return false; // Invalid move
        }
        board[row][column] = (currentPlayer == 1) ? 'X' : 'O';
        currentPlayer = 3 - currentPlayer; // Switch player (1 to 2 or 2 to 1)
        return true;
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true; // Row win
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true; // Column win
            }
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true; // Diagonal win
        }
        return board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]; // Diagonal win
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int row, column;

        while (!game.isBoardFull() && !game.checkWinner()) {
            game.printBoard();

            System.out.print("Player " + game.currentPlayer + ", enter your move (row,column): ");
            String input = scanner.nextLine(); // Use nextLine to read the full input

            // Split the input string by comma
            String[] parts = input.split(",");
            if (parts.length == 2) {
                try {
                    row = Integer.parseInt(parts[0].trim());
                    column = Integer.parseInt(parts[1].trim());

                    if (game.makeMove(row, column)) {
                        System.out.println("Move successful!");
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers for row and column.");
                }
            } else {
                System.out.println("Invalid input format. Please enter row,column.");
            }
        }

        game.printBoard();

        if (game.checkWinner()) {
            System.out.println("Player " + (3 - game.currentPlayer) + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}
