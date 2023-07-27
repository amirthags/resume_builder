package application;
	
import java.sql.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.*;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.Scene;
//import javafx.scene.image.*;
//import javafx.stage.FileChooser;
import javafx.stage.Stage;
//import java.io.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
//import javafx.scene.canvas.*;
//import javafx.scene.Group;

public class Main extends Application{
    public static void main(String[] args) {
    	//launch(args);
    	try {
    		//Class.forName("com.mysql.jdbc.Driver");
    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume_builder","root","123456");
    		Statement st= conn.createStatement();
    		st.execute("INSERT INTO  resume_builder.build (Name,phone,mailid,degree,branch)VALUES('karthika','123456789','mail id','degree','branch'");
    		ResultSet rs= st.executeQuery("Select * from build");
    		while(rs.next()) {
    			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
    		}
    	}
    	
    	catch(Exception e) {
    		System.out.println(e.toString());
    	}
        launch(args);
    }
   public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Resume Bulider");
        Label lb1=new Label("Name : ");
        Label lb2=new Label("Phone Number: ");
        Label lb3=new Label("Mail Id: ");
        Label lb4=new Label("Degree: ");
        Label lb11 = new Label("Branch: ");
        Label lb5=new Label("Father's Name: ");
        Label lb6=new Label("Mother's Name: ");
        Label lb7=new Label("Date of Birth: ");
        Label lb8=new Label("Gender: ");
        Label lb9=new Label("Address: ");
        Label lb10=new Label("Hobbies: ");
        Label lb12 = new Label("Experience: ");
        Label lb13 = new Label("Career Objective: ");
        Label lb14 = new Label("Area of Interest: ");
        Label lb15 = new Label("Languages known: ");
        Label lb16 = new Label("Profile: ");
        Label lb17 = new Label("Paper Presentation: ");
        Label lb19 = new Label("Projects done: ");
        Label lb20 = new Label("Workshop attended: ");
        Label lb21 = new Label("Achievements: ");
        Label lb22 = new Label("Participation: ");
       // Label lb18 = new Label("Image upload: "); 
        Label lb23 = new Label("HSC ");
        Label lb25 = new Label("Course: ");
        Label lb26 = new Label("Institution: ");
        Label lb27 = new Label("Year : ");
        Label lb28 = new Label("Percentage: ");
        Label lb24 = new Label("SSLC  ");
        Label lb30 = new Label("Course: ");
        Label lb31 = new Label("Institution: ");
        Label lb32 = new Label("Year : ");
        Label lb33 = new Label("Percentage: ");
        Label lb29 = new Label("Course: ");
        Label lb34 = new Label("Semester No: ");
        Label lb35 = new Label("Institution: ");
        Label lb36 = new Label("Year : ");
        Label lb37 = new Label("CGPA: ");
        //HBox h1 = new HBox();
        //hb.setSpacing(20);  
        //FileChooser file = new FileChooser();  
        //file.setTitle("Open File");  
       
        TextField tf1 = new TextField();     
        TextField tf2 = new TextField();
        TextField tf3= new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6= new TextField();
        TextField tf7 = new TextField();
        TextField tf8 = new TextField();
        TextField tf9 = new TextField();
        TextField tf10 = new TextField();
        TextField tf11 = new TextField();
        TextField tf12 = new TextField();
        TextField tf13 = new TextField();
        TextField tf14 = new TextField();
        TextField tf15 = new TextField();
        TextField tf16 = new TextField();
        TextField tf17 = new TextField();
        TextField tf18 = new TextField();
        
        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea();
        TextArea ta3 = new TextArea();
        TextArea ta4 = new TextArea();
        TextArea ta5 = new TextArea();
        TextArea ta6 = new TextArea();
        TextArea ta7 = new TextArea();
        TextArea ta8 = new TextArea();
        TextArea ta9 = new TextArea();
        TextArea ta10 = new TextArea();
        TextArea ta11= new TextArea();
        tf1.setMaxWidth(250);
        tf2.setMaxWidth(250);
        tf3.setMaxWidth(250);
        tf4.setMaxWidth(250);
        tf5.setMaxWidth(250);
        tf6.setMaxWidth(250);
        tf7.setMaxWidth(250);
        ta1.setMaxWidth(250);
        ta2.setMaxWidth(250);
        ta3.setMaxWidth(250);
        ta4.setMaxWidth(250);
        ta5.setMaxWidth(250);
        ta6.setMaxWidth(250);
        ta7.setMaxWidth(250);
        ta8.setMaxWidth(250);
        ta9.setMaxWidth(250);
        ta10.setMaxWidth(250);
        ta11.setMaxWidth(250);
        
