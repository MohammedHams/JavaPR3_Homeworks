/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPR3_HW3P2;


import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author MohammedHams
 */
public class anonToLambda extends Application{

    public String converttouppercase(String s)
        {
            return s.toUpperCase();
        }
    
    
    @Override
    public void start(Stage stage) throws Exception {
     
        TextField txtinput=new TextField();
        Button btninput=new Button("Click Here");
        VBox vbox=new VBox(txtinput,btninput);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20,20,20,20));
        btninput.setOnAction((ActionEvent t) -> {
            if(t.getSource()==btninput)
            {
                if(!txtinput.getText().equals(""))
                {
                    IntConsumer intConsumer = value->System.out.println(value);
                    intConsumer.accept(Integer.parseInt(txtinput.getText()));
                    
                }
            }
        });
        
        TextField txtString=new TextField();
        Label lblString =new Label();
        Button btnUpperCase=new Button("UpperCase");
        VBox vbox2=new VBox(txtString,btnUpperCase,lblString);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(20,20,20,20));
        btnUpperCase.setOnAction((ActionEvent t) -> {
            if(t.getSource()==btnUpperCase)
            {
                if(!txtString.getText().equals(""))
                {
                    String input=converttouppercase(txtString.getText());
                    lblString.setText(input);
                }
            }
        });
   
        Label lbl3=new Label();
        Callable<String> text=()->{
            System.out.println("Weclome lambda !");
            return null;
        };
        VBox vbox3=new VBox(lbl3);
        String ss=text.call();
        lbl3.setText(ss);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setPadding(new Insets(20,20,20,20));
      
        Scanner inputs=new Scanner(System.in);
        double in=inputs.nextDouble();
        UnaryOperator<Double>cube=c->{return Math.cbrt(c);};
        double cc=cube.apply(in);
        System.out.println(cc);
       
       VBox vboxMain=new VBox(vbox,vbox2,vbox3);
        
        
        
        
        
        Scene s=new Scene(vboxMain);
        stage.setScene(s);
       stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
       
    }

   
    
}
