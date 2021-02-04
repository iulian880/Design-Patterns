package uvt.models;

public class StatisticsCommand implements Command{

    public void execute(){
        System.out.println("Execute - StatisticsCommand");
        Book b = DocumentManager.getInstance().getBook();

        BookStatistics stats=new BookStatistics();
        b.accept(stats);
        stats.printStatistics();
    }
}