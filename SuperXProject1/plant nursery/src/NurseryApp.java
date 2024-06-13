import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NurseryApp extends Application {
        HBox hbox;
        VBox vb1, vb2, vb3, vb4, vb5;

        @Override
        public void start(Stage primaryStage) {

                hbox = new HBox();

                vb1 = new VBox();

                vb2 = new VBox();

                // g Image image = new Image("file:/path/to/your/profile_logo.png");

                Button b1 = new Button("My Profile");
                b1.setPrefSize(300, 40);
                b1.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white; -fx-background-radius: 30; -fx-min-width: 300px; -fx-min-height: 40px; -fx-max-width: 100px; -fx-max-height: 100px;-fx-text-fill: darkslategray;");
                Button b2 = new Button("Privicy Policy");
                b2.setPrefSize(300, 40);
                b2.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white; -fx-background-radius: 30; -fx-min-width: 300px; -fx-min-height: 20px; -fx-max-width: 100px; -fx-max-height: 100px;-fx-text-fill: darkslategray;");
                Button b3 = new Button("Refund Policy");
                b3.setPrefSize(300, 40);
                b3.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white; -fx-background-radius: 30; -fx-min-width: 300px; -fx-min-height: 30px; -fx-max-width: 100px; -fx-max-height: 100px;-fx-text-fill: darkslategray;");
                Button b6 = new Button("About US");
                b6.setPrefSize(300, 40);
                b6.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white; -fx-background-radius: 30; -fx-min-width: 300px; -fx-min-height: 30px; -fx-max-width: 100px; -fx-max-height: 100px;-fx-text-fill: darkslategray;");

                vb1 = new VBox(30, b1, b2, b3, b6);
                vb1.setPrefWidth(300);
                vb1.setAlignment(Pos.TOP_LEFT);
                // ************************************************************************************************************My
                // profile */
                Image image2 = new Image(
                                "png-transparent-user-profile-computer-icons-login-user-avatars-thumbnail.png");
                ImageView imageView2 = new ImageView(image2);
                HBox hb1 = new HBox();
                Label label2 = new Label("Profile");
                label2.setFont(Font.font(30));
                Button b5 = new Button("Edit");
                b5.setPrefSize(100, 30);
                hb1 = new HBox(50, label2, b5);
                hb1.setAlignment(Pos.TOP_CENTER);
                HBox hb2 = new HBox();
                Label label3 = new Label("Name : ");
                label3.setFont(Font.font(20));
                Label lable5 = new Label("Rushabh");
                lable5.setFont(Font.font(20));
                hb2 = new HBox(label3, lable5);
                hb2.setAlignment(Pos.TOP_CENTER);
                HBox hb3 = new HBox();
                Label label4 = new Label("E-mail : ");
                label4.setFont(Font.font(20));
                Label lable6 = new Label("rush@gmail.com");
                lable6.setFont(Font.font(20));
                hb3 = new HBox(label4, lable6);
                hb3.setAlignment(Pos.TOP_CENTER);
                Button b4 = new Button("Delete Account");
                b4.setPrefSize(300, 30);

                b4.setAlignment(Pos.BOTTOM_CENTER);
                vb2 = new VBox(20, imageView2, hb1, hb2, hb3, b4);
                vb2.setAlignment(Pos.TOP_CENTER);
                imageView2.setFitWidth(200);
                imageView2.setFitHeight(200);
                vb2.setStyle("-fx-pref-width : 1550;-fx-background-image: url('back.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;");
                // vb2.setStyle(
                // "-fx-width : 1100; -fx-background-image :
                // url('Back.jpeg');-fx-background-repeat: stretch; -fx-background-size : 2000
                // 2000;");
                // ******************************************************************************************************
                // Privicy ****** */
                vb3 = new VBox();
                Label lable7 = new Label("❀   Privacy Policy");

                lable7.setFont(Font.font(30));
                lable7.setStyle("-fx-text-fill: orange;");
                Label lable8 = new Label(
                                "This privacy policy sets out how Nursery uses and protects any information that you give Nurserylive when you use this website.\r\n"
                                                + "\r\n"
                                                + "Nurserylive is committed to ensuring that your privacy is protected. Should we ask you to provide certain information by which you can be identified when using this website, then you can be assured that it will only be used in accordance with this privacy statement.\r\n"
                                                + //
                                                "\r\n"
                                                + "Nurserylive may change this policy from time to time by updating this page. You should check this page from time to time to ensure that you are happy with any changes. This policy is effective from 1-Octomber-2023.");
                lable8.setLineSpacing(-5);
                Label lable9 = new Label("❀   What we Collect");
                lable9.setFont(Font.font(30));
                lable9.setStyle("-fx-text-fill:  orange;");
                Label lable10 = new Label(" We may collect the following information:\r\n" + //
                                "\r\n" + //
                                "•  name and job title\r\n" + //
                                "•  contact information including email address\r\n" + //
                                "•  demographic information such as postcode, preferences, and interests\r\n" + //
                                "•  other information relevant to customer surveys and/or offers");
                Label lable11 = new Label("❀   What we do with the information we gather");
                lable11.setFont(Font.font(30));
                lable11.setStyle("-fx-text-fill:  orange;");
                Label lable12 = new Label(
                                "We require this information to understand your needs and provide you with a better service, and in particular for the following reasons:\r\n"
                                                + //
                                                "\r\n" + //
                                                "Internal record keeping.\r\n" + //
                                                "\r\n" + //
                                                "We may use the information to improve our products and services.\r\n" + //
                                                "\r\n" + //
                                                "We may periodically send promotional emails about new products, special offers or other information which we think you may find interesting using the email address which you have provided.\r\n"
                                                + //
                                                "\r\n" + //
                                                "From time to time, we may also use your information to contact you for market research purposes. We may contact you by email, phone, fax or mail. We may use the information to customize the website according to your interests.");
                lable12.setLineSpacing(-2);
                Label lable13 = new Label("❀  Security");
                lable13.setFont(Font.font(30));
                lable13.setStyle("-fx-text-fill: orange;");
                Label lable14 = new Label("We are committed to ensuring that your information is secure.\r\n" + //
                                "In order to prevent unauthorized access or disclosure, we have put in place suitable physical,\r\n"
                                + "electronic and managerial procedures to safeguard and secure the information we collect online.");
                lable14.setLineSpacing(0);
                vb3 = new VBox(20, lable7, lable8, lable9, lable10, lable11, lable12, lable13, lable14);
                vb3.setStyle("-fx-pref-width : 1550;-fx-background-image: url('RUss.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;");

                // *********************************************************************************************************************Refund
                // Policy */
                vb4 = new VBox();
                Label lable15 = new Label("❀  Refund Policy");
                lable15.setFont(Font.font(35));
                lable15.setStyle("-fx-text-fill: orange;");
                Label lable16 = new Label("Orders delivered & accepted by the customer cannot be refunded.\r\n" + //
                                "\r\n" + //
                                "In case you feel the order is not as per specification, please contact our customer care team \r\n"
                                + "\r\n" +
                                " immediately in 24hrs.");
                lable16.setLineSpacing(-7);
                Label lable17 = new Label("❀  Cancellation Policy");

                lable17.setFont(Font.font(30));
                lable17.setStyle("-fx-text-fill: orange;");

                Label lable18 = new Label(
                                "   Nurserylive believes in helping its customers as far as possible and has, therefore, a liberal cancellation policy. Under this policy:\r\n"
                                                + //
                                                "\r\n" + //
                                                "  Cancellations will be considered only if the request is made within 24 hours of placing an order.\r\n"
                                                + "\r\n"
                                                + " However, the cancellation request will not be entertained if the orders have been communicated to the vendors/merchants and \r\n"
                                                + "\r\n" + "they have initiated the process of shipping them. \r\n" + //
                                                "\r\n" + //
                                                "   There is no cancellation of orders placed under the Same Day Delivery category. \r\n"
                                                + //
                                                "\r\n" + //
                                                "    No cancellations are entertained for those products that the Nurserylive marketing team has obtained on special occasions\r\n"
                                                + "\r\n" + " like Pongal, Diwali, Valentine’s Day etc.\r\n" + "\r\n"
                                                + " These are limited occasion offers and therefore cancellations are not possible. \r\n"
                                                + //
                                                "\r\n" + //
                                                "   In case of receipt of damaged or defective consumer durable items and nondurable items, please report the same to our Customer \r\n"
                                                + "\r\n" + "Service team.\r\n" + "\r\n"
                                                + " The request will, however, be entertained once the merchant has checked and determined the same at his own end.\r\n"
                                                + "\r\n"
                                                + " This should be reported within 1 day of receipt of the products.  \r\n"
                                                + //
                                                "\r\n" + //
                                                "   In case you feel that the product received is not as shown on the site or as per your expectations, you must bring it to the notice\r\n"
                                                + "\r\n"
                                                + " of our customer service within 24 hours of receiving the product.\r\n"
                                                + "\r\n" +
                                                "   The Customer Service Team after looking into your complaint will take an appropriate decision. ");
                lable18.setLineSpacing(-5);
                vb4 = new VBox(20, lable15, lable16, lable17, lable18);
                vb4.setStyle("-fx-pref-width : 1550;-fx-background-image:url('RUss.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;");

                // ************************************************************************************************************************About
                // Us */
                vb5 = new VBox();
                HBox hb4 = new HBox();
                Image image4 = new Image("1698229936347.jpg");
                ImageView imageView4 = new ImageView(image4);
                imageView4.setFitWidth(500);
                imageView4.setFitHeight(600);
                Label label = new Label("Thank you...🙏");
                Label label25 = new Label("Thank you to core2web family for giving us this wonderful opportunity.\r\n" +
                                "\r\n " + "In this SUPER_X_2.0 we experienced the too many new things with project.\r\n"
                                +
                                "\r\n"
                                + "At the starting of this basic project we faced too many problems with the project.\r\n"
                                + "\r\n"
                                + " As per the guidence of Group Leaders and SuperX Team we are able to overcome \n all the our problems and we build this basic project with this Unique Idea.\r\n"
                                + "\r\n" + " Again Thank you to Sir and C2W for giving us this opportunity .\r\n"
                                + "\r\n"
                                + "we will be exited to participate into the upcoming new projects with our ideas");
                // label25.setLabelPadding();
                label25.setStyle("-fx-font-size: 20px; -fx-text-fill:  black;-fx-font-weight: bold");

                label25.setPadding(new Insets(100, 20, 0, 0)); // Right padding for label1

                label.setStyle("-fx-font-size: 25px; -fx-text-fill:  red;-fx-font-weight: bold");
                StackPane.setAlignment(label, javafx.geometry.Pos.TOP_CENTER);
                Label lable19 = new Label("❀ Group members");
                lable19.setStyle("-fx-font-size: 50px; -fx-text-fill: black;-fx-font-weight: bold");
                Label lable20 = new Label("►   Tejaswini Shelake");
                lable20.setStyle("-fx-font-size:25px; -fx-text-fill: purple;-fx-font-weight:bold");
                Label lable21 = new Label("►   Nikita Salunkhe");
                lable21.setStyle("-fx-font-size:25px; -fx-text-fill: purple;-fx-font-weight:bold");
                Label lable22 = new Label("►   Dipanjali Phadatare");
                lable22.setStyle("-fx-font-size:25px; -fx-text-fill: purple;-fx-font-weight:bold");
                Label lable23 = new Label("►   Sarthak kachare");
                lable23.setStyle("-fx-font-size:25px; -fx-text-fill: purple;-fx-font-weight:bold");
                Label lable24 = new Label("►   Rushabh pawar");
                lable24.setStyle("-fx-font-size:25px; -fx-text-fill:purple;-fx-font-weight:bold");
                Label lableDes = new Label("klkjhgfhjkhg");
                StackPane.setAlignment(lableDes, javafx.geometry.Pos.BASELINE_CENTER);
                Image c2w = new Image("c2ww.png");
                ImageView c2w1 = new ImageView(c2w);
                c2w1.setFitWidth(50);
                c2w1.setFitHeight(50);
                c2w1.setOnMouseClicked(event -> getHostServices().showDocument("https://www.core2web.in/"));

                hb4 = new HBox(10, imageView4, label, label25, c2w1);
                // VBox vb123 = new VBox(hb4,lableDes);

                vb5 = new VBox(20, hb4, lable19, lable20, lable21, lable22, lable23, lable24);
                vb5.setStyle("-fx-pref-width : 1550;-fx-background-image:url('RUss.jpg');-fx-background-position: center center;-fx-background-repeat: stretch;-fx-background-size: cover;");

                hbox = new HBox(40, vb1, vb2);

                b1.setOnMouseClicked(e -> {
                        hbox.getChildren().remove(1);
                        hbox.getChildren().add(1, vb2);
                });
                b2.setOnMouseClicked(e -> {
                        hbox.getChildren().remove(1);
                        hbox.getChildren().add(1, vb3);
                });
                b3.setOnMouseClicked(e -> {
                        hbox.getChildren().remove(1);
                        hbox.getChildren().add(1, vb4);
                });
                b6.setOnMouseClicked(e -> {
                        hbox.getChildren().remove(1);
                        hbox.getChildren().add(1, vb5);
                });
                Scene scene = new Scene(hbox, 5000, 1000);
                primaryStage.setScene(scene);

                primaryStage.setTitle("VBox in HBox Example");
                primaryStage.show();

        }

        public static void main(String[] args) {
                launch(args);
        }
}
