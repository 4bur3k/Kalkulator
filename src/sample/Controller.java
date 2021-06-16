package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Controller {

    private ArrayList<String> arrayList = new ArrayList<String>();  //Лист, в нем лежат элементы строки

    @FXML
    private TextField InField;

    @FXML
    private Button CalculateButton;

    @FXML
    private TextField OutField;





    public void ButtonClick(ActionEvent actionEvent) {      //Нажатие на кнопку Calculate

        double Value = 0;
        String line = InField.getText();

        if(line.indexOf("+")!=-1){                                                      //Парсим строки и поверяем оператор
            String[] nums = line.split("\\s?\\+\\s?");
            Value = Double.parseDouble(nums[0]) + Integer.parseInt(nums[1]);
            OutField.setText(""+Value);
        }

        if(line.indexOf("-")!=-1){
            String[] nums = line.split("\\s?\\-\\s?");
            Value = Double.parseDouble(nums[0]) - Integer.parseInt(nums[1]);
            OutField.setText(""+Value);
        }

        if(line.indexOf("*")!=-1){
            String[] nums = line.split("\\s?\\*\\s?");
            Value = Double.parseDouble(nums[0]) * Integer.parseInt(nums[1]);
            OutField.setText(""+Value);
        }

        if(line.indexOf("/")!=-1){
            String[] nums = line.split("\\s?/\\s?");
            Value = Double.parseDouble(nums[0]) / Integer.parseInt(nums[1]);
            OutField.setText(""+Value);
        }

        arrayList.clear();
    }

                                                        //По нажатии каждой кнопки добаляем в список символ

    public void oneButtonClick(ActionEvent event) {
       arrayList.add("1");
        InField.setText(lineOut(arrayList));
    }

    public  void twoButtonClick(ActionEvent event) {
        arrayList.add("2");
        InField.setText(lineOut(arrayList));
    }

    public void threeButtonClick(ActionEvent event) {
        arrayList.add("3");
        InField.setText(lineOut(arrayList));
    }

    public void fourButtonClick(ActionEvent event) {
        arrayList.add("4");
        InField.setText(lineOut(arrayList));

    }

    public void fiveButtonClick(ActionEvent event) {
        arrayList.add("5");
        InField.setText(lineOut(arrayList));
    }

    public void sixButtonClick(ActionEvent event) {
        arrayList.add("6");
        InField.setText(lineOut(arrayList));
    }

    public void sevenButtonClick(ActionEvent event) {
        arrayList.add("7");
        InField.setText(lineOut(arrayList));
    }

    public void eightButtonClick(ActionEvent event) {
        arrayList.add("8");
        InField.setText(lineOut(arrayList));
    }


    public void nineButtonClick(ActionEvent event) {
        arrayList.add("9");
        InField.setText(lineOut(arrayList));
    }

    public  void zeroButtonClick(ActionEvent event) {
        arrayList.add("0");
        InField.setText(lineOut(arrayList));
    }

    public void devideButtonClick(ActionEvent event) {
        arrayList.add("/");
        InField.setText(lineOut(arrayList));
    }

    public void multiplyButtonClick(ActionEvent event) {
        arrayList.add("*");
        InField.setText(lineOut(arrayList));
    }

    public void misunButtonClick(ActionEvent event) {
        arrayList.add("-");
        InField.setText(lineOut(arrayList));
    }

    public void plusButtonClick(ActionEvent event) {
        arrayList.add("+");
        InField.setText(lineOut(arrayList));

    }

    @FXML
    private Button anyNumChoose;
                                                //Открываем новое окно
    @FXML
    void AnyNumChooseClick(ActionEvent event) {
        anyNumChoose.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/window.fxml"));
        try {
            loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 700, 500));
        stage.showAndWait();
}

    //My methods:
    public String lineOut(ArrayList arrayList) {
        String line = "";
        for (int i = 0; i < arrayList.size(); i++) {
           line = line + arrayList.get(i).toString();
        }
        return line;
    }

    

}