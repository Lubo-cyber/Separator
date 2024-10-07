package com.example.separator;

import javafx.fxml.FXML;
import javafx.scene.control.Separator;
import javafx.scene.input.MouseEvent;

public class HelloController
{

    @FXML
    private Separator verticalSeparator;

    @FXML
    public void onMouseEntered(MouseEvent event) {
        System.out.println("Mouse ha entrado en el separador");
        verticalSeparator.setStyle("-fx-background-color: gray;");
    }

    @FXML
    public void onMouseExited(MouseEvent event) {
        System.out.println("Mouse ha salido del separador");
        verticalSeparator.setStyle("-fx-background-color: transparent;");
    }
}
