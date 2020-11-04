package uvt;


public class Paragraph implements Element{
    String text;
    AlignStrategy a;
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
}
