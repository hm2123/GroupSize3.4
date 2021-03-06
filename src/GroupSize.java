import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class GroupSize extends Application {
    public GroupSize() {
    }

    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setHeaderText("Enter the number of players on the team");
        Optional<String> numPeople1 = dialog.showAndWait();
        int numPlayers = Integer.parseInt((String)numPeople1.get());
        int groupSize;
        Alert alertFalse;
        if (numPlayers > 10) {
            groupSize = numPlayers / 2;
            alertFalse = new Alert(AlertType.INFORMATION);
            alertFalse.setContentText("For a team of " + numPlayers + " players, each team should contain " + groupSize + " players.");
            alertFalse.showAndWait();
        } else if (numPlayers > 3 && numPlayers < 10) {
            groupSize = numPlayers / 3;
            alertFalse = new Alert(AlertType.INFORMATION);
            alertFalse.setContentText("For a team of " + numPlayers + " players, each team should contain " + groupSize + " players.");
            alertFalse.showAndWait();
        } else {
            alertFalse = new Alert(AlertType.INFORMATION);
            alertFalse.setContentText("The number of players has to be at least 3");
            alertFalse.showAndWait();
        }

    }
}
