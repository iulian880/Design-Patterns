package uvt.models;

import java.util.Vector;

public class Section implements Element,Visitee,Observable{
    String title;
    Vector<Element> content = new Vector<Element>();
    String value,oldValue;
    Vector<Observer> observers = new Vector<Observer>();

    public Section(String s){
        title=s;
    }
    public void add(Element elm){
        content.add(elm);
    }
    public void remove(Element elm){
        content.remove(elm);
    }

    public void get(int i) {
        content.get(i);
    }

    public Element getElement(int index){

        return content.get(index);
    }
    public void print(){
        System.out.println(this.title);
        for(Element i: content){
            i.print();
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
        for(Element elem:content)
            elem.accept(v);
    }

    public void setNewValue(String newValue) {
        this.oldValue=this.value;
        this.value=newValue;
        System.out.println("Section: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Section: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.removeElement(obs);
        System.out.println("Section: A fost sters "+obs);

    }

    public void notifyObservers() {
        System.out.println("Notificare Section");
    }
}