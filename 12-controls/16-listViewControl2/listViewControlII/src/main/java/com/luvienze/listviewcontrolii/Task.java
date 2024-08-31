package com.luvienze.listviewcontrolii;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Task {

    private SimpleStringProperty task;
    public Task(String task){
        this.task = new SimpleStringProperty(this,"task",task);
    }

    public String getTask(){
        return task.get();
    }

    public StringProperty getTaskProperty(){
        return this.task;
    }

    @Override
    public String toString() {
        return this.task.get();
    }
}

