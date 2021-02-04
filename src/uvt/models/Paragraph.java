package uvt.models;

import services.AlignStrategy;

import java.util.Vector;

public class Paragraph implements Element,Observable{
    public String text;
    AlignStrategy a;
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public Paragraph(String s) {
        text = s;
    }
    public void setAlignStrategy(AlignStrategy a){
        this.a=a;
    }
    public void print(){
        if(a == null){
            System.out.println(text);
        }
        else {
            a.render(this, null);
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Paragraph: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Paragraph: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Paragraph: A fost sters " + obs);

    }

    public void notifyObservers() {
        System.out.println("Notificare Paragraph");
    }
}