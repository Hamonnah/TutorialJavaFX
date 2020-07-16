package Tutorial;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TutorialRunner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // stage > scene > container > node
           /*Pane pane = new Pane();
            Scene scene = new Scene(pane, 800, 800);*/

            /*Label label1 = new Label("Hello");
            Label label2 = new Label("World");

            label1.setStyle("-fx-border-color: black; -fx-font-size: 30;");
            label2.setStyle("-fx-border-color: black; -fx-font-size: 30;");

            gridPane.addRow(0, label1, label2);
            gridPane.setHgap(10);
            gridPane.setAlignment(Pos.CENTER);*/

            ImageView whitePiece = new ImageView();
            whitePiece.setImage(image);
            pane.getChildren().add(whitePiece);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Jozefina");
            primaryStage.show();
            primaryStage.setResizable(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*GridPane gridPane = new GridPane();
    Scene scene = new Scene(gridPane, 400, 400);*/

    Image image = new Image("file:resources/white-normal.png");

    StackPane pane = new StackPane();
    Scene scene = new Scene(pane, 500, 500);

    public static void main(String[] args) {
        launch(args);
    }

}
