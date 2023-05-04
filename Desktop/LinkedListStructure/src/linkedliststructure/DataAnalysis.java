package LinkedListStructure;

public class DataAnalysis<E extends Comparable> {

    private Queue<E> queue = new Queue<>();
    private Stack<E> stack = new Stack<>();
    private E[] data;

    public DataAnalysis(E[] data) {
        this.data = data;
    }

    public boolean bracketEvaluator() {
        for (int x = 0; x < data.length; x++) {
            if ( data[x].equals('(') || data[x].equals('{') || data[x].equals('<')) {
                stack.push((E) data[x]);
            }

            if (data[x].equals(')') || data[x].equals('}') || data[x].equals('>')) {
                queue.enqueue((E) data[x]);
            }
        }
        
        if (stack.getSize() == queue.getSize()) {
            return true;
        }

        return false;
    }
}
