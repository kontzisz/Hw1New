
package hw1;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;            
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JFrame;
import javafx.scene.shape.*;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author kumar
 */
public class StoreSystem1 extends Application 
{
    TabPane tbPane = new TabPane();
    TabPane tbPane1 = new TabPane();
    TabPane tbPane2 = new TabPane();
    Tab tab1 = new Tab("Create: ");
    Tab tab2 = new Tab("Edit: ");
    Tab tab3 = new Tab("Display");
    Tab tab4 = new Tab("Create: ");
    Tab tab5 = new Tab("Edit: ");
    Tab tab6 = new Tab("Display");
    Tab tab7 = new Tab("Create: ");
    Tab tab8 = new Tab("Edit: ");
    Tab tab9 = new Tab("Display");
    
    
        Label actionLabel = new Label ("Select Entity: ");
        private String [] actionClasses= {"Customers", "Products", "Stores", "Suppliers", "Technician", "Services"};
        TextArea disp = new TextArea();
        TextArea disp1 = new TextArea();
        TextArea disp2 = new TextArea();
        TextField personName = new TextField();
        TextField personNamett = new TextField();
        TextField personPhone = new TextField();
        TextField personAddress = new TextField();
        TextField personNamet = new TextField();
        TextField personPhonet = new TextField();
        TextField personAddresst = new TextField();
        TextField personName1 = new TextField();
        TextField personPhone1 = new TextField();
        TextField personAddress1 = new TextField();
        TextField productName = new TextField();
        TextField productPrice = new TextField();
        TextField productDescription = new TextField();
        TextField serviceName = new TextField();
        TextField serviceLevel = new TextField();
        TextField serviceTown = new TextField();
        TextField serviceTech = new TextField();
        TextField serviceTechNumber = new TextField();
        TextField storeName = new TextField();
        TextField storeName1 = new TextField();
        TextField storeSDepartment = new TextField();
        TextField storeSDepartment1 = new TextField();
        TextField storeDescription = new TextField();
        TextField storeDescription1 = new TextField();
        TextField supplierName = new TextField();
        TextField supplierAddress = new TextField();
        TextField supplierCName = new TextField();
        TextField supplierCPhone = new TextField();
        TextField supplierCEmail = new TextField();
        
        
        
        Label editId = new Label ("Enter ID # of Entity to edit: ");
        TextField txtEdit = new TextField();
        RadioButton custa = new RadioButton ("Customer");
        RadioButton tec = new RadioButton ("Technician");
        RadioButton techn = new RadioButton("Customer");
            RadioButton cost = new RadioButton("Technician");
       
       
        Button submit = new Button ("Submit");
        Button submit1 = new Button ("Submit");
        Button go = new Button ("Go!");
        TextField editItem = new TextField();
        Label prsnType = new Label("Person Type: ");
        Label prsnName = new Label("Person Name: ");
        Label prsnAddress = new Label("Person Address: ");
        Label prsnPhone = new Label("Person Phone: ");
        Label prsnType1 = new Label("Person Type: ");
        Label prsnName1 = new Label("Person Name: ");
        Label prsnAddress1 = new Label("Person Address: ");
        Label prsnPhone1 = new Label("Person Phone: ");
        Label prdName = new Label ("Product Name: ");
        
        Label prsnNamet = new Label("Person Name: ");
        Label prsnAddresst = new Label("Person Address: ");
        Label prsnPhonet = new Label("Person Phone: ");
        
          Label prdPaid = new Label ("Product Paid Price: ");
          Label prdDescription = new Label("Product Description: ");
          Label strName = new Label ("Store Center Name: ");
          Label strName1 = new Label ("Store Center Name: ");
          Label strDepartment = new Label ("Service Department: ");
           Label strDepartment1 = new Label ("Service Department: ");
          Label strDescription = new Label ("Department Description: ");
          Label strDescription1 = new Label ("Department Description: ");
          Label suppName = new Label ("Supplier Name: ");
          Label suppAddress = new Label ("Supplier Address: ");
          Label suppCName = new Label ("Supplier Contact Name: ");
          Label suppCPhone = new Label ("Supplier Contact Phone Number: ");
          Label suppCEmail = new Label ("Supplier Contact Email: ");
          Label serName = new Label ("Service Name: ");
          Label serLevel = new Label ("Service Level: ");
          Label serTown = new Label ("Service Town: ");
          Label serTech = new Label ("Service Technician: ");
          Label serNumber = new Label ("Service Technician's Number: ");
           
           
            
            
            
