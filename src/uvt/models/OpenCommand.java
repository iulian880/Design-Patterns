package uvt.models;

public class OpenCommand implements Command {

    public OpenCommand(String s) {
        new Book(s);
    }

    public void execute(){
        System.out.println("Execute - OpenCommand");
        DocumentManager.getInstance().getBook();
    }
}
