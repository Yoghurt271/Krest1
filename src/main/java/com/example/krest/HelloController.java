package com.example.krest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    String[] mas = new String[9];

    //region AddElements
    @FXML
    private Label welcomeText;

    @FXML
    private Label whoTurn;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but7;

    @FXML
    private Button but8;

    @FXML
    private Button but9;

    @FXML
    private Button newGame;
    //endregion

    //region ButtonClick
    @FXML
    protected void ButtonClick1() {
        but1.setText(turn());
        but1.setDisable(true);
        mas[0] = turnn();
        result();

    }

    @FXML
    protected void ButtonClick2() {
        but2.setText(turn());
        but2.setDisable(true);
        mas[1] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick3() {
        but3.setText(turn());
        but3.setDisable(true);
        mas[2] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick4() {
        but4.setText(turn());
        but4.setDisable(true);
        mas[3] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick5() {
        but5.setText(turn());
        but5.setDisable(true);
        mas[4] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick6() {
        but6.setText(turn());
        but6.setDisable(true);
        mas[5] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick7() {
        but7.setText(turn());
        but7.setDisable(true);
        mas[6] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick8() {
        but8.setText(turn());
        but8.setDisable(true);
        mas[7] = turnn();
        result();
    }

    @FXML
    protected void ButtonClick9() {
        but9.setText(turn());
        but9.setDisable(true);
        mas[8] = turnn();
        result();
    }

    @FXML
    protected void newGame() throws IOException{
        HelloApplication helloApplication = new HelloApplication();
        Stage stage = (Stage) newGame.getScene().getWindow();
        stage.close();
        helloApplication.restart();

    }
    //endregion

    @FXML
    protected String turn() {
        String krestOrNull;

        if(whoTurn.getText().equals("Сейчас ход: X"))
        {
            krestOrNull = "X";

            whoTurn.setText("Сейчас ход: O");
        }
        else {
            krestOrNull = "O";

            whoTurn.setText("Сейчас ход: X");
        }

        return krestOrNull;
    }

    @FXML
    protected String turnn() {
        String krestOrNull;

        if(whoTurn.getText().equals("Сейчас ход: O"))
        {
            krestOrNull = "X";
        }
        else {
            krestOrNull = "O";
        }

        return krestOrNull;
    }
    @FXML
    protected void result() {
        
//        0 1 2
//        3 4 5
//        6 7 8
        if (mas[0] == "X" && mas[1] == "X" && mas[2] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[3] == "X" && mas[4] == "X" && mas[5] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[6] == "X" && mas[7] == "X" && mas[8] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[0] == "X" && mas[4] == "X" && mas[8] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[2] == "X" && mas[4] == "X" && mas[6] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[0] == "X" && mas[3] == "X" && mas[6] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[1] == "X" && mas[4] == "X" && mas[7] == "X") {
            welcomeText.setText("Победили крестики");
        } else if (mas[2] == "X" && mas[5] == "X" && mas[8] == "X") {
            welcomeText.setText("Победили крестики");
        }
        else if (mas[0] == "O" && mas[1] == "O" && mas[2] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[3] == "O" && mas[4] == "O" && mas[5] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[6] == "O" && mas[7] == "O" && mas[8] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[0] == "O" && mas[4] == "O" && mas[8] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[2] == "O" && mas[4] == "O" && mas[6] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[0] == "O" && mas[3] == "O" && mas[6] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[1] == "O" && mas[4] == "O" && mas[7] == "O") {
            welcomeText.setText("Победили нолики");
        } else if (mas[2] == "O" && mas[5] == "O" && mas[8] == "O") {
            welcomeText.setText("Победили нолики");
        }
        else {
            welcomeText.setText("");}

    }


}