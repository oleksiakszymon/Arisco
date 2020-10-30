package zadanie.widok;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import zadanie.AlertBox;
import zadanie.sort.BubbleSort;
import zadanie.sort.Sort;

import java.util.Random;


public class TemplateBController {

    Random generator = new Random();

    @FXML
    private TextField textField1;
    @FXML
    private Button button1;
    @FXML
    private CheckBox checkBoxSort;
    @FXML
    private CheckBox checkBoxBubbleSort;
    public int size;

    @FXML
    private void Accept() {
        if (textField1.getText() == "") {
            AlertBox.display("Uwaga", "Podaj wielkość tablicy");
        } else {
            try {
                size = Integer.parseInt(textField1.getText());
            } catch (NumberFormatException ex) {
                AlertBox.display("Uwaga", "Wielkość tablicy musi być naturalną liczbą ");
                textField1.setText("");
                return;
            }
            if (size < 0) {
                AlertBox.display("Uwaga", "Wielkość tablicy musi być liczbą dodatnią");
                textField1.setText("");
                return;
            }
            int[] tablica1 = new int[size];

            for (int i = 0; i < size; i++) {
                tablica1[i] = generator.nextInt(20) + 1;
                if (i == 0) {
                    System.out.print("Tablica 1: ");
                }
                System.out.print(tablica1[i] + " ");
                textField1.setPromptText("Podaj granicę");
                textField1.setText("");
            }
            System.out.print("\n\n");
            if (checkBoxSort.isSelected()) {
                Sort sortuj1 = new Sort(tablica1);
            }
            if (checkBoxBubbleSort.isSelected()) {
                BubbleSort posortuj1 = new BubbleSort(tablica1);
            }
            button1.setOnAction(e -> AcceptTwo());
        }
    }

    private void AcceptTwo() {
        int zakres;
        if (textField1.getText() == "") {
            AlertBox.display("Uwaga", "Podaj górny zakres losowanych liczb");
        } else {
            try {
                zakres = Integer.parseInt(textField1.getText());
            } catch (NumberFormatException ex) {
                AlertBox.display("Uwaga", "Wielkość tablicy musi być naturalną liczbą ");
                textField1.setText("");
                return;
            }
            if (Integer.parseInt(textField1.getText()) < 0) {
                AlertBox.display("Uwaga", "Górny zakres musi być liczbą dodatnią");
                textField1.setText("");
                return;
            }


            int[] tablica2 = new int[size];
            for (int i = 0; i < size; i++) {
                tablica2[i] = generator.nextInt(Integer.parseInt(textField1.getText()) + 1);
                if (i == 0) {
                    System.out.print("Tablica 2: ");
                }
                System.out.print(tablica2[i] + " ");
            }
            System.out.print("\n\n");
            if (checkBoxSort.isSelected()) {
                Sort sortuj2 = new Sort(tablica2);
            }
            if (checkBoxBubbleSort.isSelected()) {
                BubbleSort posortuj2 = new BubbleSort(tablica2);
            }
            button1.setOnAction(e -> Accept());
        }
    }


}
