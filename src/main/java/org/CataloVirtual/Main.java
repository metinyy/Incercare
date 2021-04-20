package org.CataloVirtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.stage.Stage;
import org.CataloVirtual.services.FileSystemService;
import org.CataloVirtual.services.UserService;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import javafx.scene.paint.Color;
import java.io.*;


public class Main extends Application {



    public void start(Stage stage) throws Exception {
        initDirectory();
        UserService.initDatabase();
        Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("register.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    private void initDirectory() {
        Path applicationHomePath = FileSystemService.APPLICATION_HOME_PATH;
        if (!Files.exists(applicationHomePath))
            applicationHomePath.toFile().mkdirs();
    }


    public static void main(String[] args) {
        launch(args);
    }
}