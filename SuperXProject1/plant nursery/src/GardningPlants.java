import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import lastpage.LastPage;

public class GardningPlants extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image1 = new Image("new_plant\\nurserylive-compollution-killer-plants-pack.jpg");
        //Image image1 = new Image(p.getPlant_image());

        Image image2 = new Image("new_plant\\mini-succulent-garden.jpg");
        Image image3 = new Image("new_plant//ducklings-miniature-garden.jpg");
        Image image4 = new Image("new_plant\\plants-charming-christmas-celebrations.jpg");
        Image image5 = new Image("plants\\\\plant (3).jpg");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);

        imageView1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image1, "Pollution Killer Plants", "₹ 599/-","This pack contains best 5 air purifier plants + 5 colorful Pots.\r\n"+"Enjoy the beauty of plants that can also purify the air and keep your surrounding pollution-free.\r\n" + //
                    "Natural air purifie\r\n" + //
                    "Best indoor plants.\r\n" + //
                    "Easy to grow\r\n" + //
                    "About\r\n" + //
                    "You get 5 beautiful air purifier plants potted in colorful pots in a single pack.\r\n" + //
                    "Plants in this pack are very easy to care and require low maintenance.\r\n" + //
                    "Plants in this pack can be placed indoors on a location that receives indirect bright light.\r\n" + //
                    "These plants come in NASA air purifier list.");
        }); // Call the method to open the LastPage

        imageView1.setFitWidth(320);
        imageView1.setFitHeight(320);

        imageView2.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image2,"Mini Succulent Garden","₹ 1222/-","This pack contains 6 best succulent plants + 6 Colorful Pots.\r\n" + //
                    "\r\n" + //
                    "About\r\n" + //
                    "In this single pack you will get 6 mini succulents along with colorful pots.\r\n" + //
                    "They are the low maintenance plant.\r\n" + //
                    "Succulent plants are hard to kill and imparts beauty to your garden.\r\n" + //
                    "As they are small in size they acquire very little space.");
        }); 

        imageView2.setFitWidth(320);
        imageView2.setFitHeight(320);

        imageView3.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(primaryStage, image3,"Miniature Garden","₹ 699/-", "This miniature garden contains a Syngonium plant along with a ceramic pot,pebbles, stone sand, \r\n"+"garden toys and preserve moss.\r\n"+
            "This DIY product provides constituents separately to create your own miniature garden.\r\n"+
            "About\r\n"+
            "This miniature garden contains an attractive Syngonium plant along with a ceramic pot, pebbles,\r\n"+"stone sand, garden toys and preserve moss.\r\n"+
            "Its foliage attractive color will add up the beauty in your house along with its beautiful toys.\r\n"+
            "Syngonium has the ability to cleanse the air you breathe and act as anti-pollutant.\r\n"+
            "Syngonium does not require too much maintenance.\r\n"+
            "Syngonium can also grow in low light conditions.\r\n"+
            "Ceramic planters allow air movement which stimulates root growth and results in healthier plants.");
        }); 
        imageView3.setFitWidth(320);
        imageView3.setFitHeight(320);

        imageView4.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(primaryStage, image4, "Nikita", "133/-", "This miniature garden contains a Syngonium plant along with a ceramic pot,pebbles, stone sand, \\r\\n" + //
                    "\"+\"garden toys and preserve moss.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"This DIY product provides constituents separately to create your own miniature garden.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"About\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"This miniature garden contains an attractive Syngonium plant along with a ceramic pot, pebbles,\\r\\n" + //
                    "\"+\"stone sand, garden toys and preserve moss.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"Its foliage attractive color will add up the beauty in your house along with its beautiful toys.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"Syngonium has the ability to cleanse the air you breathe and act as anti-pollutant.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"Syngonium does not require too much maintenance.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"Syngonium can also grow in low light conditions.\\r\\n" + //
                    "\"+\r\n" + //
                    "            \"Ceramic planters allow air movement which stimulates root growth and results in healthier plants.");
        }); 
        imageView4.setFitWidth(320);
        imageView4.setFitHeight(320);

        imageView5.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(primaryStage, image1, "Charming Christmas Celebrations", STYLESHEET_MODENA, STYLESHEET_CASPIAN);
        }); 
        imageView5.setFitWidth(320);
        imageView5.setFitHeight(320);

        Label labelgardningPlant = new Label("  Gardning Plants");
        labelgardningPlant.setStyle("-fx-font-size :70px;-fx-text-fill:GREEN");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setWidth(20);
        dropShadow.setHeight(20);
        labelgardningPlant.setEffect(dropShadow);


       HBox hb1 = new HBox(labelgardningPlant);

        GridPane grid = new GridPane();

        /*grid.addRow(2, lh1, lh2, lh3,lh4,lh5);
        Image i4 = new Image("HeadingImage\\Bamboo Plant.jpeg-modified.png");

        ImageView Img4 = new ImageView(i4);
        Img4.setFitWidth(265);
        Img4.setFitHeight(265);

        Image i5 = new Image("HeadingImage\\n" + //
                "urserylive-g-miniature-rose-button-rose-pink-plant-modified.png");
        ImageView Img5 = new ImageView(i5);
        Img5.setFitWidth(265);
        Img5.setFitHeight(265);
        */
/* 
        grid.add(Img1, 0, 1);
        grid.add(Img2, 1, 1);
        grid.add(Img3, 2, 1);
        grid.add(Img4, 3, 1);
        grid.add(Img5, 4, 1);
      */  


        grid.add(imageView1,0, 3);
        grid.add(imageView2, 1, 3);
        grid.add(imageView3, 2, 3);
        grid.add(imageView4, 3, 3);
        grid.add(imageView5, 4, 3);

        Label L1 = new Label("₹ 599/-");
        L1.setFont(new Font("Arial", 30));
        Label L2 = new Label("Pollution Killer Plants");
        L2.setFont(new Font("verdana", 30));
        L2.setStyle("-fx-font-weight: bold;");

        Label L3 = new Label("₹ 1222/-");
        L3.setFont(new Font("Arial", 30));
        Label L4 = new Label("Mini Succulent");
        L4.setFont(new Font("Verdana", 30));
        L4.setStyle("-fx-font-weight: bold;");

        Label L5 = new Label("₹ 699/-");
        L5.setFont(new Font("Arial", 30));
        Label L6 = new Label("Miniature Garden");
        L6.setFont(new Font("Verdana", 30));
        L6.setStyle("-fx-font-weight: bold;");

        Label L7 = new Label("₹ 159/-");
        L7.setFont(new Font("Arial", 30));
        Label L8 = new Label("CharmingChristmas");
        L8.setFont(new Font("Verdana", 30));
        L8.setStyle("-fx-font-weight: bold;");

        Label L9 = new Label("₹ 149/-");
        L9.setFont(new Font("Arial", 30));
        Label L10 = new Label("Mogra");
        L10.setFont(new Font("Verdana", 30));
        L10.setStyle("-fx-font-weight: bold;");

        grid.addRow(4, L1, L3, L5, L7, L9);
        grid.addRow(5, L2, L4, L6, L8, L10);
        // ScrollBar s = new ScrollBar();

        VBox vb = new VBox(hb1,grid);
        vb.setStyle(
                "-fx-width : 1100; -fx-background-image : url('Back.jpeg');-fx-background-repeat: stretch; -fx-background-size : 2000 2000;");

        Scene scene = new Scene(vb, 5000, 1000);

        grid.setPadding(new Insets(5, 10, 10, 50));

        grid.setVgap(20);
        grid.setHgap(50);

        primaryStage.setTitle("MiniGrow");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
