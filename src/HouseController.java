import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controller for the FXML file.
 */
public class HouseController {
    private Stage otherStage;
    private HouseEditorController otherController;
    @FXML
    Button houseEditButton;

    @FXML
    public void initialize(){
        houseEditButton.setOnAction(_ -> openSettings());
    }

    private void openSettings(){
        if (otherStage.isShowing()) {
            otherStage.hide();
        } else {
            otherStage.show();
        }
    }

    public void setOtherStage(Stage stageTwo){
        this.otherStage = stageTwo;
    }

    public void setOtherController(HouseEditorController editorController) {
        this.otherController = editorController;
    }
}
