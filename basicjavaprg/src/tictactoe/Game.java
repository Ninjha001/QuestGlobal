package tictactoe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(String player1Name, String player2Name) {
        this.board = new Board();
        this.player1 = new Player(player1Name, 'X');
        this.player2 = new Player(player2Name, 'O');
        this.currentPlayer = player1; 
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ").");
            
            int row, col;
            while (true) { 
                System.out.print("Enter row (0-2): ");
                row = scanner.nextInt();
                System.out.print("Enter column (0-2): ");
                col = scanner.nextInt();
                
                if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                    break; 
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            if (board.checkWinner(currentPlayer.getSymbol())) { 
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) { 
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        scanner.close(); 
    }
}
