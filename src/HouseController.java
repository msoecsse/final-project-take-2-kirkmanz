import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Controller for the FXML file.
 */
public class HouseController {
    private Stage otherStage;
    @FXML
    AnchorPane mainGrid;
    @FXML
    Button houseEditButton;
    @FXML
    ImageView bedroom1;
    @FXML
    ImageView bedroom2;
    @FXML
    ImageView bedroom3;
    @FXML
    ImageView bedroom4;
    @FXML
    ImageView bedroom5;
    @FXML
    ImageView bathroom1;
    @FXML
    ImageView bathroom2;
    @FXML
    ImageView bathroom3;
    @FXML
    ImageView bathroom4;
    @FXML
    ImageView bathroom5;
    @FXML
    ImageView pool;
    @FXML
    ImageView garage;

    private ArrayList<ImageView> bedrooms = new ArrayList<>();
    private ArrayList<ImageView> bathrooms = new ArrayList<>();


    @FXML
    public void initialize(){
        houseEditButton.setOnAction(_ -> openEditor());
        bedroom1.setVisible(false);
        bedroom2.setVisible(false);
        bedroom3.setVisible(false);
        bedroom4.setVisible(false);
        bedroom5.setVisible(false);
        bathroom1.setVisible(false);
        bathroom2.setVisible(false);
        bathroom3.setVisible(false);
        bathroom4.setVisible(false);
        bathroom5.setVisible(false);
        garage.setVisible(false);
        pool.setVisible(false);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);
        bathrooms.add(bathroom1);
        bathrooms.add(bathroom2);
        bathrooms.add(bathroom3);
        bathrooms.add(bathroom4);
        bathrooms.add(bathroom5);
    }

    private void openEditor(){
        if (otherStage.isShowing()) {
            otherStage.hide();
            houseEditButton.setText("Click here to edit your house!");
        } else {
            Stage thisStage = (Stage)mainGrid.getScene().getWindow();
            otherStage.setX(thisStage.getX() + 3 * thisStage.getWidth() / 4);
            otherStage.setY(thisStage.getY() / 2);
            otherStage.show();
            houseEditButton.setText("Click here to close editor");
        }
    }

    public void setOtherStage(Stage stageTwo){
        this.otherStage = stageTwo;
    }

    public void displayHouse(House house){
        initialize();
        for(int i = 0; i < house.getBedrooms(); i++){
            bedrooms.get(i).setVisible(true);
        }
        for(int i = 0; i < house.getBathrooms(); i++){
            bathrooms.get(i).setVisible(true);
        }
        if(house.getHasGarage()){
            garage.setVisible(true);
        }
        if(house.getHasPool()){
            pool.setVisible(true);
        }
    }

}
