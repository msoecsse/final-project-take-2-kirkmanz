import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HouseEditorController {
    @FXML
    public CheckBox poolChecked;
    @FXML
    public CheckBox garageChecked;
    @FXML
    public Label test;
    @FXML
    private ToggleGroup bedroomToggleGroup;
    @FXML
    private ToggleGroup bathroomToggleGroup;

    @FXML
    public void initialize() {
        bedroomToggleGroup.selectedToggleProperty().addListener((_, _, newVal) -> {
            if (newVal != null) {
                RadioButton selectedRadioButton = (RadioButton) newVal;
                test.setText(selectedRadioButton.getText());
            }
        });

        bathroomToggleGroup.selectedToggleProperty().addListener((_, _, newVal) -> {
            if (newVal != null) {
                RadioButton selectedRadioButton = (RadioButton) newVal;
                test.setText(selectedRadioButton.getText());
            }
        });
    }
}
