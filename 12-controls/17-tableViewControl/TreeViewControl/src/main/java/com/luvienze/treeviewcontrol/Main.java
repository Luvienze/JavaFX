package com.luvienze.treeviewcontrol;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        TreeView<String> treeView = new TreeView<>();
        TreeItem<String> classes = new TreeItem<>("Classes");
        TreeItem<String> classOne = new TreeItem<>("Class One");
        classOne.setExpanded(true);
        classOne.getChildren().addAll(
                new TreeItem<>("Patrick"),
                new TreeItem<>("Sam"),
                new TreeItem<>("James"),
                new TreeItem<>("Sara")
        );
        TreeItem<String> classTwo = new TreeItem<>("Class Two");
        classTwo.getChildren().addAll(
          new TreeItem<>("Peter"),
          new TreeItem<>("Abigail"),
          new TreeItem<>("Gisele")
        );
        classTwo.addEventHandler(TreeItem.branchExpandedEvent(), e -> System.out.println(e.getTreeItem().getValue()));
    /*    treeView.setCellFactory(tCell ->{
            TreeCell<String> cell = new TreeCell<>(){
                @Override
                public void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);
                    setText(null);
                    setGraphic(null);
                    if(!empty){
                        if(this.getTreeItem().getValue().equals("Patrick")){
                            setText(item);
                            setGraphic(new Rectangle(15,15,Color.BLUE));
                        }
                        else{
                            setText(item);
                            setGraphic(new Rectangle(15,15,Color.VIOLET));
                        }
                    }
                }
            };
            return cell;
        });

     */

        classes.getChildren().addAll(classOne,classTwo);
        treeView.setRoot(classes);
        treeView.setShowRoot(false);
        treeView.setOnEditCommit(e ->{
            e.getTreeItem().setValue(e.getNewValue());
        });
        root.getChildren().addAll(treeView);

        Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("TreeView Control Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
