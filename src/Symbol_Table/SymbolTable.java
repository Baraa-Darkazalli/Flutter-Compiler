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
/*               ERROR STATE
 * 1- class name should be unique
 * 2- construct name should be like class name
 * 3- variables used in page should declare before
 * 4- variables name is unique in the scope
 * 5- functions name is unique in the scope
 * 6- the assignment value to a variable should be the same data type of variable
 * 7- the return value of function should be the same data type of function
 *
 *
 *
 */
