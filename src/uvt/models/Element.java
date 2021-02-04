package uvt.models;

public interface Element {
    public void print();
    public void accept(Visitor v);
    void setNewValue(String newValue);
}