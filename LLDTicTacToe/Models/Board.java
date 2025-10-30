package LLDTicTacToe.Models;

import java.util.*;

public class Board {
    
    public int size;
    public PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }
    public boolean addPiece(int row,int column,PlayingPiece playingPiece) {
        if(board[row][column] != null){
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }
    public List<List<Integer>> getFreeCells() {
        List<List<Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(Arrays.asList(i, j));
                }
            }
        }
        return freeCells;
    }
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}