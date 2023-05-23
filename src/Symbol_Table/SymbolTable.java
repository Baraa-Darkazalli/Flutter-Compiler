package Symbol_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    HashMap<String,ArrayList<Row>> page=new HashMap<String,ArrayList<Row>>();

    public HashMap<String, ArrayList<Row>> getPage() {
        return page;
    }

    public void setPage(HashMap<String, ArrayList<Row>> page) {
        this.page = page;
    }

    public void print(){}
}
