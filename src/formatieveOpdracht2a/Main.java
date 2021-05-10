package formatieveOpdracht2a;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> f(String input, List<Node> nodeList){
        for(char ch : input.toCharArray()) { nodeList.add(nodeList.get(nodeList.size()-1).getNext(ch));
        }
        List<String> path = new ArrayList<>();
        for(Node nd : nodeList) { path.add(nd.name);
        }
        return path;
    }

    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");



        s0.setAPath(s2);
        s0.setBPath(s1);

        s1.setAPath(s1);
        s1.setBPath(s2);

        s2.setAPath(s2);
        s2.setBPath(s3);

        s3.setAPath(s3);
        s3.setBPath(s0);

        List<Node> nodeList = new ArrayList<>();
        nodeList.add(s0);

        System.out.println(f("BBBA", nodeList));
    }
}

// 