        RadioButton btn1 = new RadioButton("Male");
        RadioButton btn2 = new RadioButton("Female");
        RadioButton btn3 = new RadioButton("Other");
        ToggleGroup grp = new ToggleGroup();
        btn1.setToggleGroup(grp);
        btn2.setToggleGroup(grp);
        btn3.setToggleGroup(grp);
        VBox vb =  new VBox();
        vb.getChildren().addAll(btn1,btn2,btn3);
        
    /*   CheckBox c1 = new CheckBox("Playing");
        CheckBox c2 = new CheckBox("Singing");
        CheckBox c3= new CheckBox("Dancing");
        CheckBox c4 = new CheckBox("Reading");
        CheckBox c5 = new CheckBox("Listening Music");
        TextArea ta12 = new TextArea();
        ta12.setMaxWidth(250);
        ta12.setPromptText("Others ");
        VBox vb2 = new VBox();
        vb2.getChildren().addAll(c1,c2,c3,c4,c5,ta12);*/
        
        ListView<String> c1 = new ListView<String>();
        c1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        c1.getItems().add("Playing");
        c1.getItems().add("Singing");
        c1.getItems().add("Dancing");
        c1.getItems().add("Reading");
        c1.getItems().add("Listening to Music");
        
        VBox vb2 = new VBox();
        vb2.getChildren().addAll(c1);
        
        ComboBox<String> sub = new ComboBox<String>();
        sub.getItems().add("B.E/B.Tech");
        sub.getItems().add("M.E/M.Tech");
        sub.getItems().add("B.Sc");
        sub.getItems().add("M.Sc");
        sub.getItems().add("B.Com");
        sub.getItems().add("M.Com");
        sub.getItems().add("BBA/BCA");
        sub.getItems().add("MBA/MCA");
        
        
        RadioButton bt1 = new RadioButton("Fresher");
        RadioButton bt2 = new RadioButton("Experienced");
   
        ToggleGroup grp1 = new ToggleGroup();
        bt1.setToggleGroup(grp1);
        bt2.setToggleGroup(grp1);
        VBox vb1 =  new VBox();
        vb1.getChildren().addAll(bt1,bt2);
        
