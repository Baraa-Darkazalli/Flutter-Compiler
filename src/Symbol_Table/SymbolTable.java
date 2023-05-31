package Symbol_Table;


import java.util.*;

public class SymbolTable {
    public List<Scope> scopeList=new ArrayList<>();

    public List<Scope> getScopeList() {
        return scopeList;
    }

    public void setScopeList(Scope scopeList) {
        this.scopeList.add(scopeList);
    }

    public void print() {
        for (int i = 0; i < this.scopeList.size(); i++) {
            if (this.scopeList.get(i) != null) {
                this.scopeList.get(i).print();
            }
        }
    }


}
