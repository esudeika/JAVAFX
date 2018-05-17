package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Controller {
    @FXML
    private Label dummyLabel;

    @FXML
    private TextField nameTextField;

    public void sayHi(ActionEvent event){
dummyLabel.setText("Labas Edvi");
    }

    public void changeName(ActionEvent event){
        String name = nameTextField.getText(); //pasiema ivesta texta
        dummyLabel.setText("LABAS " + name);
    }

    public void changeNameOnEnter(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)){
            dummyLabel.setText(nameTextField.getText());
        }
    }
}
