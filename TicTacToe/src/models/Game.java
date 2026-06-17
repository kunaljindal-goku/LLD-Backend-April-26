package models;

import models.enums.GameState;
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
}