             private ComboBox<String> comboBox = new ComboBox<>();
             
             MenuBar mnuBar = new MenuBar();
            
    
    @Override
    public void start(Stage primaryStage) 
    {
       
     
        GridPane primaryPane = new GridPane();
       
        primaryPane.setVgap(20);
        primaryPane.setHgap(20);
        
        
        // Title
        Text sceneTitle = new Text("Store System!");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,28));
        sceneTitle.setFill(Color.CORNSILK);
        primaryPane.add(sceneTitle, 1, 0, 2, 1);
        
        
//         Picture addition
        ImageView image = new ImageView("file:src/hw1/logo.png");
        primaryPane.getChildren().add(image);
        image.setFitHeight(150);
        image.setFitWidth(150);
        primaryPane.setPadding(new Insets(8,8,8,8));
        primaryPane.setStyle("-fx-background-color: grey;");
        
        
        // Combo Box
        primaryPane.add(actionLabel,0,1);
        primaryPane.add(comboBox, 1, 1);
        primaryPane.add(go, 2, 3);
        comboBox.setPrefWidth(400);
        ObservableList<String> items = FXCollections.observableArrayList(actionClasses);
        comboBox.getItems().addAll(items);
        
    
        
        
        // Add scene
        Scene primaryScene = new Scene (primaryPane, 600, 300, Color.CADETBLUE);
        
        // Stage
        primaryStage.setScene (primaryScene);
        primaryStage.setTitle("Store System!");
        primaryStage.show();
        
        // Button Action
        go.setOnAction(e -> setDisplay(items.indexOf(comboBox.getValue())));
        
        
    }
    
    public void setDisplay(int index){
        
        
//        editAction();
        if (index == 4)
        {
            showFive(index);
        }
        if (index == 0)
        {
            showOne(index);
           
            
        }
        if (index == 1)
        {
            showTwo(index);

        }
        if (index == 2) 
        {
            showThree(index);
            
        }  
        if (index == 3)
        {
            showFour(index);
           
            
        }
        if (index == 5)
        {
             showSix(index);
        }
        
        }
         
           
    
    public void showOne(int index)
    {
       
        Stage oneStage = new Stage();
        GridPane onePane = new GridPane();
        GridPane tabPane = new GridPane();
        GridPane lastTab = new GridPane();
        
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        

        mainPane.setPadding(new Insets(3,3,3,3));
        
        // Nodes
        Text actionTitle = new Text ("Enter Information ");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.FORESTGREEN);
        actionTitle.setTextAlignment(TextAlignment.CENTER);
        mainPane.add(actionTitle,0,0);
        onePane.setAlignment(Pos.CENTER);
        tabPane.setAlignment(Pos.CENTER);
        lastTab.setAlignment(Pos.CENTER);
        
        mainPane.add(mnuBar, 0, 0);
        mainPane.add(tbPane, 0, 1);
        
