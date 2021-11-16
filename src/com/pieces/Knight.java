package pieces;

import java.util.ArrayList;

import chess.Cell;

public class Knight extends Piece {

	// Constructor
	public Knight(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}
	    // a knight can move in any L shape and can jump over anyone
        // in order to do so. He cannot attack his own pieces.
        // By an L shape, I mean it can move to a square that is 2 squares away
        // horizontally and 1 square away vertically, or 1 square away horizontally
        // and 2 squares away vertically.

	// Knight moves only 2 and half 2(1/2) steps
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		possiblemoves.clear();
		// max 8 possible moves for a knight at any point of time.
		int posx[] = { x + 1, x + 1, x + 2, x + 2, x - 1, x - 1, x - 2, x - 2 };
		int posy[] = { y - 2, y + 2, y - 1, y + 1, y - 2, y + 2, y - 1, y + 1 };
		for (int i = 0; i < 8; i++)
			if ((posx[i] >= 0 && posx[i] < 8 && posy[i] >= 0 && posy[i] < 8))
				if ((state[posx[i]][posy[i]].getpiece() == null
						|| state[posx[i]][posy[i]].getpiece().getcolor() != this.getcolor())) {
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}