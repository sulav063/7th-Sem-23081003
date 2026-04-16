package q51;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage stage) {

        // ⭐ TITLE LABEL (YOUR INFO)
        Label title = new Label("Lab 4 - Sulav Adhikari - 23081003");

        // ⭐ FlowPane
        FlowPane flow = new FlowPane();
        flow.getChildren().addAll(
                new Button("Flow 1"),
                new Button("Flow 2"),
                new Button("Flow 3")
        );

        // ⭐ VBox (LEFT)
        VBox vbox = new VBox();
        vbox.getChildren().addAll(
                new Button("V1"),
                new Button("V2"),
                new Button("V3")
        );

        // ⭐ HBox (RIGHT)
        HBox hbox = new HBox();
        hbox.getChildren().addAll(
                new Button("H1"),
                new Button("H2"),
                new Button("H3")
        );

        // ⭐ GridPane (CENTER)
        GridPane grid = new GridPane();
        grid.add(new Button("G1"), 0, 0);
        grid.add(new Button("G2"), 1, 0);
        grid.add(new Button("G3"), 0, 1);

        // ⭐ Combine TITLE + FlowPane
        VBox topBox = new VBox();
        topBox.getChildren().addAll(title, flow);

        // ⭐ BorderPane (MAIN)
        BorderPane root = new BorderPane();

        root.setTop(topBox);     // title + flow
        root.setLeft(vbox);
        root.setRight(hbox);
        root.setCenter(grid);

        Scene scene = new Scene(root, 450, 300);

        stage.setTitle("Q51 JavaFX Layouts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}