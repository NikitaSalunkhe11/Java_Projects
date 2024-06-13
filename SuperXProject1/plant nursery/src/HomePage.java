import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

public class HomePage extends Application {
    private static final String[] imageUrls = {
        "images/1697967473861.jpg",
        "images/1697967521063.jpg",
        "images/1697967562056.jpg",
        "images/1697967599935.jpg"
    };
    private int currentImageIndex = 0;

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        ImageView imageView = new ImageView();
        root.getChildren().add(imageView);

        Timeline imageSlider = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            Image image = new Image(imageUrls[currentImageIndex]);
            imageView.setImage(image);
            imageView.setFitWidth(1000);
            imageView.setFitHeight(700);
            currentImageIndex = (currentImageIndex + 1) % imageUrls.length;
        }));
        imageSlider.setCycleCount(Timeline.INDEFINITE);
        imageSlider.play();

        VBox vbox1 = new VBox(imageView);
        vbox1.setAlignment(Pos.CENTER_LEFT);

        VBox vbox4 = new VBox();
        vbox4.setAlignment(Pos.CENTER_RIGHT);
        vbox4.setSpacing(20);

        VBox vbox5 = new VBox();
        vbox5.setAlignment(Pos.CENTER_RIGHT);
        vbox5.setSpacing(20);

        final String[] imgurls1 = {
            "./SquareImg/flower.jpg",
            "./SquareImg/fertilizer.jpg",
            "./SquareImg/pots.jpg"
        };

        final String[] imgurls2 = {
            "./SquareImg/showplant.jpg",
            "./SquareImg/seeds.jpg",
            "./SquareImg/acc.jpg"
        };

        Rectangle squareBox1 = createSquareBox(200, 200, imgurls1[0]);
        Rectangle squareBox2 = createSquareBox(200, 200, imgurls1[1]);
        Rectangle squareBox3 = createSquareBox(200, 200, imgurls1[2]);

        vbox4.getChildren().addAll(squareBox1, squareBox2, squareBox3);

        squareBox1.setOnMouseClicked(event -> {
            flowerpage gp = new flowerpage();
            try {
                gp.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Rectangle squareBox4 = createSquareBox(200, 200, imgurls2[0]);
        Rectangle squareBox5 = createSquareBox(200, 200, imgurls2[1]);
        Rectangle squareBox6 = createSquareBox(200, 200, imgurls2[2]);

        vbox5.getChildren().addAll(squareBox4, squareBox5, squareBox6);

        squareBox4.setOnMouseClicked(event -> {
            DesktopSiteWithImage dp = new DesktopSiteWithImage();
            try {
                dp.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        HBox hb = new HBox(200, vbox1, vbox4, vbox5);
        hb.setStyle("-fx-pref-width : 1550;-fx-background-image:url('SquareImg\\nature.jpg');-fx-background-position: center leftr;-fx-background-repeat: stretch;-fx-background-size: cover;");

        Button settingsButton = new Button("Settings");
        settingsButton.setStyle("-fx-background-color: gray;");
        settingsButton.setGraphic(new ImageView(new Image("file:./SquareImg/setting-icon.jpg")));

        HBox settingsBox = new HBox(settingsButton);
        settingsBox.setAlignment(Pos.TOP_LEFT);
        settingsBox.setPadding(new Insets(10, 0, 10, 10));
        settingsButton.setOnMouseClicked(event -> {
            NurseryApp nApp = new NurseryApp();
            try {
                nApp.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Button profileButton = new Button("Profile");
        profileButton.setStyle("-fx-background-color: gray; -fx-font-size: 20px;");
        HBox profileBox = new HBox(profileButton);
        profileBox.setAlignment(Pos.TOP_RIGHT);
        profileBox.setPadding(new Insets(10, 0, 10, 10));

        HBox navigationBar = createNavigationBar();
        VBox mainContent = new VBox(navigationBar, hb);
        mainContent.setSpacing(100);

        navigationBar.getChildren().add(0, settingsBox);

        BorderPane borderPane = new BorderPane(mainContent);
        BorderPane.setAlignment(mainContent, Pos.CENTER_LEFT);

        Insets topMargin = new Insets(80, 100, 0, 0);
        BorderPane.setMargin(mainContent, topMargin);

        Image topLeftImage = new Image("file:./SquareImg/setting.jpg");
        ImageView topLeftImageView = new ImageView(topLeftImage);

        topLeftImageView.setFitWidth(30);
        topLeftImageView.setFitHeight(30);
        Insets topMarginForTopLeft = new Insets(100, 50, 0, 0);
        BorderPane.setMargin(topLeftImageView, topMarginForTopLeft);

        BorderPane.setAlignment(topLeftImageView, Pos.TOP_LEFT);
        borderPane.getChildren().add(topLeftImageView);

        Scene scene = new Scene(borderPane, 5000, 1000);
        borderPane.setStyle("-fx-pref-width : 1550;-fx-background-image:url('./SquareImg/nature.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;-fx-background-size: cover;");

        primaryStage.setTitle("Home Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Rectangle createSquareBox(double width, double height, String imageUrl) {
        Rectangle squareBox = new Rectangle(width, height);
        Image image = new Image(imageUrl);
        ImagePattern imagePattern = new ImagePattern(image);
        squareBox.setFill(imagePattern);
        squareBox.setStroke(Color.GREEN);
        squareBox.setStrokeWidth(15);
        return squareBox;
    }

    private HBox createNavigationBar() {
        HBox navigationBar = new HBox(200);
        navigationBar.setStyle("-fx-pref-width : 2000;-fx-background-image:url('./SquareImg/nature.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;-fx-background-size: cover;");

        navigationBar.setAlignment(Pos.CENTER);
        navigationBar.setPrefWidth(500);

        HBox spacer = new HBox();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        ProfileCircle profileCircle = new ProfileCircle("c2ww.png");
        Label label = new Label("Profile");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        profileCircle.setOnMouseClicked(event -> getHostServices().showDocument("https://www.core2web.in/"));

        TextField searchField = new TextField("Search");
        searchField.setPrefWidth(500);
        HBox.setHgrow(profileCircle, Priority.ALWAYS);

        navigationBar.getChildren().addAll(spacer, searchField, profileCircle);

        return navigationBar;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class ProfileCircle extends StackPane {
    public ProfileCircle(String imageUrl) {
        Circle circle = new Circle(10);

        Image image = new Image("file:C:\\Users\\NIKITA\\Desktop\\SarthakFileJavafx\\plant nursery\\src\\SquareImg\\c2w1.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(10);
        imageView.setFitHeight(10);
        setAlignment(Pos.CENTER_RIGHT);
        getChildren().addAll(circle, imageView);
    }

    @Override
    public String toString() {
        return "ProfileCircle []";
    }
}
