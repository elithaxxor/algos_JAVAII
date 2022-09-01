import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> queue;
    private double sum;
    private int maxSize;

        public MovingAverage(int size) {
            queue = new LinkedList<Integer>();
            maxSize = size;
            sum = 0.0;
        }
        public double next(int val) {
            if(queue.size() == maxSize) {
                sum -= queue.remove();
            }
            queue.add(val);
            sum += val;
            return sum / queue.size();
    }
    public static void main(String args[]) { //static method
            MovingAverage run = new MovingAverage(3);
    }
}
