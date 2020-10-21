package uvt;


public class Image  implements Element{
    String imageName;
    public Image(String s){
        imageName=s;
    }
    public void print(){
        System.out.println("Image with name: "+imageName);
    }
}
