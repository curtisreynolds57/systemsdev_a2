
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//                       //
// TIC TAC TOE GUI CLASS //
//                       //
public class TicTacToeGUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			BorderPane root = FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
			Scene scene = new Scene(root, 300, 320);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		}catch(Exception e){
			e.printStackTrace();
}
	}

	public static void main(String[] args) {
		Application.launch();
	}

}


