class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int continuousAttack=0, monster=0, hp=health;
        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            if(i==attacks[monster][0]){
                hp -= attacks[monster][1];
                continuousAttack = 0;
                monster++;
            }
            else{
                hp+=bandage[1];
                continuousAttack++;
                if(continuousAttack==bandage[0]){
                    hp+=bandage[2];
                    continuousAttack=0;
                }
                if(hp>health) hp=health;
            }
            if(hp<=0) return -1;
        }
        return hp;
    }
}