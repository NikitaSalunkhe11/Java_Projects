import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.image.Image;

public class LoginPage extends Application {
    Stage window;

    public static void main(String[] args) throws Exception {
        System.out.println("We'll help you grow..");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("welome to our online nursery!");

        Image BackGroundImg = new Image("LoginImages\\logimg.jpg");
        BackgroundImage background = new BackgroundImage(BackGroundImg,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setBackground(new Background(background));

        Text welomeTxt = new Text("Take Plants,Tech Plants..🌱");
        // welomeTxt.setStyle("-fx-text-fill: orange;");
        welomeTxt.setFont(Font.font("Bold", FontWeight.LIGHT, 30));
        grid.add(welomeTxt, 1, 0);

        Label lbluse = new Label("Username");
        grid.add(lbluse, 0, 1);
        Font font = new Font("Bold", 15);
        lbluse.setFont(font);

        TextField txtUser = new TextField();
        txtUser.setPromptText("Username");
        grid.add(txtUser, 1, 1);

        Label lblPassword = new Label("Password");
        grid.add(lblPassword, 0, 2);
        Font fontt = new Font("Bold", 15);
        lblPassword.setFont(fontt);

        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Password");
        grid.add(pwBox, 1, 2);

        CheckBox rememberMeCheckbox = new CheckBox("Remember Me");
        grid.add(rememberMeCheckbox, 2, 3);

        Button Loginbtn = new Button("Login");
        grid.add(Loginbtn, 1, 3);

        Loginbtn.setOnAction(e -> {
            if (rememberMeCheckbox.isSelected()) {
                System.out.println("Remember Me is selected");

            } else {
                System.out.println("Remember Me is not selected");

            }
        });

        Loginbtn.setOnMouseClicked(event -> {
            HomePage gp1 = new HomePage();
            try {
                gp1.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Button newAccount = new Button("Create New Account");
        grid.add(newAccount, 1, 4);
        newAccount.setOnAction(e -> {
            createAccountForm();
        });
        Scene scene = new Scene(grid, 5000, 1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Plant Nursery");
        window.setScene(scene);
        window.show();
    }

    private void createAccountForm() {
        Stage accountGridWindow = new Stage();
        accountGridWindow.setTitle("Create Your Account");

        GridPane accountGrid = new GridPane();
        accountGrid.setAlignment(Pos.CENTER);
        accountGrid.setVgap(20);
        accountGrid.setHgap(20);
        accountGrid.setPadding(new Insets(25, 25, 25, 25));

        Image backgroundImage = new Image("LoginImages\\imageback.jpg");
        BackgroundImage background = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));

        Label accountLabel = new Label("Create your new account here");
        accountLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        accountGrid.add(accountLabel, 0, 0, 2, 1);
        GridPane.setHalignment(accountLabel, HPos.CENTER);
        GridPane.setMargin(accountLabel, new Insets(20, 0, 20, 0));

        Label nameLabel = new Label("Full Name:");
        accountGrid.add(nameLabel, 0, 1);
        nameLabel.setTextFill(Color.WHITE);
        Font fonta = new Font("Bold", 15);
        nameLabel.setFont(fonta);

        TextField nameField = new TextField();
        accountGrid.add(nameField, 1, 1);

        Label emailLabel = new Label("EmailId:");
        accountGrid.add(emailLabel, 0, 2);
        emailLabel.setTextFill(Color.WHITE);
        Font fontb = new Font("Bold", 15);
        emailLabel.setFont(fontb);

        TextField emailField = new TextField();
        accountGrid.add(emailField, 1, 2);

        Label mobileLabel = new Label("Mobile Number:");
        accountGrid.add(mobileLabel, 0, 3);
        mobileLabel.setTextFill(Color.WHITE);
        Font fontc = new Font("Bold", 15);
        mobileLabel.setFont(fontc);

        TextField mobileField = new TextField();
        accountGrid.add(mobileField, 1, 3);

        Label passwordLabel = new Label("Password:");
        accountGrid.add(passwordLabel, 0, 4);
        passwordLabel.setTextFill(Color.WHITE);
        Font fontd = new Font("Bold", 15);
        passwordLabel.setFont(fontd);

        PasswordField passwordField = new PasswordField();
        accountGrid.add(passwordField, 1, 4);

        Label confirmPasswordLabel = new Label("Confirm Password:");
        accountGrid.add(confirmPasswordLabel, 0, 5);
        confirmPasswordLabel.setTextFill(Color.WHITE);
        Font fonte = new Font("Bold", 15);
        confirmPasswordLabel.setFont(fonte);

        PasswordField confirmPasswordField = new PasswordField();
        accountGrid.add(confirmPasswordField, 1, 5);

        Button createAccountButton = new Button("Create Account");
        accountGrid.add(createAccountButton, 1, 6);
        createAccountButton.setOnAction(e -> {

            String name = nameField.getText();
            String email = emailField.getText();
            String mobile = mobileField.getText();
            String password = passwordField.getText();
            String confirmPassword = confirmPasswordField.getText();

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Mobile Number: " + mobile);
            System.out.println("Password: " + password);
            System.out.println("Confirm Password: " + confirmPassword);

            window.close();
        });
        createAccountButton.setOnMouseClicked(event -> {
            LoginPage lPage = new LoginPage();
            try {
                System.out.println("Your account is successfully created");
                lPage.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        accountGrid.setBackground(new Background(background));
        Scene scene = new Scene(accountGrid, 5000, 1000);
        accountGridWindow.setScene(scene);
        accountGridWindow.show();
    }
}
