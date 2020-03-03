package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //create a grid pane and configure it
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //grid.setHgap(10);
        grid.setVgap(5);
        grid.setPadding(new Insets(25,25,25,25));

        //add new scene
        Scene scene = new Scene(grid,300,300);

        //add all textfill
        Text sceneTitle = new Text("Please login: ");
        sceneTitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
        Label userName = new Label("UserName: ");
        TextField userTextField = new TextField();
        Label passWord = new Label("Password: ");
        TextField passTextField = new TextField();

        //adding data into the grid
        grid.add(sceneTitle,0,0,2,1);
        grid.add(userName,0,1);
        grid.add(userTextField,1,1);
        grid.add(passWord,0,2);
        grid.add(passTextField,1,2);

        //display gridline for debugging.
        grid.setGridLinesVisible(true);

        //creating a button inside a Hbox and add it to the grid
        Button button = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(button);
        grid.add(hbBtn,1,4);

        //add an action target.
        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        //add an event for the btn click "sign in"
        button.setOnAction(event ->
        {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button is pressed");
        });


        //setup the stage and set to show
        primaryStage.setTitle("My First Login Page using JavaFX");
        //setup the stylesheetvthe Main is the name of the class
        scene.getStylesheets().add(Main.class.getResource("Style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
