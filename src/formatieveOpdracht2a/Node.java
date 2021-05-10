package formatieveOpdracht2a;

public class Node {
    String name;
    Node aPath;
    Node bPath;


    public Node(String name){
        this.name = name;
    }

    public void setAPath(Node aPath) {
        this.aPath = aPath;
    }

    public void setBPath(Node bPath) {
        this.bPath = bPath;
    }

    public Node getNext(char next) {
        if (next == 'A') {
            return aPath;}
        else if (next == 'B') {
            return bPath;}
        return null;
    }
}