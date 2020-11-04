package uvt;

import javax.naming.Context;

public class AlignCenter implements AlignStrategy{

    public void render(Paragraph p, Context c) {
        System.out.println("+++++"+p.text+"+++++");
    }
}
