package pt.ipbeja.po2.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Vasco Gomes 19921
 * @date 02/03/2022
 */
public class TicTacToeStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        Scene scene = new Scene(ticTacToeBoard);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TicTacToe Aula 09/03/2022");
        primaryStage.setMinHeight(200);
        primaryStage.setMinWidth(400);
        primaryStage.show();
    }
}
