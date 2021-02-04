package uvt.models;

import services.ImageLoaderFactory;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable{
    String url;
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();
    public Image(String u) {
        url = u;
        ImageLoaderFactory.create("JPG");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Image with url: "+url);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Image: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Image: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Image: A fost sters " + obs);

    }
    public void notifyObservers(){
        System.out.println("Notificare Image");
    }
}