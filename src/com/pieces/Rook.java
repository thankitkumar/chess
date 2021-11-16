package pieces;

import java.util.ArrayList;

import chess.Cell;

public class Rook extends Piece {

	// Constructor
	public Rook(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	// rook can move as many squares as he wants either forward,
	// backward, or sideways without jumping any pieces. He cannot attack
	// his own pieces.
	// Rook can move only horizontally or vertically
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
	
		possiblemoves.clear();
        //Checking possible moves in vertical direction
		int tempx = x - 1;
		while (tempx >= 0) {
			if (state[tempx][y].getpiece() == null)
				possiblemoves.add(state[tempx][y]);
			else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		tempx = x + 1;
		while (tempx < 8) {
			if (state[tempx][y].getpiece() == null)
				possiblemoves.add(state[tempx][y]);
			else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		//Checking possible moves in horizontal Direction
		int tempy = y - 1;
		while (tempy >= 0) {
			if (state[x][tempy].getpiece() == null)
				possiblemoves.add(state[x][tempy]);
			else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy = y + 1;
		while (tempy < 8) {
			if (state[x][tempy].getpiece() == null)
				possiblemoves.add(state[x][tempy]);
			else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		return possiblemoves;
	}
}