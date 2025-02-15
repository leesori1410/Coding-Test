import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answerL = new ArrayList<>();
        Map<String, Integer> genresM = new HashMap<>();
        Map<String, List<int[]>> playsM = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            if(genresM.containsKey(genres[i])){
                genresM.put(genres[i], genresM.get(genres[i])+plays[i]);
            }
            else {
                genresM.put(genres[i], plays[i]);
                playsM.put(genres[i], new ArrayList<>());
            }
            playsM.get(genres[i]).add(new int[]{plays[i], i});
        }
        
        List<String> keySet = new ArrayList<>(genresM.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(genresM.get(o2), genresM.get(o1)); 
            }
        });
        for(int i=0; i<keySet.size(); i++){
            List<int[]> playsL = playsM.get(keySet.get(i));
            playsL.sort((a, b) -> Integer.compare(b[0], a[0]));
            for(int j=0; j<playsL.size() && j<2; j++){
                answerL.add(playsL.get(j)[1]);
            }
        }
        int[] answer = new int[answerL.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerL.get(i);
        }
        return answer;
    }
}