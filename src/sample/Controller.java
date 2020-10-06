package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;



public class Controller {

    @FXML
    private TextArea txtAreaOut;
    @FXML
    private TextField txtFieldIn;



//    ArrayList<String> text = new ArrayList<String>();




    @FXML
    void click(ActionEvent event){
        String newRow = txtFieldIn.getText();
        txtAreaOut.appendText(newRow);
        txtAreaOut.appendText("\n\r");
        txtFieldIn.clear();



    }

}
