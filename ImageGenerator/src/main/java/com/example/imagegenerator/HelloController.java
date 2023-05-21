package com.example.imagegenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URI;

public class HelloController extends ApriURL {

    @FXML
    private Button btninsert;

    @FXML
    private TextField tfinsert;

    @FXML
    private ImageView ifimage;

    @FXML
    void insert() {

        String Input = tfinsert.getText();
        String url = "https://image.pollinations.ai/prompt/A%20" + Input;
        try {
           Image image = new Image(url);
           ifimage.setPreserveRatio(false);
            ifimage.setImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}
