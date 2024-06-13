package lastpage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RateUs extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Image backgroundImage = new Image("file:RateYs.jpg"); // Replace with the
        // path to your image

        // Create an ImageView to display the background image
        // ImageView backgroundImageView = new ImageView(backgroundImage);

        // VBox content = new VBox(10);
        // content.setAlignment(Pos.CENTER);
        // content.setStyle("-fx-pref-width : 1550;-fx-background-image:
        // url('RateYs.jpg');-fx-background-position: center
        // center;-fx-background-repeat: stretch;");

        // content.getChildren().addAll(new Label("Click the button to show the
        // alert:"));

        // Add the background image and content to the StackPane
        // root.getChildren().addAll(backgroundImageView, content);

        // Set the dimensions to match the size of your application window
        // backgroundImageView.setFitWidth(primaryStage.getWidth());
        // backgroundImageView.setFitHeight(primaryStage.getHeight());
        primaryStage.setTitle("Star Rating App");

        Image backgroundImage = new Image("file:./lastpage/Usss.jpg"); // Replace with the path to your image

        ImageView backgroundImageView = new ImageView(backgroundImage);

        // Set the dimensions to match the size of your application window
        backgroundImageView.setFitWidth(primaryStage.getWidth());
        backgroundImageView.setFitHeight(primaryStage.getHeight());

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle(
                "-fx-pref-width : 5000;-fx-background-image: url('./lastpage/Usss.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;");

        Label order = new Label("Your order confirmed successfully !! Visit Again :)");
        order.setFont(Font.font(20));

        // root.getChildren().add(backgroundImageView);

        Label ratingLabel = new Label("Rate us:");
        ratingLabel.setFont(Font.font(30));

        HBox starsBox = createStarRating();

        root.getChildren().addAll(backgroundImageView, order, ratingLabel, starsBox);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createStarRating() {
        HBox starsBox = new HBox(10);
        starsBox.setAlignment(Pos.CENTER);

        for (int i = 1; i <= 5; i++) {
            ToggleButton star = new ToggleButton(String.valueOf(i));
            star.getStyleClass().add("star-button");

            int rating = i;

            star.setOnAction(event -> {
                showRatingDialog(rating);
                // You can store the rating in your database or perform other actions here
            });

            starsBox.getChildren().add(star);
        }

        return starsBox;
    }

    private void showRatingDialog(int rating) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Thank you for your rating!");
        alert.setHeaderText(null);
        alert.setContentText("You rated us " + rating + " stars.");
        alert.showAndWait();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
