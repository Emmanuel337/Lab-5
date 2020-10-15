


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button bot1, bot2, bot3,bot4,bot5;
	HBox Hb1,Hb2;
	Label label1;
	TextField textfields;
	
	
	  
	 
	//student Task #4:
	//  declare an instance of DataManager
	DataManager manager;
 
	    
	    
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	
	FXMainPane() {
		  Hb1 = new HBox();
		  Hb2 = new HBox();
		 
		
		textfields = new TextField();
		 label1 = new Label("Feedback");
		 bot1 = new Button("Hello");
		 bot2 = new Button("Howdy");
	     bot3 = new Button("Chinese");
	     bot4 = new Button("Clear");
	     bot5 = new Button("Exit");
	     manager = new DataManager(); 
	     
	     Insets inset = new Insets(10);
	     Hb1.setMargin(bot1, inset);
	     Hb1.setMargin(bot2, inset);
	     Hb1.setMargin(bot3, inset);
	     Hb1.setMargin(bot4, inset);
	     Hb1.setMargin(bot5, inset);
	     
	     Hb2.setMargin(textfields, inset);
	     Hb2.setMargin(label1, inset);
	     
	     Hb1.setAlignment(Pos.CENTER);
	     Hb2.setAlignment(Pos.CENTER);
	     
	     
	     Hb1.getChildren().addAll(bot1,bot2 , bot3, bot4,  bot5 );
	     Hb2.getChildren().addAll(label1,textfields);
	     getChildren( ).addAll( Hb1,Hb2);
	     bot1.setOnAction(new buttonhandler());
	     bot2.setOnAction(new buttonhandler());
	     bot3.setOnAction(new buttonhandler());
	     bot4.setOnAction(new buttonhandler());
	     bot5.setOnAction(new buttonhandler());
	     
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
     public class buttonhandler implements EventHandler<ActionEvent>{
    	 public void handle(ActionEvent event) {
    		 if(event.getTarget( ) == bot1 ) {
    			 textfields.setText( manager.getHello());
    			 
    		 }
    		 else if(event.getTarget( ) == bot2 ) {
    			 textfields.setText( manager.getHowdy());

    		 }
    		 else if(event.getTarget( ) == bot3 ) {
    			 textfields.setText( manager.getChinese());

    		 }
    		 else if(event.getTarget( ) == bot4 ) {
    			 textfields.setText("");
    		 }
    		 else if(event.getTarget( ) == bot5 ) {
    			 Platform.exit();
    			 System.exit(0);
    		 }
    		 
    		 
    	 }
    	
    	 
    	 
     }
	
	
	
	
}
	
