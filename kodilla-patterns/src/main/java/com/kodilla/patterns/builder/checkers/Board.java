package com.kodilla.patterns.builder.checkers;

public class Board {
	public final static int MIN_INDEX = 0; //dwie stałe, z kt mogą korzystać kl zew, aby okr jak duż jest plansza
	public final static int MAX_INDEX = 9;// c.d.: obecnie plansza ma 10x10 elementów (zakres od 0 do 9)
	Figure[][] board = new Figure[10][]; //dwuwymiarowa tablica board, jej elementami mogą być obiekty typu Figure

	public Board() { // konstruktor inicjujący pustą planszę
		for(int n=0; n<10; n++) {
			board[n] = new Figure[10];
		}
	}
	public Figure getFigure(int x, int y) { //getter pozwala pobierać figurę z danego miejsca planszy
		return board[x][y];
	}
	public void setFigure(Figure figure, int x, int y) { //setter pozwalający przypisać figurę do danego miejsca na planszy
		board[x][y] = figure;
	}

	@Override
	public String toString() { // wyswietla planszę wraz z figurami
		String result = "";
		for(int n=MIN_INDEX; n<=MAX_INDEX; n++) {
			result += "|";
			for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
				if(board[n][k] == null) {
					result += "  ";
				} else {
					result += (board[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
					result += (board[n][k]) instanceof Pawn ? "P" : "Q";
				}
				result += "|";
			}
			result += "\n";
		}
		return result;
	}
}
