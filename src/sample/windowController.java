package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class windowController {
    public ArrayList arrayList1 = new ArrayList(1) ;
    public ArrayList arrayList2 = new ArrayList(1);
    private int Action = 0;
    @FXML
    TextField InField1;
    @FXML
    TextField InField2;
    @FXML
    TextField OutField;
    @FXML
    private MenuButton ActionButton;

    public boolean flag = true;


    @FXML
    void plusButtonClick(ActionEvent event) {
        Action = 0;
        ActionButton.setText("+");
    }

    @FXML
    void minusButtonClick(ActionEvent event) {
        Action = 1;
        ActionButton.setText("-");
    }

    @FXML
    void muliplyButtonClick(ActionEvent event) {
        Action = 2;
        ActionButton.setText("*");
    }

    @FXML
    void devideButtonClick(ActionEvent event) {
        Action = 3;
        ActionButton.setText("/");
    }

    @FXML
    void inField2ButtonClick(ActionEvent event) {                               //Отслеживаем, куда нужно передавать текст
        flag = false;
        System.out.println(flag);
    }

    @FXML
    void inField1ButtonClick(ActionEvent event) {
        flag = true;
        System.out.println(flag);
    }

    public void ButtonClick1(ActionEvent event) {
        double Value = 0;
        String Line1 = InField1.getText();
        String Line2 = InField2.getText();
            if (Action == 0) {
                Value = Integer.parseInt(numReverser(Line1, NumSystemIndicator)) + Integer.parseInt(numReverser(Line2, NumSystemIndicator2));
                OutField.setText("" + Value);
            }

            if (Action == 1) {
                Value = Integer.parseInt(numReverser(Line1, NumSystemIndicator)) - Integer.parseInt(numReverser(Line2, NumSystemIndicator2));
                OutField.setText("" + Value);
            }

            if (Action == 2) {
                Value = Integer.parseInt(numReverser(Line1, NumSystemIndicator)) * Integer.parseInt(numReverser(Line2, NumSystemIndicator2));

                OutField.setText("" + Value);
            }

            if (Action == 3) {
                Value = Integer.parseInt(numReverser(Line1, NumSystemIndicator)) / Integer.parseInt(numReverser(Line2, NumSystemIndicator2));
                OutField.setText("" + Value);

        }
        arrayList1.clear();
        arrayList2.clear();

    }


    public void oneButtonClick1(ActionEvent event){
        if (flag) {
            arrayList1.add("1");
            InField1.setText(lineOut(arrayList1));
            System.out.println(lineOut(arrayList1));
        }
         if(!flag) {
            arrayList2.add("1");
            InField2.setText(lineOut(arrayList2));
            System.out.println(lineOut(arrayList2));
        }

    }

    public void fourButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("4");
            InField1.setText(lineOut(arrayList1));
        }
        else if(!flag){
            arrayList2.add("4");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public  void twoButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("2");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("2");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public  void sixButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("6");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("6");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public void nineButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("9");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("9");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public void fiveButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("5");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("5");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public  void eightButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("8");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("8");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public void sevenButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("7");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("7");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public void threeButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("3");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("3");
            InField2.setText(lineOut(arrayList2));
        }
    }


    public  void zeroButtonClick1(ActionEvent event) {
        if(flag) {
            arrayList1.add("0");
            InField1.setText(lineOut(arrayList1));
        }
        if(!flag){
            arrayList2.add("0");
            InField2.setText(lineOut(arrayList2));
        }
    }

    int NumSystemIndicator = -1; //0 - 2, 1 - 8, 2 -10, 3 - 16 система счисления
    int NumSystemIndicator2 = -1;
    @FXML
    private MenuButton enumButton;

    @FXML
    void firstNumSystem16ButtonClick(ActionEvent event) {
        NumSystemIndicator = 3;
        enumButton.setText("16");
    }

    @FXML
    void firstNumSystem10ButtonClick(ActionEvent event) {
        NumSystemIndicator = 2;
        enumButton.setText("10");
    }

    @FXML
    void firstNumSystem8ButtonClick(ActionEvent event) {
        NumSystemIndicator = 1;
        enumButton.setText("8");
    }

    @FXML
    void firstNumSystem2ButtonClick(ActionEvent event) {
        NumSystemIndicator = 0;
        enumButton.setText("2");
    }

    @FXML
    private MenuButton enumButton2;

    @FXML
    void secNumSystem16ButtonClick(ActionEvent event) {
        NumSystemIndicator2 = 3;
        enumButton2.setText("16");
    }

    @FXML
    void secNumSystem10ButtonClick(ActionEvent event) {
        NumSystemIndicator2 = 2;
        enumButton2.setText("10");
    }

    @FXML
    void secNumSystem8ButtonClick(ActionEvent event) {
        NumSystemIndicator2 = 1;
        enumButton2.setText("8");
    }

    @FXML
    void secNumSystem2ButtonClick(ActionEvent event) {
        NumSystemIndicator2 = 0;
        enumButton2.setText("2");
    }

    @FXML
    private Button decNumChoose;
    @FXML
    public  void DecNumberChooseClick(ActionEvent event) {
        decNumChoose.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/sample.fxml"));
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
        public String numReverser(String NumLine, int NumInd){
        int Number = 0;
            if (NumInd == 0){
                Number = Integer.parseInt(NumLine, 2);
                System.out.println(NumLine + " " + Number);
            }
            if (NumInd == 1){
                Number = Integer.parseInt(NumLine, 8);
            }
            if (NumInd == 2){
                Number = Integer.parseInt(NumLine, 10);
            }
            if (NumInd == 3){
                Number = Integer.parseInt(NumLine, 16);
            }
            return Integer.toString(Number);
        }

    public void ReverseTrans(String NumLine){
        int Num = 0;
        if(NumSystemIndicator == 0) {
           //NumLine = Integer.toBinaryString(NumLine);
        }
    }

}

