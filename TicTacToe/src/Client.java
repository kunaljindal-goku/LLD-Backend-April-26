import controller.GameController;
import models.Game;
import models.Player;
import models.enums.GameState;
import strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        int size = 4;
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        GameController gameController = new GameController();
        Game game = gameController.startGame(size,players,winningStrategies);
        gameController.display(game);

        // play
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            //input
            // makeMove
            // checkWinner
            // if winner update gamestate -> COMPLETED
            // keep on playing
        }

      if(gameController.getGameState(game).equals(GameState.DRAW)) {
          System.out.println("Game DRAWN");
      }
      else {
          // winning
          System.out.println("PLayer has won");
      }
    }
}
