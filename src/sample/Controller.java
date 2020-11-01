package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller {
    @FXML
    Rectangle r1;

    @FXML
    Rectangle r2;

    @FXML
    Rectangle r3;

    @FXML
    Rectangle r4;

    @FXML
    Rectangle r5;

    @FXML
    Rectangle r6;

    @FXML
    Rectangle r7;

    @FXML
    Rectangle r8;


    @FXML
    Button b;


    public void temp(ActionEvent e ){
        Timeline timeline1=new Timeline(new KeyFrame(Duration.millis(10), this::move1), new KeyFrame(Duration.millis(10), this::move2),new KeyFrame(Duration.millis(10), this::move3), new KeyFrame(Duration.millis(10), this::move4),new KeyFrame(Duration.millis(10), this::move5),new KeyFrame(Duration.millis(10), this::move6),new KeyFrame(Duration.millis(10), this::move7),new KeyFrame(Duration.millis(10), this::move8));
        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.play();
    }

    public void move1(ActionEvent e){
        if(r1.getLayoutX()>=300)
            r1.setLayoutX(-300);

        r1.setLayoutX(r1.getLayoutX()+1);
    }

    public void move2(ActionEvent e){
        if(r2.getLayoutX()>=300)
            r2.setLayoutX(-300);

        r2.setLayoutX(r2.getLayoutX()+1);
    }

    public void move3(ActionEvent e){
        if(r3.getLayoutX()>=300)
            r3.setLayoutX(-300);

        r3.setLayoutX(r3.getLayoutX()+1);
    }

    public void move4(ActionEvent e){
        if(r4.getLayoutX()>=300)
            r4.setLayoutX(-300);

        r4.setLayoutX(r4.getLayoutX()+1);
    }

    public void move5(ActionEvent e){
        if(r5.getLayoutX()>=300)
            r5.setLayoutX(-300);

        r5.setLayoutX(r5.getLayoutX()+1);
    }

    public void move6(ActionEvent e){
        if(r6.getLayoutX()>=300)
            r6.setLayoutX(-300);

        r6.setLayoutX(r6.getLayoutX()+1);
    }

    public void move7(ActionEvent e){
        if(r7.getLayoutX()>=300)
            r7.setLayoutX(-300);

        r7.setLayoutX(r7.getLayoutX()+1);
    }

    public void move8(ActionEvent e){
        if(r8.getLayoutX()>=300)
            r8.setLayoutX(-300);

        r8.setLayoutX(r8.getLayoutX()+1);

        System.out.print("Git testing");
        System.out.print("Git testing");
    }



}
