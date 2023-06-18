package Error_Handling;

import Symbol_Table.SymbolTable;
import utils.BgColors;
import utils.Colors;
import utils.Utils;

import java.util.*;

public class SemanticCheck {


    public String errorInLine = " Error in Line : ";
    public String classNameNotUnique = " Error 400: Class name should be unique \n";

    public String constName;
    public String constMatchWithClassNameMsg() {return " Error 401: Constructor "+constName+" should match with its class name \n";}
    public HashSet classNameNotUniqueLine = new HashSet();


    public SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    List<String> classesName() {
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < this.symbolTable.scopeList.size(); i++) {
            returnList.add(this.symbolTable.scopeList.get(i).name);
        }
        return returnList;
    }

    boolean classesNameUnique() {
        List<String> classesNameList = classesName();
        for (int i = 0; i < classesNameList.size(); i++) {
            for (int j = i + 1; j < classesNameList.size(); j++) {
                if (classesNameList.get(i).equals(classesNameList.get(j))) {
                    classNameNotUniqueLine.add(this.symbolTable.scopeList.get(j).getTokenLine());
                }
            }
        }
        if (classNameNotUniqueLine.size() > 0) {
            return false;
        }
        return true;
    }

    boolean constMatchWithClassName() {
        List<String> classesNameList = classesName();
        for (int i = 0; i < this.symbolTable.scopeList.size(); i++) {
            if(this.symbolTable.scopeList.get(i).scopeList!=null) {
                if (!Objects.equals(this.symbolTable.scopeList.get(i).name, this.symbolTable.scopeList.get(i).scopeList.get(0).name)) {
                    this.constName = this.symbolTable.scopeList.get(i).scopeList.get(0).name;
                }
            }
        }
        return true;
    }

    public boolean check() {
        if (!classesNameUnique()) {
            for (int i = 0; i < classNameNotUniqueLine.size(); i++) {
                Utils.print(Colors.red, BgColors.black, errorInLine + this.classNameNotUniqueLine.stream().sorted().toList().get(i) + "  ");
                Utils.print(Colors.red, BgColors.black, classNameNotUnique);
            }
        }
//        if(!constMatchWithClassName()){
//
//            Utils.print(Colors.red, BgColors.black, constMatchWithClassNameMsg());
//
//        }
        return true;
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
