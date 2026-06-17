package strategy;

import models.Move;
import models.Player;

public interface WinningStrategy {

    boolean checkWinner(Move move);
}
