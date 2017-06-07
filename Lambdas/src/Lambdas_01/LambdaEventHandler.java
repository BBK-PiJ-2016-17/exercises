package Lambdas_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;

/**
 * Created by ginestra on 07/06/2017.
 */
public class LambdaEventHandler extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        // Inner class
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });

        // Lambda notation
        btn.setOnAction( event -> System.out.println("Hello World!"));

        /**
         * Code for EventHandler Interface:
         * public interface ActionListener extends EventListener {
         * public void actionPerformed(ActionEvent e);
         */

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
