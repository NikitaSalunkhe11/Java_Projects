
import lastpage.LastPage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.text.Font;

public class flowerpage extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image image1 = new Image("flowers\\anemone-coronaria.jpg");
        Image image2 = new Image("flowers\\asiatic-lily-red.jpg");
        Image image3 = new Image("flowers\\asiatic-lily-yellow.jpg");
        Image image4 = new Image("flowers\\calla-lily-red-balck_1.jpg");
        Image image5 = new Image("flowers\\lily.jpg");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);

        imageView1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(), image1, "anemone-coronaria", "299/-",
                    "1.Flowers are bright colored, eye-catching gorgeous.\n"
                            + "2. Daffodils bloom are a lovely addition to the spring garden.\n" + //
                            "3.Daffodil is spring-blooming perennial plants of the Amaryllidaceae family.\n"
                            + "4.Daffodil flowers have a trumpet-shaped structure set against a star-shaped background.\n"
                            + //
                            "5.The plant stem usually bears a solitary flower, but occasionally a cluster of flowers (umbel).\n"
                            + "6.Flowers may be single or double, grow singly on a stem or with multiple flowers per stem,\n and height varies from 6 to 20 inches.\n"
                            + //
                            "7.Daffodils, the flowers symbolizing friendship, are some of the most popular \nflowers exclusively due to their unmatched beauty.");
        }); // Call the method to open the LastPage

        imageView1.setFitWidth(320);
        imageView1.setFitHeight(320);

        imageView2.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(), image2, "asiatic-lily-red", "₹ 222/-",
                    "1.Flowers are bright colored, eye-catching gorgeous.\n"
                            + "2. Daffodils bloom are a lovely addition to the spring garden.\\n" +
                            "3.Daffodil is spring-blooming perennial plants of the Amaryllidaceae family.\n"
                            + "4.Daffodil flowers have a trumpet-shaped structure set against a star-shaped background.\n"
                            +
                            "5.The plant stem usually bears a solitary flower, but occasionally a cluster of flowers (umbel).\n");
        });

        imageView2.setFitWidth(320);
        imageView2.setFitHeight(320);

        imageView3.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(), image3, "asiatic-lily-yellow", "₹ 149/-", "Very Nice !!!!!!!");
        });
        imageView3.setFitWidth(320);
        imageView3.setFitHeight(320);

        imageView4.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(), image4, "calla-lily-red-balck", "₹ 99/-", "Very Nice !!!!!!!");

        });
        imageView4.setFitWidth(320);
        imageView4.setFitHeight(320);

        imageView5.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(), image5, "gloxinia", "₹ 179/-", "Very Nice !!!!!!!");

        });
        imageView5.setFitWidth(320);
        imageView5.setFitHeight(320);

        Label labelPlant = new Label("   Flowers");
        labelPlant.setStyle("-fx-font-size :70px;-fx-text-fill:Red");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setWidth(20);
        dropShadow.setHeight(20);
        labelPlant.setEffect(dropShadow);

        // HeadLine Plant Images 1
        Image i1 = new Image("Head\\hyacinth-pink-modified.png");

        ImageView Img1 = new ImageView(i1);
        Img1.setFitWidth(250);
        Img1.setFitHeight(250);
        Img1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            FloweringPlants flower = new FloweringPlants();
            try {
                flower.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Label lh1 = new Label(" Gardning Flowers");
        lh1.setFont(new Font("Verdana", 30));
        lh1.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        // HeadLine Plant Image 2
        Image i2 = new Image("Head\\lily-modified.png");
        ImageView Img2 = new ImageView(i2);
        Img2.setFitWidth(270);
        Img2.setFitHeight(270);
        Img2.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            FloweringPlants flower = new FloweringPlants();
            try {
                flower.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // Add Label to the HeadLine Plants
        Label lh2 = new Label(" Flowers By Season");
        lh2.setFont(new Font("Verdana", 30));
        lh2.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        // add HeadLine Plant Image 3
        Image i3 = new Image("Head\\Mask group.png");
        ImageView Img3 = new ImageView(i3);
        Img3.setFitWidth(265);
        Img3.setFitHeight(265);
        Img3.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            FloweringPlants flower = new FloweringPlants();
            try {
                flower.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // Label to HeadLine image 3
        Label lh3 = new Label(" Flowers By Location");
        lh3.setFont(new Font("Verdana", 30));
        lh3.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        Label lh4 = new Label(" Foliage FLowers");
        lh4.setFont(new Font("Verdana", 30));
        lh4.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        Label lh5 = new Label(" Flowering Plant");
        lh5.setFont(new Font("Verdana", 30));
        lh5.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        HBox hb1 = new HBox(labelPlant);
        GridPane grid = new GridPane();

        grid.addRow(2, lh1, lh2, lh3, lh4, lh5);
        Image i4 = new Image("Head\\new.png");
        ImageView Img4 = new ImageView(i4);
        Img4.setFitWidth(265);
        Img4.setFitHeight(265);
        Img4.setOnMouseClicked(event -> {

            // Create a new instance of the LastPage class and call its start method
            FloweringPlants flower = new FloweringPlants();
            try {
                flower.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Image i5 = new Image("Head\\rose-pink-plant-modified.png");
        ImageView Img5 = new ImageView(i5);
        Img5.setFitWidth(265);
        Img5.setFitHeight(265);
        Img5.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            FloweringPlants flower = new FloweringPlants();
            try {
                flower.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        grid.add(Img1, 0, 1);
        grid.add(Img2, 1, 1);
        grid.add(Img3, 2, 1);
        grid.add(Img4, 3, 1);
        grid.add(Img5, 4, 1);

        grid.add(imageView1, 0, 3);
        grid.add(imageView2, 1, 3);
        grid.add(imageView3, 2, 3);
        grid.add(imageView4, 3, 3);
        grid.add(imageView5, 4, 3);

        Label L1 = new Label("₹ 199/-");
        L1.setFont(new Font("Arial", 30));
        Label L2 = new Label("anemone-coronaria");
        // L2.setFont(new Font("verdana", 30));
        L2.setStyle("-fx-font-size :30px;-fx-text-fill:BLACK;-fx-font-weight: bold;");

        Label L3 = new Label("₹ 222/-");
        L3.setFont(new Font("Arial", 30));
        Label L4 = new Label("asiatic-lily-red");
        L4.setFont(new Font("Verdana", 30));
        L4.setStyle("-fx-font-size :30px;-fx-text-fill:BLACK;-fx-font-weight: bold;");

        Label L5 = new Label("₹ 212/-");
        L5.setFont(new Font("Arial", 30));
        Label L6 = new Label("asiatic-lily-yellow");
        L6.setFont(new Font("Verdana", 30));
        L6.setStyle("-fx-font-size :30px;-fx-text-fill:BLACK;-fx-font-weight: bold;");

        Label L7 = new Label("₹ 159/-");
        L7.setFont(new Font("Arial", 30));
        Label L8 = new Label("calla-lily-red-balck");
        L8.setFont(new Font("Verdana", 30));
        L8.setStyle("-fx-font-size :30px;-fx-text-fill:BLACK;-fx-font-weight: bold;");

        Label L9 = new Label("₹ 149/-");
        L9.setFont(new Font("Arial", 30));
        Label L10 = new Label("gloxinia");
        L10.setFont(new Font("Verdana", 30));
        L10.setStyle("-fx-font-size :30px;-fx-text-fill:BLACK;-fx-font-weight: bold;");

        grid.addRow(4, L1, L3, L5, L7, L9);
        grid.addRow(5, L2, L4, L6, L8, L10);
        // ScrollBar s = new ScrollBar();

        VBox vb = new VBox(hb1, grid);
        vb.setStyle(
                "-fx-width : 1100; -fx-background-image : url('red.jpg');-fx-background-repeat: stretch; -fx-background-size : 2000 2000;");
        // ScrollBar s = new ScrollBar();

        Scene scene = new Scene(vb, 5000, 1000);

        grid.setPadding(new Insets(30, 10, 10, 50));

        grid.setVgap(20);
        grid.setHgap(50);

        primaryStage.setTitle("MiniGrow");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
