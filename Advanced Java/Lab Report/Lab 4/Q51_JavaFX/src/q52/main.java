package q52;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class main extends Application {

    @Override
    public void start(Stage stage) {

        // ⭐ Label
        Label title = new Label("Lab 4 - Sulav Adhikari - 23081003");

        // ⭐ TextField
        TextField tf = new TextField();
        tf.setPromptText("Enter your name");

        // ⭐ Button
        Button btn = new Button("Submit");

        // ⭐ Tooltip
        btn.setTooltip(new Tooltip("Click to submit"));

        // ⭐ RadioButtons
        RadioButton r1 = new RadioButton("Male");
        RadioButton r2 = new RadioButton("Female");

        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);

        // ⭐ CheckBox
        CheckBox cb = new CheckBox("I agree");

        // ⭐ Hyperlink
        Hyperlink link = new Hyperlink("Visit Website");

        // ⭐ Menu
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem item1 = new MenuItem("Open");
        MenuItem item2 = new MenuItem("Exit");
        menu.getItems().addAll(item1, item2);
        menuBar.getMenus().add(menu);

        // ⭐ FileChooser
        FileChooser fc = new FileChooser();

        item1.setOnAction(e -> {
            File file = fc.showOpenDialog(stage);
            if(file != null){
                System.out.println(file.getAbsolutePath());
            }
        });

        // Button action
        btn.setOnAction(e -> {
            System.out.println("Name: " + tf.getText());
        });

        // ⭐ Layout
        VBox root = new VBox(10);

        root.getChildren().addAll(
                menuBar,
                title,
                tf,
                btn,
                r1, r2,
                cb,
                link
        );

        Scene scene = new Scene(root, 400, 350);

        stage.setTitle("Q52 JavaFX Controls");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}