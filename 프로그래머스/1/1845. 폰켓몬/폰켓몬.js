function solution(nums) {
    var answer = 0;
    nums.sort();
    count=1;
    for(n=1; n<nums.length; n++){
        m = n-1;
        if(nums[m] !== nums[n])
            count++;
    }
    if(count>nums.length/2)
        answer = nums.length/2;
    else
        answer = count;
    return answer;
}