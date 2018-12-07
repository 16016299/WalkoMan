package WalkoMan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Launch extends Application {
    BorderPane root = new BorderPane();
    GridPane grid = new GridPane();
    HBox hBox = new HBox();
    Man man = new Man(2, 2);
    Text space;
    Text avatar;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(25,25,25,25));

        getMap();

        hBox.setPadding(new Insets(15, 20, 15, 20));
        hBox.setSpacing(10);
        Button upButton = new Button("up");
        Button downButton = new Button("down");
        Button leftButton = new Button("left");
        Button rightButton = new Button("right");

        hBox.getChildren().addAll(upButton, downButton, leftButton, rightButton);

        upButton.setOnAction(Event ->
        {
            man.move("up");
            GridPane.setRowIndex(man, man.getX());
        });

        downButton.setOnAction(Event ->
        {
            man.move("down");
        });

        leftButton.setOnAction(Event ->
        {
            man.move("left");
        });

        rightButton.setOnAction(Event ->
        {
            man.move("right");
        });



        root.setCenter(grid);
        root.setBottom(hBox);
        Scene scene = new Scene(root, 500, 500);




        //grid.setGridLinesVisible(true);


        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void getMap(){
        int avatarX = man.getX();
        int avatarY = man.getY();

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (x == avatarX && y == avatarY) {
                    avatar = new Text("@");
                    grid.add(avatar, x, y);
                } else {
                    space = new Text("#");
                    grid.add(space, x, y);
                }
            }
        }

    }
}
