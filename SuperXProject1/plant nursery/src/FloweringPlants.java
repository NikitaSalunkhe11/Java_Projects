import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import lastpage.LastPage;

public class FloweringPlants extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image1 = new Image("gardening_Flowers\\3-flowering-plants.jpg");
        Image image2 = new Image("gardening_Flowers\\3combo-pack.jpg");
        Image image3 = new Image("gardening_Flowers\\aromatic-plants.jpg");
        Image image4 = new Image("gardening_Flowers\\portulaca.jpg");
        Image image5 = new Image("gardening_Flowers\\rose-plants.jpg");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);

        imageView1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image1, "3-flowering-plants", "399/-","1.Flowers are bright colored, eye-catching gorgeous.\n" +"2. Daffodils bloom are a lovely addition to the spring garden.\n" + //
                    "3.Daffodil is spring-blooming perennial plants of the Amaryllidaceae family.\n" + "4.Daffodil flowers have a trumpet-shaped structure set against a star-shaped background.\n" + //
            "5.The plant stem usually bears a solitary flower, but occasionally a cluster of flowers (umbel).\n" +"6.Flowers may be single or double, grow singly on a stem or with multiple flowers per stem,\n and height varies from 6 to 20 inches.\n" + //
            "7.Daffodils, the flowers symbolizing friendship, are some of the most popular \nflowers exclusively due to their unmatched beauty.");
        }); // Call the method to open the LastPage

        imageView1.setFitWidth(320);
        imageView1.setFitHeight(320);

        imageView2.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image2,"3combo-pack","₹ 422/-","1.Flowers are bright colored, eye-catching gorgeous.\n" +"2. Daffodils bloom are a lovely addition to the spring garden.\n" + //
                    "3.Daffodil is spring-blooming perennial plants of the Amaryllidaceae family.\n" + "4.Daffodil flowers have a trumpet-shaped structure set against a star-shaped background.\n" + //
            "5.The plant stem usually bears a solitary flower, but occasionally a cluster of flowers (umbel).\n");
        }); 

        imageView2.setFitWidth(320);
        imageView2.setFitHeight(320);

        imageView3.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
           lastPage.LastPageMethod(new Stage(),image3,"aromatic-plants","₹ 149/-","1.Flowers may be single or double, grow singly on a stem or with multiple flowers per stem,\n" + //
                   " and height varies from 6 to 20 inches.\n" + //
                   "2.Daffodils, the flowers symbolizing friendship, are some of the most popular \\n" + //
                   "flowers exclusively due to their unmatched beauty");
        }); 
        imageView3.setFitWidth(320);
        imageView3.setFitHeight(320);

        imageView4.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
           lastPage.LastPageMethod(new Stage(),image4,"portulaca","₹ 99/-","1.Flowers are bright colored, eye-catching gorgeous.\n" + //
                   "2. Daffodils bloom are a lovely addition to the spring garden.\n" +"3.Daffodil is spring-blooming perennial plants of the Amaryllidaceae family\n" + //
                   "\" + \"4.Daffodil flowers have a trumpet-shaped structure set against a star-shaped background.\n" +
                   "5.The plant stem usually bears a solitary flower, but occasionally a cluster of flowers (umbel).\n" + 
                   "6.Flowers may be single or double, grow singly on a stem or with multiple flowers per stem,\n" + //
                   " and height varies from 6 to 20 inches.\n");
 
        }); 
        imageView4.setFitWidth(320);
        imageView4.setFitHeight(320);

        imageView5.setOnMouseClicked(event -> {
           
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image5,"hyacinth-pink","₹ 179/-","1.Flowers are bright colored, eye-catching gorgeous.\n" + "2. Daffodils bloom are a lovely addition to the spring garden.\n");
 
        }); 
        imageView5.setFitWidth(320);
        imageView5.setFitHeight(320);

        Label labelPlant = new Label("Gardning Flowers");
        labelPlant.setStyle("-fx-font-size :40px;-fx-text-fill:RED");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setWidth(20);
        dropShadow.setHeight(20);
        labelPlant.setEffect(dropShadow);

        GridPane grid = new GridPane();
        grid.add(labelPlant,0,0);

        grid.add(imageView1,0, 3);
        grid.add(imageView2, 1, 3);
        grid.add(imageView3, 2, 3);
        grid.add(imageView4, 3, 3);
        grid.add(imageView5, 4, 3);

        Label L1 = new Label("₹ 199/-");
        L1.setFont(new Font("Arial", 30));
        Label L2 = new Label("3-flowering-plants");
        L2.setFont(new Font("verdana", 30));

        Label L3 = new Label("₹ 222/-");
        L3.setFont(new Font("Arial", 30));
        Label L4 = new Label("3combo-pack");
        L4.setFont(new Font("Verdana", 30));

        Label L5 = new Label("₹ 212/-");
        L5.setFont(new Font("Arial", 30));
        Label L6 = new Label("aromatic-plants");
        L6.setFont(new Font("Verdana", 30));

        Label L7 = new Label("₹ 159/-");
        L7.setFont(new Font("Arial", 30));
        Label L8 = new Label("portulaca");
        L8.setFont(new Font("Verdana", 30));

        Label L9 = new Label("₹ 149/-");
        L9.setFont(new Font("Arial", 30));
        Label L10 = new Label("hyacinth-pink");
        L10.setFont(new Font("Verdana", 30));

        grid.addRow(4, L1, L3, L5, L7, L9);
        grid.addRow(5, L2, L4, L6, L8, L10);
        

        VBox vb = new VBox(grid);
        vb.setStyle(
                "-fx-width : 1100; -fx-background-image : url('red.jpg');-fx-background-repeat: stretch; -fx-background-size : 2000 2000;");

               
        Scene scene = new Scene(vb, 5000, 1000);

        grid.setPadding(new Insets(30, 10, 10, 50));

        grid.setVgap(20);
        grid.setHgap(50);

        primaryStage.setTitle("MiniGrow");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
