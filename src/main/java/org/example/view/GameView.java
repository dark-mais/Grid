package org.example.view;

import javafx.scene.layout.GridPane;
import org.example.model.GameGrid;
import org.example.model.Objects;

public class GameView extends GridPane {
    private GameGrid gameGrid;

    public GameView() {
        this.gameGrid = new GameGrid(15, 15);
        // Initialize the game view with initial objects
    }

    public void updateView() {
        this.getChildren().clear();
        for (Objects object : gameGrid.getAllObjects()) {
            // Add visual representation of objects to the grid
        }
    }

    public GameGrid getGameGrid() {
        return gameGrid;
    }
}
