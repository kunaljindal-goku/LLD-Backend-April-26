package models;

import factory.BotPlayingStrategyFactory;
import models.enums.BotDifficulty;
import models.enums.PlayerType;
import strategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficulty botDifficulty;
    private BotPlayingStrategy playingStrategy;

    public Bot(int id,
               String name,
               Symbol symbol,
               PlayerType playerType,
               BotDifficulty botDifficulty,
               BotPlayingStrategy playingStrategy) {
        super(id, name, symbol, playerType);
        this.botDifficulty = botDifficulty;
        this.playingStrategy = playingStrategy;
    }

    public BotDifficulty getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficulty botDifficulty) {
        this.botDifficulty = botDifficulty;
    }

    public BotPlayingStrategy getPlayingStrategy() {
        return playingStrategy;
    }

    public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }
}