        Button b = new Button();
        b.setText("Submit");
        Button b1 = new Button();
        b1.setText("Cancel");
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	if(tf1.getText().equals("") || tf2.getText().equals("")|| ta1.getText().equals("")  ||tf4.getText().equals("") ||tf7.getText().equals("") || ta7.getText().equals("") ||ta2.getText().equals("") || ta3.getText().equals("") ||tf3.getText().equals("") )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the required Field!!");
            	alert.show();
            	}

            	if( tf2.getText().equals(""))
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Phone Number!!");
            	alert.show();
            	}

               if( ta1.getText().equals("") )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Mail Id!!");
            	alert.show();
            	}

            	if(tf1.getText().equals("")  )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Name!!");
            	alert.show();
            	}
  

           if(tf4.getText().equals("") ) 
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Branch!!");
            	alert.show();
            	}
  

            	if(tf7.getText().equals("")  )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Date of Birth!!");
            	alert.show();
            	}
  

            	if( ta7.getText().equals(" ") )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Address!!");
            	alert.show();
            	}
  

            	if(ta2.getText().equals("")  )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Career Objective!!");
            	alert.show();
            	}
  

            	if( ta3.getText().equals("")  )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Area of Interest!!");
            	alert.show();
            	}
            	

            	if(tf3.getText().equals("") )
            	{
            	Alert alert = new Alert(AlertType.WARNING);
            	alert.setTitle("Message Here...");
            	alert.setHeaderText("Couldn't Submit the form");
            	alert.setContentText("Please Fill the Languages Known!!");
            	alert.show();
            	}

            }
        };

          
      /*  b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logger.info("OnAction {}", event);
            }
        });*/
        b.setOnAction(event);
        
        
        GridPane root = new GridPane();
        root.add(lb1, 0, 0);
        root.add(tf1, 1, 0);
        root.add(lb2, 0, 1);
        root.add(tf2, 1, 1);
        root.setHgap(10);
        root.setVgap(10);
       root.add(lb4, 0, 2); 
        root.add(sub, 1, 2);
        root.add(lb11, 0, 3);
        root.add(tf4, 1, 3);
        root.add(lb5, 0, 4);
        root.add(tf5, 1, 4);
        root.add(lb6, 0, 5);
        root.add(tf6, 1, 5);
        root.add(lb7, 0, 6);
        root.add(tf7, 1, 6);
        root.add(lb8, 0, 7);
        root.add(vb, 1, 7);
        root.add(lb9, 0, 8);
        root.add(ta7, 1, 8);
        root.add(lb10, 0, 9);
        root.add(vb2, 1, 9);
        root.add(lb3, 0, 10);
       root.add(ta1, 1, 10);
       root.add(lb12, 0, 11);
        root.add(vb1, 1,11);
        root.add(lb13, 0, 12);
        root.add(ta2, 1, 12);
        root.add(lb14, 0, 13);
        root.add(ta3, 1, 13);
        root.add(lb15, 0, 14);
        root.add(tf3, 1, 14);
        root.add(lb16, 0, 15);
        root.add(ta5, 1, 15);
        root.add(lb17, 2, 0);
        root.add(ta6, 3, 0);
       // root.add(lb18,2,1);
        root.add(lb20, 2, 1);
        root.add(ta8, 3, 1);
        root.add(lb21, 2, 2);
        root.add(ta9, 3, 2);
        root.add(lb22, 2, 3);
        root.add(ta10, 3, 3);
        root.add(lb19, 2, 4);
        root.add(ta11, 3, 4);
        root.add(lb25, 2, 5);
        root.add(lb23, 3, 5);
        root.add(lb26, 2, 6);
        root.add(tf9, 3, 6);
        root.add(lb27, 2, 7);
        root.add(tf10, 3, 7);
        root.add(lb28, 2, 8);
        root.add(tf11, 3, 8);
        root.add(lb30, 2, 9);
        root.add(lb24, 3, 9);
        root.add(lb31, 2, 10);
        root.add(tf12, 3,10);
        root.add(lb32, 2, 11);
        root.add(tf13, 3, 11);
        root.add(lb33, 2, 12);
        root.add(tf14, 3, 12);
        root.add(lb29,4, 0);
        root.add(tf8, 5, 0);
        root.add(lb34, 4, 1);
        root.add(tf15, 5, 1);
        root.add(lb35, 4, 2);
        root.add(tf16, 5, 2);
        root.add(lb36, 4, 3);
        root.add(tf17, 5, 3);   
        root.add(lb37, 4, 4);
        root.add(tf18, 5, 4);
        
        root.add(b, 4, 6);
        root.add(b1,5, 6);
        root.setBackground(new Background(new BackgroundFill(Color.rgb(202,233,203), new CornerRadii(0), Insets.EMPTY)));
      
        Scene scene = new Scene(root,350,400,Color.BEIGE);
       // file.showOpenDialog(scene); 
 
        primaryStage.setScene(scene);
    
        primaryStage.show();
    }
  
}
   