package pieces;

import java.util.ArrayList;

import chess.Cell;

public class King extends Piece {
	    //a king can move one square up, right, left, or down, or
        // diagonally, but he can never put himself in danger of an opposing
        // piece attacking him on the next turn. He cannot attack his own pieces.

	// King Constructor
	public King(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// King can move only one step. So all the 8 cells have been considered.
		possiblemoves.clear();
		int posx[] = { x, x, x + 1, x + 1, x + 1, x - 1, x - 1, x - 1 };
		int posy[] = { y - 1, y + 1, y - 1, y, y + 1, y - 1, y, y + 1 };
		for (int i = 0; i < 8; i++)
			if ((posx[i] >= 0 && posx[i] < 8 && posy[i] >= 0 && posy[i] < 8))
				if ((state[posx[i]][posy[i]].getpiece() == null
						|| state[posx[i]][posy[i]].getpiece().getcolor() != this.getcolor()))
					possiblemoves.add(state[posx[i]][posy[i]]);
		return possiblemoves;
	}

}