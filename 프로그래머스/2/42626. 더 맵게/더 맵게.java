import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovillePQ = new PriorityQueue<>();
        for(int sco : scoville){
            scovillePQ.add(sco);
        }
        while(scovillePQ.size() > 1){
            int sco1 = scovillePQ.poll();
            if (sco1<K){
                scovillePQ.add(sco1+scovillePQ.poll()*2);
                answer++;
            } else{
                return answer;
            }
        }
        return scovillePQ.poll() < K ? -1 : answer;
    }
}