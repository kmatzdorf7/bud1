/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepone;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.Pos.BOTTOM_CENTER;
import static javafx.geometry.Pos.TOP_CENTER;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class GepOne extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello Gep'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello Gep!");
            }
        });
        
        Button troop = new Button();
        troop.setText("Get it in there!");
        troop.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Not that way");
            }
        });
        
        Label label = new Label("Casey");
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(troop);
        root.getChildren().add(label);
        root.setAlignment(btn,TOP_CENTER);
        root.setAlignment(troop,BOTTOM_CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Casey is a Geper!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
