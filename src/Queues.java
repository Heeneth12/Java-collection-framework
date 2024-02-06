
class Qnode {
    int data;
    Qnode ref;

    public Qnode(int data) {

        this.data = data;
        this.ref = null;
    }

}

class LL {
    Qnode top;

    public void adding(int data) {
        Qnode newnode = new Qnode(data);

        if (top == null) {
            top = newnode;
        }

    }

}

public class Queues {

}