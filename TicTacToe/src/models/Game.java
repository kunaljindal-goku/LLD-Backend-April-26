package models;

import models.enums.GameState;
import strategy.RowWinningStrategy;
import strategy.WinningStrategy;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> move;
    private Player winner;
    private GameState gameState;
    private int nextTurn;
    private List<WinningStrategy> winningStrategies;

    public Game(int size,
                List<Player> players,
                List<WinningStrategy> winningStrategies) {
        this.board = new Board(size);  // string HAS-A, composition
        this.players = players; // WEAK HAS-A
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextTurn() {
        return nextTurn;
    }

    public void setNextTurn(int nextTurn) {
        this.nextTurn = nextTurn;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
