package pt.ipbeja.po2.tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * @author Vasco Gomes 19921
 * @date 09/03/2022
 */
public class TicTacToeBoard extends GridPane {

    private final int SIZE = 3;
    private int counter = 0;
    public TicTacToeBoard() {

        this.createBoard();
    }

    private void createBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                TicTacToeButton ticTacToeButton = new TicTacToeButton();
                ButtonHandler buttonHandler = new ButtonHandler();
                ticTacToeButton.setOnAction(buttonHandler);
                this.add(ticTacToeButton, j, i);
            }
        }
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {

            TicTacToeButton eventSource = (TicTacToeButton) event.getSource();
            counter++;

            if(counter % 2 == 0){
                eventSource.setX();

            } else {
                eventSource.setY();
            }

            if(counter == SIZE * SIZE){
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Jogo Terminou");
                alert.showAndWait();
                //Closes the Program with Code 0 with means that the program ended normally
                System.exit(0);
            }
        }
    }
}
