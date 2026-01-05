import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    // Initialize counter
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    // Add new request and count recent ones
    public int ping(int t) {
        queue.offer(t);

        // Remove requests older than t - 3000
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}
