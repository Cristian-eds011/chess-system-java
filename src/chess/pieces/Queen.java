package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position pAux = new Position(0, 0);

		// above
		pAux.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setRow(pAux.getRow() - 1);
		}

		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// left
		pAux.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setColumn(pAux.getColumn() - 1);
		}

		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// right
		pAux.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setColumn(pAux.getColumn() + 1);
		}

		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// below
		pAux.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setRow(pAux.getRow() + 1);
		}

		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// nw
		pAux.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setValues(pAux.getRow() - 1, pAux.getColumn() - 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// ne
		pAux.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setValues(pAux.getRow() - 1, pAux.getColumn() + 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// se
		pAux.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setValues(pAux.getRow() + 1, pAux.getColumn() + 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		// sw
		pAux.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setValues(pAux.getRow() + 1, pAux.getColumn() - 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			matriz[pAux.getRow()][pAux.getColumn()] = true;
		}

		return matriz;
	}
}
