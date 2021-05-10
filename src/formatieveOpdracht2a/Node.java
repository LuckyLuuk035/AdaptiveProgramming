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
            //System.out.println(aPath.name);
            return aPath;}
        else if (next == 'B') {
            //System.out.println(bPath.name);
            return bPath;}
        return null;
    }
}