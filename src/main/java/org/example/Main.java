package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.controller.GameController;
import org.example.view.GameView;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GameView gameView = new GameView();
        GameController gameController = new GameController(gameView);

        Scene scene = new Scene(gameView, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Game");
        primaryStage.show();

        gameController.startGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
