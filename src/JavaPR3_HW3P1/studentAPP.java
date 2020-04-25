/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPR3_HW3P1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mohammed Hams
 */
public class studentAPP extends Application{
 private ListView<Student>list;
    @Override
    public void start(Stage stage) throws Exception {
    Label lbl1=new Label("Student Data");
        Label lbl2=new Label("id");
        Label lbl3=new Label("Name");
        Label lbl4=new Label("Major");
        Label lbl5=new Label("Grades");
        TextField textId=new TextField();
        TextField textName=new TextField();
        TextField textMajor=new TextField();
        TextField textGrade=new TextField();
        Button btnAdd=new Button("Add");
        Button btnReset=new Button("Reset");
        Button btnExit=new Button("Exit");
        
        
        HBox hbox1=new HBox(30,lbl2,textId);
        
        HBox hbox2=new HBox(10,lbl3,textName);
        HBox hbox3=new HBox(10,lbl4,textMajor);
        HBox hbox4=new HBox(5,lbl5,textGrade);
        HBox hbox5=new HBox(10,btnAdd,btnReset,btnExit);
        hbox5.setPadding(new Insets(0,0,0,65));
        list=new ListView<>();
        list.setPrefWidth(200);
        list.setPrefHeight(100);
        VBox vbox1=new VBox(10,lbl1,hbox1,hbox2,hbox3,hbox4,hbox5);
        vbox1.setPadding(new Insets(20, 20, 20, 20));
        HBox hbox6=new HBox(vbox1,list);
        hbox6.setAlignment(Pos.CENTER);
        hbox6.setPadding(new Insets(40));
        btnAdd.setOnAction((ActionEvent event) -> {
            if(event.getSource()==btnAdd)
                if(!textId.getText().equals("") && !textName.getText().equals("") && !textMajor.getText().equals("") && !textGrade.getText().equals(""))
                {
                    int id=Integer.valueOf(textId.getText());
                    double grade=Double.valueOf(textGrade.getText());
                    String name=textName.getText();
                    String major=textMajor.getText();
                    Student std=new Student(id,name,major,grade);
                    list.getItems().add(std);
                }
    });
        btnReset.setOnAction((ActionEvent t) -> {
            if(t.getSource()==btnReset)
            {
                textId.setText("");
                textName.setText("");
                textMajor.setText("");
                textGrade.setText("");
            }
        });
        btnExit.setOnAction((ActionEvent t) -> {
            System.exit(0);
        });
        
        
        Scene scene=new Scene(hbox6);
        stage.setScene(scene);
        scene.getStylesheets().add("C:\\Users\\Marshal\\Documents\\NetBeansProjects\\JavaPR3_Homeworks\\src\\JavaPR3_HW3P1\\Style.css");
        stage.setTitle("Student Entry Page");
        stage.show();
       
    
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
