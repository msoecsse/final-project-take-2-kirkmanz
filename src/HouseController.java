import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controller for the FXML file.
 */
public class HouseController {
    private Stage otherStage;

    @FXML
    Button houseEditButton;

    @FXML
    public void initialize(){
        houseEditButton.setOnAction(_ -> openEditor());
    }

    private void openEditor(){
        if (otherStage.isShowing()) {
            otherStage.hide();
        } else {
            otherStage.show();
        }
    }

    public void setOtherStage(Stage stageTwo){
        this.otherStage = stageTwo;
    }

}
