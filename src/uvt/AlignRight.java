package uvt;

import javax.naming.Context;

public class AlignRight implements AlignStrategy{

    public void render(Paragraph p, Context c){
        System.out.println("++++++++++"+p.text);
    }
}
