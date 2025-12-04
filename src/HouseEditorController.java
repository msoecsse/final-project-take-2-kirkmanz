import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HouseEditorController extends HouseBuilder{
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private boolean includePool = false;
    private boolean includeGarage = false;
    private House house;
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

    private HouseController houseController;

    @FXML
    public void initialize() {

    }

    @FXML
    public void enterPressed(){
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

        buildHouse();
    }

    private void buildHouse() {
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.construct(this, numberOfBedrooms, numberOfBathrooms, includeGarage, includePool);
        house = getResult();

    }

    public House getHouse(){
        return house;
    }

    public void setMainController(HouseController controller){
        houseController = controller;
    }
}
