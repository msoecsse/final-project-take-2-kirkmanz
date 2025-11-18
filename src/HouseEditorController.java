import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HouseEditorController {
    int numberOfBedrooms;
    int numberOfBathrooms;
    boolean includePool = false;
    boolean includeGarage = false;
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
                String value = (String) selectedRadioButton.getUserData();
                numberOfBedrooms = Integer.parseInt(value);
            }
        });

        bathroomToggleGroup.selectedToggleProperty().addListener((_, _, newVal) -> {
            if (newVal != null) {
                RadioButton selectedRadioButton = (RadioButton) newVal;
                String value = (String) selectedRadioButton.getUserData();
                numberOfBathrooms = Integer.parseInt(value);
            }
        });

        poolChecked.selectedProperty().addListener((_, _, _) -> includePool= poolChecked.isSelected());

        garageChecked.selectedProperty().addListener((_, _, _) -> includeGarage= garageChecked.isSelected());


    }
}