//        mainPane.add(tbPane, 0, 1);
       

        // Toggle group for radiobuttons
        ToggleGroup group = new ToggleGroup();
        custa.setToggleGroup(group);
        tec.setToggleGroup(group);
        
        // Add nodes to pane
           
        onePane.add(prsnName,0, 1);
        onePane.add(personNamett, 1, 1,2,1);
        
        onePane.add(prsnPhone,0, 2);
        onePane.add(personPhone,1,2);
        onePane.add(prsnAddress, 0,3);
        onePane.add(personAddress,1,3);
        
 
        onePane.add(prsnType,0,5);
        onePane.add(cost,1,5);
        onePane.add(techn,1,6);
       
     
        onePane.add(submit,3,10);
        tabPane.add(prsnName1,0, 1);
        tabPane.add(personName, 1, 1,2,1);
        
        tabPane.add(prsnPhone1,0, 2);
        tabPane.add(personPhone1,1,2);
        tabPane.add(prsnAddress1, 0,3);
        tabPane.add(personAddress1,1,3);
        
 
        tabPane.add(prsnType1,0,5);
        tabPane.add(tec,1,5);
        tabPane.add(custa,1,6);
       
     
        tabPane.add(submit1,3,10);
        
        lastTab.add(disp, 0, 1);
        
        tab1.setContent(onePane);
        tbPane.getTabs().add(tab1);
        
        tab2.setContent(tabPane);
        tbPane.getTabs().add(tab2);
        
        tab3.setContent(lastTab);
        tbPane.getTabs().add(tab3);
         // Scene
        Scene sceneOne = new Scene (mainPane, 600, 600);
        
        // Stage 
        oneStage.setScene(sceneOne);
        oneStage.setTitle("Customer");
        
        oneStage.show();
        
    }
  
  
    public void showTwo(int index)
    {
        
        Stage twoStage = new Stage();
        GridPane twoPane = new GridPane();
        
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        
        

        mainPane.setPadding(new Insets(3,3,3,3));
        
        // Nodes
        Text actionTitle1 = new Text ("Enter Information ");
        actionTitle1.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle1.setFill(Color.FORESTGREEN);
        twoPane.add(actionTitle1,0,0);
        twoPane.setAlignment(Pos.CENTER);
        
        
        
        mainPane.add(mnuBar, 0, 0);

       
    
        twoPane.add(prdName,0, 1);
        twoPane.add(productName, 1, 1,2,1);
        
        twoPane.add(prdPaid,0, 2);
        twoPane.add(productPrice,1,2);
        twoPane.add(prdDescription, 0,3);
        twoPane.add(productDescription,1,3);
        
        twoPane.add(submit,3,10);
        
         // Scene
        Scene sceneTwo = new Scene (twoPane, 600, 600);
        
        // Stage 
        twoStage.setScene(sceneTwo);
        twoStage.setTitle("Product");
        
        twoStage.show();
        
        
        
    }
    public void showThree(int index)
    {
        
        
        Stage threeStage = new Stage();
        GridPane threePane = new GridPane();
        GridPane tabPane = new GridPane();
        GridPane lastTab = new GridPane();
        
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        

        mainPane.setPadding(new Insets(3,3,3,3));
        
        // Nodes
        Text actionTitle = new Text ("Enter Information ");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.FORESTGREEN);
        mainPane.add(actionTitle,0,0);
        threePane.setAlignment(Pos.CENTER);
        
        tabPane.setAlignment(Pos.CENTER);
        lastTab.setAlignment(Pos.CENTER);
      
        mainPane.add(mnuBar, 0, 0);
        mainPane.add(tbPane1, 0, 1);
     
        threePane.add(strName,0, 1);
        threePane.add(storeName, 1, 1,2,1);
        
        threePane.add(strDepartment,0, 2);
        threePane.add(storeSDepartment,1,2);
        threePane.add(strDescription, 0,3);
        threePane.add(storeDescription,1,3);
        
        threePane.add(submit,3,10); 
     
        tabPane.add(strName1,0, 1);
        tabPane.add(storeName1, 1, 1,2,1);
        
        tabPane.add(strDepartment1,0, 2);
        tabPane.add(storeSDepartment1,1,2);
        tabPane.add(strDescription1, 0,3);
        tabPane.add(storeDescription1,1,3);
        tabPane.add(submit1,3,10); 
        
        lastTab.add(disp1, 0, 1);
        
        tab4.setContent(threePane);
        tbPane1.getTabs().add(tab4);
        
        tab5.setContent(tabPane);
        tbPane1.getTabs().add(tab5);
        
        tab6.setContent(lastTab);
        tbPane1.getTabs().add(tab6);
        
        
         // Scene
        Scene sceneThree = new Scene (mainPane, 600, 600);
        
        // Stage 
        threeStage.setScene(sceneThree);
        threeStage.setTitle("Store");
        
        threeStage.show();
        
    }
    public void showFour(int index)
    {
        
        Stage fourStage = new Stage();
        GridPane fourPane = new GridPane();
        
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        

        mainPane.setPadding(new Insets(3,3,3,3));
        
        // Nodes
        Text actionTitle = new Text ("Enter Information ");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.FORESTGREEN);
        fourPane.add(actionTitle,0,0);
        fourPane.setAlignment(Pos.CENTER);
        
        
        
        mainPane.add(mnuBar, 0, 0);
        
        
        
        
        fourPane.add(suppName,0, 1);
        fourPane.add(supplierName, 1, 1,2,1);
        
        fourPane.add(suppAddress,0, 2);
        fourPane.add(supplierAddress,1,2);
        fourPane.add(suppCName, 0,3);
        fourPane.add(supplierCName,1,3);
        fourPane.add(suppCPhone,0,4);
        fourPane.add(supplierCPhone,1,4);
        fourPane.add(suppCEmail,0,5);
        fourPane.add(supplierCEmail,1,5);
        fourPane.add(submit1,3,10); 
        Scene sceneFour = new Scene (fourPane, 600, 600);
        
        // Stage 
        fourStage.setScene(sceneFour);
        fourStage.setTitle("Supplier");
        
        fourStage.show();
        
        
        
    }
    public void showFive(int index)
    {
        
 
        Stage fiveStage = new Stage();
        GridPane fivePane = new GridPane();
        GridPane tabPane = new GridPane();
        GridPane lastTab = new GridPane();
        
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        
        mainPane.setPadding(new Insets(3,3,3,3));
        
        // Nodes
        Text actionTitle = new Text ("Enter Information ");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.FORESTGREEN);
        mainPane.add(actionTitle,0,0);
        fivePane.setAlignment(Pos.CENTER);
        tabPane.setAlignment(Pos.CENTER);
        lastTab.setAlignment(Pos.CENTER);
      
        
        mainPane.add(mnuBar, 0, 0);
        mainPane.add(tbPane2, 0, 1);
      
        ToggleGroup group = new ToggleGroup();
        custa.setToggleGroup(group);
        tec.setToggleGroup(group);
        fivePane.add(prsnName,0, 1);
        fivePane.add(personName, 1, 1,2,1);
        
        fivePane.add(prsnPhone,0, 2);
        fivePane.add(personPhone,1,2);
        fivePane.add(prsnAddress, 0,3);
        fivePane.add(personAddress,1,3);
        
        tabPane.add(prsnNamet,0, 1);
        tabPane.add(personNamet, 1, 1,2,1);
        
        tabPane.add(prsnPhonet,0, 2);
        tabPane.add(personPhonet,1,2);
        tabPane.add(prsnAddresst, 0,3);
        tabPane.add(personAddresst,1,3);
        
        
        fivePane.add(submit,3,10);  
         tabPane.add(submit1,3,10);
        lastTab.add(disp2, 0, 1);
        
        tab7.setContent(fivePane);
        tbPane2.getTabs().add(tab7);
        
        tab8.setContent(tabPane);
        tbPane2.getTabs().add(tab8);
        
        tab9.setContent(lastTab);
        tbPane2.getTabs().add(tab9);
        
        Scene sceneFive = new Scene (mainPane, 600, 600);
        
        // Stage 
        fiveStage.setScene(sceneFive);
        fiveStage.setTitle("Technician");
        
        fiveStage.show();
    }
    public void showSix(int index)
    {
        
        Stage sixStage = new Stage();
        GridPane sixPane = new GridPane();
        GridPane mainPane = new GridPane();
        mainPane.setPrefSize(200, 200);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setVgap(10);
        mainPane.setHgap(10);
        mainPane.setStyle("-fx-background-color: lightgrey;");
        mainPane.setPadding(new Insets(3,3,3,3));
        // Nodes
        Text actionTitle = new Text ("Enter Information ");
        actionTitle.setFont(Font.font("Tahoma", FontWeight.BOLD,
                28));
        actionTitle.setFill(Color.FORESTGREEN);
        sixPane.add(actionTitle,0,0);
        sixPane.setAlignment(Pos.CENTER);
        mainPane.add(mnuBar, 0, 0);
        sixPane.add(serName,0, 1);
        sixPane.add(serviceName, 1, 1,2,1);
        sixPane.add(serLevel,0, 2);
        sixPane.add(serviceLevel,1,2);
        sixPane.add(serTown, 0,3);
        sixPane.add(serviceTown,1,3);
        sixPane.add(serTech,0,4);
        sixPane.add(serviceTech,1,4);
        sixPane.add(serNumber,0,5);
        sixPane.add(serviceTechNumber,1,5);
        sixPane.add(submit,3,10);  
        Scene sceneSix = new Scene (sixPane, 600, 600);
        // Stage 
        sixStage.setScene(sceneSix);
        sixStage.setTitle("Service");
        sixStage.show();
    }
   


    public static void main(String[] args) {
        launch(args);
    }

}
