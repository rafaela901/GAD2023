package DesignPatterns3.visitor;

public interface Visitor {
    public void visit(Book book);
    public void visit(Song book);
    public void visit(Film book);

}
