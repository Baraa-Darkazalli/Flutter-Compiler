package Symbol_Table;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    public String name;
    public List<RowTable> rowTableList=new ArrayList<>();
    public List<Scope> scopeList=new ArrayList<>();

    public Scope(String name,List<RowTable> rowTableList, List<Scope> scopeList) {
        this.name = name;
        this.rowTableList=rowTableList;
        this.scopeList = scopeList;
    }

    public Scope(String name,List<RowTable> rowTableList) {
        this.name = name;
        this.rowTableList=rowTableList;
    }

    public Scope() {

    }

    public List<RowTable> getRowTableList() {
        return rowTableList;
    }

    public void setRowTableList(List<RowTable> rowTableList) {
        this.rowTableList = rowTableList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Scope> getScopeList() {
        return scopeList;
    }

    public void setScopeList(Scope scopeList) {
        this.scopeList.add(scopeList);
    }

    public void print() {
        System.out.println("\tScope name : " + this.name);
        for (int i = 0; i < this.rowTableList.size(); i++) {
            if (this.rowTableList.get(i) != null) {
                System.out.println(this.rowTableList.get(i).dataType + "\t" + this.rowTableList.get(i).name + "\t" + this.rowTableList.get(i).value + "\t");
            }
        }
        for (int i = 0; i < this.scopeList.size(); i++) {
            if(this.scopeList.get(i)!=null){
                this.scopeList.get(i).print();
            }
        }
    }
}
