import java.util.Arrays;

public class PriorityQueue {
    private int[] pq;
    private int count = 0;

    public PriorityQueue(int size){
        pq = new int[size];
    }

    public void insert (int item){
        int i;
        if(count == 0){
            pq[count++] = item;
        }
        else if((count != pq.length)){
            for(i = count - 1 ; i >= 0; i--){
                if((pq[i] > item) || (count == 1 )) {
                    pq[i + 1] = pq[i];
                    pq[i] = item;
                }
                else
                    break;

            }
            pq[i + 1] = item;
            count++;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(pq);
    }
}
