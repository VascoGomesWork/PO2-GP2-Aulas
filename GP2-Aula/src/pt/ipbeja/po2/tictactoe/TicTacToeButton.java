package pt.ipbeja.po2.tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * @author Vasco Gomes 19921
 * @date 16/03/2022
 */
public class TicTacToeButton extends Button {

    public TicTacToeButton(){
        this.setGraphic(new ImageView("resources/noplayer.png"));
    }

    public void setX() {
        this.setGraphic(new ImageView("resources/player1.png"));
        this.setDisable(true);
    }

    public void setY() {
        this.setGraphic(new ImageView("resources/player2.png"));
        this.setDisable(true);
    }
}
