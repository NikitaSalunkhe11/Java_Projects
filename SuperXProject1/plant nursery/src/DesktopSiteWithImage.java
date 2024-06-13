
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


public class DesktopSiteWithImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create an Image object with the path to your image file
       // Product p = (Product) Database.connectDB();

       // System.out.println(p.getPlant_image());
       
      //  String imageUrl = p.getPlant_image(); Button clickMeButton = new Button("Click Me");

        // Set an action event handler for the button
  /*     Button clickMeButton = new Button();
        clickMeButton.setOnAction(event -> {
            System.out.println("Button Clicked!");
            // You can put your code here to respond to the button click
        });

        StackPane root = new StackPane();
        root.getChildren().add(clickMeButton);
*/
       // Scene scene = new Scene(root, 300, 200);


        Image image1 = new Image("plants\\plant (3).jpg");
        //Image image1 = new Image(p.getPlant_image());

        Image image2 = new Image("plants\\plant (6).jpg");
        Image image3 = new Image("plants\\plant02.jpg");
        Image image4 = new Image("new_plant\\plants-buxus-bonsai-plant.jpg");
        Image image5 = new Image("new_plant\\nurserylive-plants-syngonium-cream-allusion-syngonium-cream-pink-veins-plant.jpg");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);

        imageView1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image1, "Mogra,Arabian Jasmine", "₹ 199/-","Flowers make intimate connections they increase our connectivity with family and friends.\r\n"+
            " Mogra plant is famously known as Jasmine flower.\r\n"+ "//it is one of the most beautiful and fragrant among all flowering plants in Asia.\r\n" + //
                    "What makes it special:\r\n" + //
                    "One of the popular fragrant flowering plant.\r\n" + //
                    "Provide year-round flowering.\r\n" + //
                    "Very easy to grow and care.\r\n" + //
                    "Perfect plant for outdoor garden and sunny balcony.\r\n" + //
                    "Sr\tItem name\r\n" + //
                    "1\tJasminum sambac, Mogra, Arabian Jasmine - Plant\r\n" + //
                    "2\t5 inch (13 cm) Grower Round Plastic Pot (Black)\r\n" + //
                    "Jasminum sambac belongs to the family Oleaceae.");
        }); // Call the method to open the LastPage

        imageView1.setFitWidth(320);
        imageView1.setFitHeight(320);

        imageView2.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image2,"Insulin Plant, Costus igneus","₹ 222/-","Costus igneus, Insulin plant is an herbal cure for diabetes \r\n"+"hence commonly called as an insulin plant.\r\n" + //
                    "What makes it special:\r\n" + //
                    "One of the best herbal (Antidiabetic) plant.\r\n" + //
                    "Low maintenance plant.\r\n" + //
                    "Perfect plant for outdoor garden.\r\n" + //
                    "Sr\tItem name\r\n" + //
                    "1\tInsulin Plant, Costus igneus - Plant\r\n" + //
                    "2\t5 inch (13 cm) Grower Round Plastic Pot (Black)\r\n" + //
                    "Costus igneus Nak and Costus pictus D. Don, commonly known as Insulin plant\r\n"+"it is a member of Costaceae and a newly introduced plant in India from South and Central America.");
        }); 

        imageView2.setFitWidth(320);
        imageView2.setFitHeight(320);

        imageView3.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(new Stage(),image3,"Ficus pumila - Plant","₹ 259/-","The creeping fig is also known as the climbing fig.\r\n"+"It is also grown as an ornamental house plant.\r\n"+ //
            "What makes it special:\r\n"+
            "One of the best ornamental house plant.\r\n"+
            "The eye catching heart shaped leaves on the ficus pumila.\r\n"+
            "You would like to be more creative with this ficus pumila.\r\n"+
            "Ficus plant is very easy to grow and maintain.\r\n"+
            "Sr\tItem name\t\n"+
            "1\tCreeping fig Plant, Ficus pumila - Plant\r\n"+
            "2\t5 inch (13 cm) Grower Round Plastic Pot (Black)\r\n"+
            "Interesting fact: Creeping fig have heart-shaped glossy leaves and can quickly scramble up the side of a wallFicus.\r\n"+"Ficus pumila is a woody evergreen liana.");
        }); 
        imageView3.setFitWidth(320);
        imageView3.setFitHeight(320);

        imageView4.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(primaryStage, image4, "Buxus Bonsai - Plant", "₹ 2000/-","Bonsai is closely resembling circumstances in nature.\r\n"+"These styles are open to personal interpretation and creativity of nature.\r\n" + //
                    "What makes it special:\r\n" + //
                    "A Bonsai tree is a replication of nature.\r\n" + //
                    "Enhance the aesthetic appeal.\r\n" + //
                    "A tree which is planted in a shallow container.\r\n" + //
                    "Best for both indoor and outdoor.\r\n" + //
                    "Boxwood is a very hardy plant and grows rapidly as well.\r\n"+ "This is mostly used as an ornamental plant and is grown and shaped into a variety of designs.\r\n"+ "There are more than 70 species of boxwood.\r\n"+"In nature, the boxwood often grows with twisted trunks and branches.\r\n" + //
                    "\r\n");
        }); 
        imageView4.setFitWidth(320);
        imageView4.setFitHeight(320);

        imageView5.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            LastPage lastPage = new LastPage();
            lastPage.LastPageMethod(primaryStage, image5," Syngonium Cream", "₹ 169/-", "Syngonium is a great looking, elegant and versatile houseplant which needs only modest care.\r\n"+"Its foliage attractive color will add up the beauty in your house and have the ability to cleanse the air you breathe.\r\n" + //
                    "What makes it special:\r\n" + //
                    "NASA recommended air purifier plant.\r\n" + //
                    "Best for AC rooms, office desk.\r\n" + //
                    "Best indoor plant for low light condition.\r\n" + //
                    "Low maintenance plant.\r\n" + //
                    "Attractive foliage plant.\r\n" + //
                    "1. Details for Plant in Black Grower Pot -\r\n" + //
                    "\r\n" + //
                    "Syngonium Cream allusion (Pink veins) Plant in 4 inch (10 cm) Black Pot");
        }); 
        imageView5.setFitWidth(320);
        imageView5.setFitHeight(320);

        Label labelPlant = new Label("  Plants");
        labelPlant.setStyle("-fx-font-size :70px;-fx-text-fill:GREEN");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setWidth(20);
        dropShadow.setHeight(20);
        labelPlant.setEffect(dropShadow);

        // HeadLine Plant Images 1
        Image i1 = new Image("HeadingImage\\Gardning Plants-fotor-20231021194544.png");

        ImageView Img1 = new ImageView(i1);
        Img1.setFitWidth(250);
        Img1.setFitHeight(250);

        Img1.setOnMouseClicked(event -> {
            // Create a new instance of the LastPage class and call its start method
            GardningPlants gp=new GardningPlants();
            try {
                gp.start(new Stage());
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }); 

        // HeadLine Plant Image 2
        Image i2 = new Image("HeadingImage\\new.png");

        ImageView Img2 = new ImageView(i2);
        Img2.setFitWidth(270);
        Img2.setFitHeight(270);

        Img2.setOnMouseClicked(event ->{
            PlantBySeason gp1=new PlantBySeason();
            try{
                gp1.start(new Stage());
            }catch(Exception e){
                e.printStackTrace();
            }
        });

        Label lh1 = new Label("  Gardning Plants");
        lh1.setFont(new Font("Verdana", 30));
        lh1.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        // Add Label to the HeadLine Plants
        Label lh2 = new Label("  Plant By Season");
        lh2.setFont(new Font("Verdana", 30));
        lh2.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        // add HeadLine Plant Image 3
        Image i3 = new Image("HeadingImage\\Mask group.png");

        ImageView Img3 = new ImageView(i3);
        Img3.setFitWidth(265);
        Img3.setFitHeight(265);
        // Label to HeadLine image 3
        Label lh3 = new Label("  Plant By Location");
        lh3.setFont(new Font("Verdana", 30));
        lh3.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");

        Label lh4 = new Label("  Foliage Plant");
        lh4.setFont(new Font("Verdana", 30));
        lh4.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");
        
        Label lh5 = new Label("  FLowering Plant");
        lh5.setFont(new Font("Verdana", 30));
        lh5.setStyle("-fx-font-size :30px;-fx-text-fill:RED;-fx-font-weight: bold;");


        HBox hb1 = new HBox(labelPlant);

        GridPane grid = new GridPane();

        grid.addRow(2, lh1, lh2, lh3,lh4,lh5);
        Image i4 = new Image("HeadingImage\\Bamboo Plant.jpeg-modified.png");

        ImageView Img4 = new ImageView(i4);
        Img4.setFitWidth(265);
        Img4.setFitHeight(265);

        Image i5 = new Image("HeadingImage\\n" + //
                "urserylive-g-miniature-rose-button-rose-pink-plant-modified.png");
        ImageView Img5 = new ImageView(i5);
        Img5.setFitWidth(265);
        Img5.setFitHeight(265);
        

        grid.add(Img1, 0, 1);
        grid.add(Img2, 1, 1);
        grid.add(Img3, 2, 1);
        grid.add(Img4, 3, 1);
        grid.add(Img5, 4, 1);
        


        grid.add(imageView1,0, 3);
        grid.add(imageView2, 1, 3);
        grid.add(imageView3, 2, 3);
        grid.add(imageView4, 3, 3);
        grid.add(imageView5, 4, 3);

        Label L1 = new Label("₹ 199/-");
        L1.setFont(new Font("Arial", 30));
        Label L2 = new Label("Mogra");
        L2.setFont(new Font("verdana", 30));
        L2.setStyle("-fx-font-weight: bold;");

        Label L3 = new Label("₹ 222/-");
        L3.setFont(new Font("Arial", 30));
        Label L4 = new Label("Insulin Plant");
        L4.setFont(new Font("Verdana", 30));
        L4.setStyle("-fx-font-weight: bold;");

        Label L5 = new Label("₹ 259/-");
        L5.setFont(new Font("Arial", 30));
        Label L6 = new Label("Ficus pumila");
        L6.setFont(new Font("Verdana", 30));
        L6.setStyle("-fx-font-weight: bold;");

        Label L7 = new Label("₹ 2000/-");
        L7.setFont(new Font("Arial", 30));
        Label L8 = new Label("Buxus Bonsai-Plant");
        L8.setFont(new Font("Verdana", 30));
        L8.setStyle("-fx-font-weight: bold;");

        Label L9 = new Label("₹ 169/-");
        L9.setFont(new Font("Arial", 30));
        Label L10 = new Label("Syngonium Cream");
        L10.setFont(new Font("Verdana", 30));
        L10.setStyle("-fx-font-weight: bold;");

        grid.addRow(4, L1, L3, L5, L7, L9);
        grid.addRow(5, L2, L4, L6, L8, L10);

        VBox vb = new VBox(hb1, grid);
        vb.setStyle("-fx-width : 1100; -fx-background-image : url('Back.jpeg');-fx-background-repeat: stretch; -fx-background-size : 2000 2000;");


        Scene scene = new Scene(vb, 5000, 1000);

        grid.setPadding(new Insets(30, 10, 10, 50));

        grid.setVgap(20);
        grid.setHgap(50);

        primaryStage.setTitle("MiniGrow");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
