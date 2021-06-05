package cat.itb.martamacias7e4.dam.m03.uf4.practica;

import java.util.Scanner;

public class ChessBoard{
    ChessPiece[][] pieces;

    public ChessBoard() {
        pieces = new ChessPiece[8][8];
        for (int i=0;i<8;i++){
            for (int j=0; j<8;j++){
                if (i==1){
                    pieces[i][j] = new Pawn(true);
                }else if (i==6){
                    pieces[i][j] = new Pawn(false);
                }
            }
        }
        pieces[0][0] = new Rock(true);
        pieces[0][1] = new Knight(true);
        pieces[0][2] = new Bishop(true);
        pieces[0][3] = new Queen(true);
        pieces[0][4] = new King(true);
        pieces[0][5] = new Bishop(true);
        pieces[0][6] = new Knight(true);
        pieces[0][7] = new Rock(true);

        pieces[7][0] = new Rock(false);
        pieces[7][1] = new Knight(false);
        pieces[7][2] = new Bishop(false);
        pieces[7][3] = new Queen(false);
        pieces[7][4] = new King(false);
        pieces[7][5] = new Bishop(false);
        pieces[7][6] = new Knight(false);
        pieces[7][7] = new Rock(false);
    }

    public void paint(){
        // Versio 1
        /*
        for(ChessPiece[] chess: pieces) {
            for (ChessPiece piece: chess){
                if (piece == null) {
                    System.out.print(" ");
                } else {
                    String symbol = piece.getPieceString();
                    piece.paint(symbol);
                }
            }
            System.out.println();
        }
        System.out.println();*/

        // Versio 2
        System.out.println("  0 1 2 3 4 5 6 7");
        for(int i=0; i<8; i++){
            System.out.print(i+"|");
            for (int j=0; j<8; j++){
                if (pieces[i][j]==null){
                    System.out.print(" |");
                }else {
                    String symbol = pieces[i][j].getPieceString();
                    pieces[i][j].paint(symbol);
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
    public void move(){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        while (x1 != -1) {
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            if (pieces[x1][y1].canMove(x1, y1, x2, y2)){
                pieces[x2][y2] = pieces[x1][y1];
                pieces[x1][y1] = null;
            }else {
                System.out.println("Moviment impossible");
            }
            paint();
            x1 = scanner.nextInt();
        }
    }
}
