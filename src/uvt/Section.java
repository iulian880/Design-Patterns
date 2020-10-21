package uvt;


import java.util.Vector;

public class Section implements Element{
    String sectionTitle;
    Vector<Element> content = new Vector<>();

    public Section(String s){
        sectionTitle=s;
    }
    public int add(Element elm){
        content.add(elm);
        return content.size();
    }
    public void remove(Element elm){
        content.remove(elm);
    }
    public Element getElement(int index){

        return content.get(index);
    }
    public void print(){
        System.out.println(this.sectionTitle);
        for(Element i: content){
            i.print();
        }
    }
}
