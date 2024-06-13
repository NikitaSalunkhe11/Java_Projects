package lastpage;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LastPage extends Application {

        public void LastPageMethod(Stage primaryStage, Image image1, String plant_name, String plant_price,
                        String plant_description) {

                // ImageView image = new ImageView(image1);
                ImageView imageView = new ImageView(image1);
                imageView.setFitWidth(500);
                imageView.setFitHeight(700);

                // Plants
                ObservableList<String> plants = FXCollections.observableArrayList(
                                "Plants",
                                "Summer",
                                "Rainy",
                                "Winter");
                ComboBox<String> plant = new ComboBox<>(plants);
                plant.setValue("Plants");
                plant.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FBFFFE;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Seeds
                ObservableList<String> Seeds = FXCollections.observableArrayList(
                                "Seeds",
                                "Summer",
                                "Rainy",
                                "Winter");
                ComboBox<String> seed = new ComboBox<>(Seeds);
                seed.setValue("Seeds");
                seed.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FBFFFE;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Bulbs
                ObservableList<String> Bulbs = FXCollections.observableArrayList(
                                "Bulbs",
                                "Summer",
                                "Rainy",
                                "Winter");
                ComboBox<String> bulb = new ComboBox<>(Bulbs);
                bulb.setValue("Bulbs");
                bulb.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FBFFFE;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");

                // Accessories
                ObservableList<String> Accessories = FXCollections.observableArrayList(
                                "Accessories",
                                "Gardning Tools");
                ComboBox<String> access = new ComboBox<>(Accessories);
                access.setValue("Accessories");
                access.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFFFFF;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Gardening
                ObservableList<String> Gardening = FXCollections.observableArrayList(
                                "Gardening",
                                "Gardning Tools");
                ComboBox<String> garden = new ComboBox<>(Gardening);
                garden.setValue("Gardening");
                garden.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFFFFF;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Planters
                ObservableList<String> Planters = FXCollections.observableArrayList(
                                "Planters",
                                "planters Accessories");
                ComboBox<String> planter = new ComboBox<>(Planters);
                planter.setValue("Planters");
                planter.setStyle(
                                "-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFFFFF;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Soil & fertilizer
                ObservableList<String> Soil = FXCollections.observableArrayList(
                                "Soil & Fertilizer",
                                "soil",
                                "fertilizer",
                                "packed Soil & fertilizer");
                ComboBox<String> soil = new ComboBox<>(Soil);
                soil.setValue("Soil & Fertilizer");
                soil.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFFFFF;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // Gifts
                ObservableList<String> Gifts = FXCollections.observableArrayList(
                                "Gifts",
                                "Gifts for Festivals",
                                "Gifts for Loved ones",
                                "Gifts for Occasions",
                                "Gifts for Special Day");
                ComboBox<String> gift = new ComboBox<>(Gifts);
                gift.setValue("Gifts");
                gift.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFFFFF;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");
                // pebbles
                ObservableList<String> Pebbles = FXCollections.observableArrayList(
                                "Pebbles",
                                "Pebbles By Colour", "pebbles by Size");
                ComboBox<String> pebbles = new ComboBox<>(Pebbles);
                pebbles.setValue("Pebbles");
                pebbles.setStyle(
                                "-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFA500;-fx-background-color: d7f9c4;-fx-font-weight:BOLD;");

                HBox hb1 = new HBox(20, plant, seed, bulb, access, garden, planter, soil, gift, pebbles);
                hb1.setAlignment(Pos.TOP_CENTER);

                Label label = new Label(plant_name);
                label.setStyle("-fx-font-size: 70px;-fx-text-fill:RED;-fx-font-weight:BOLD;");

                Label Des = new Label(STYLESHEET_CASPIAN);
                Des.setStyle("-fx-font-size: 70px;-fx-text-fill:RED;-fx-font-weight:BOLD;");

                Label labe2 = new Label(plant_price);
                labe2.setStyle("-fx-font-size: 50px;-fx-text-fill:RED;-fx-font-weight:Arial;");
                DropShadow dropShadow = new DropShadow();
                dropShadow.setColor(Color.BROWN);
                dropShadow.setWidth(20);
                dropShadow.setHeight(20);
                label.setEffect(dropShadow);
                ObservableList<String> options = FXCollections.observableArrayList(
                                "1",
                                "2",
                                "3",
                                "4",
                                "5",
                                "6",
                                "7",
                                "8",
                                "9");

                // Create a ComboBox and populate it with the list of options
                ComboBox<String> comboBox = new ComboBox<>(options);
                Button b1 = new Button("Add To Cart");
                b1.setStyle("-fx-min-width: 500px; -fx-min-height: 50px;-fx-background-color: #FFA500;-fx-font-weight:BOLD;");

                Label desName = new Label("Description");
                desName.setStyle("-fx-font-size :50px;-fx-text-fill:BLACK;-fx-font-weight:BOLD;");

                Label description = new Label(plant_description);
                description.setStyle("-fx-font-size :20px;-fx-text-fill:BLACK;-fx-font-weight:Arial;");
                // Set a default selection
                comboBox.setValue("Quantity");
                comboBox.setMaxSize(800, 45);
                comboBox.setStyle(
                                "-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FBFFFE;-fx-font-weight:BOLD;");

                Button butn1 = new Button("Place Order");
                butn1.setStyle("-fx-min-width: 50px; -fx-min-height: 50px;-fx-text-fill: #FFA500;-fx-font-weight:BOLD;");

                butn1.setOnMouseClicked(event -> {
                        RateUs gp1 = new RateUs();
                        try {
                                gp1.start(new Stage());
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                });

                HBox newHBox = new HBox(20, comboBox, b1);
                // newHBox.setAlignment(Pos.TOP_LEFT);;

                VBox vb1 = new VBox(20, label, labe2, newHBox, desName, description, butn1);
                vb1.setPadding(new Insets(90, 50, 20, 50));
                // vb1.setAlignment(Pos.TOP_LEFT);

                HBox hb = new HBox(200, imageView, vb1);
                hb.setPadding(new Insets(50, 20, 20, 50));
                // hb.setAlignment(Pos.BOTTOM_LEFT);
                /*
                 * ScrollBar sc = new ScrollBar();
                 * sc.setMin(0);
                 * sc.setMax(100);
                 * sc.setVal
                 */
                VBox root = new VBox(20, hb1, hb);

                root.setStyle("-fx-width : 1100; -fx-background-image : url('Back.jpeg');-fx-background-repeat: stretch; -fx-background-size : 2000 2000;");

                // Scene scene = new Scene(root, 5000, 1000);
                // primaryStage.setScene(scene);
                // primaryStage.show();
                // throw new UnsupportedOperationException("Unimplemented method 'start'");
                Scene scene = new Scene(root, 5000, 1000);
                primaryStage.setScene(scene);
                primaryStage.show();

        }

        @Override
        public void start(Stage primaryStage) throws Exception {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'start'");
        }
}
