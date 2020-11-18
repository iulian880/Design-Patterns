package uvt.models;

public class StatisticsCommand implements Command{

    public void execute(){
        System.out.println("Execute - StatisticsCommand");
        DocumentManager.getInstance().getBook();
    }
}
