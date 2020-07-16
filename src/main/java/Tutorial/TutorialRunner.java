package Tutorial;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TutorialRunner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            Pane pane = new Pane();
            Scene scene = new Scene(pane, 800, 800);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Jozefina");
            primaryStage.show();
            primaryStage.setResizable(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
