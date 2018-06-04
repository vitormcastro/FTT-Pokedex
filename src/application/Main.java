package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();
		
		/*try {
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource(""));
            AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public static void main(String[] args) throws IOException {
		
		
		launch(args);
	}
	
	public void initRootLayout() {
        try {
            // Carrega o root layout do arquivo fxml.
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("bin/Login"));
            AnchorPane root = (AnchorPane) loader.load();

            // Mostra a scene (cena) contendo o root layout.
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
