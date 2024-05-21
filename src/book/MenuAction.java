package book;

public interface MenuAction {

    String getName();

    void execute() throws IndexOutOfBoundsException;

    boolean closeAfter();

}
