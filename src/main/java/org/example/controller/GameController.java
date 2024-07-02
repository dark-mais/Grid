package org.example.controller;


import org.example.model.GameGrid;
import org.example.model.Objects;
import org.example.view.GameView;

public class GameController {
    private GameView gameView;
    private GameGrid gameGrid;

    public GameController(GameView gameView) {
        this.gameView = gameView;
        this.gameGrid = gameView.getGameGrid();
    }

    public void startGame() {
        // Initialize game objects and start game loop
    }

    public void updateGame() {
        // Update all game objects and refresh the view
        for (Objects object : gameGrid.getAllObjects()) {
            object.update();
        }
        gameView.updateView();
    }
}
