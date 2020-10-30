package zadanie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class TemplateController {

    @FXML
    private TextField textField1;
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonMultiply;

    boolean finished = false;
    double a, b;
    String znak;

    @FXML
    private void click(ActionEvent gn) {
        String nr = ((Button)gn.getSource()).getText();

        if(finished) {
            textField1.setText(nr);
            finished = false;
        } else {
            textField1.setText(textField1.getText() + nr);
        }
    }

    @FXML
    private void clear(){
        textField1.setText("");
    }
    @FXML
    private void operation(ActionEvent gn){
       a = Double.parseDouble(textField1.getText());
       znak = ((Button)gn.getSource()).getText();
       ((Button)gn.getSource()).setDisable(true);
       textField1.setText("");
    }

    @FXML
    private void calculation(){

        //Napisałem tak bo nie wiem jak odnieść się do tego który był Disabled w voidzie operation

        buttonDivide.setDisable(false);
        buttonPlus.setDisable(false);
        buttonMinus.setDisable(false);
        buttonMultiply.setDisable(false);
        
        b = Double.parseDouble(textField1.getText());
        switch (znak){
            case "+":
                textField1.setText(String.valueOf(a+b));
                break;
            case "x":
                textField1.setText(String.valueOf(a*b));
                break;
            case "/":
                textField1.setText(String.valueOf(a/b));
                break;
            case "-":
                textField1.setText(String.valueOf(a-b));
                break;
        }

        finished = true;

    }
}

