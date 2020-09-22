package com.example.pivottable.model;

/**
 * TableElement class is the pojo class for getting data from db and sending it to the user.
 */
public class TableElement {

    private String row;
    private String col;
    private String val;

    public TableElement() {
    }

    public TableElement(String row, String col, String val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

}
