function solution(n) {
    let bigN = n+1;
    let bitN = n.toString(2);
    let cntBitN = 0;
    for(var i of bitN)
        if(i==='1')
            cntBitN++;
    while(true){
        let bitBigN = bigN.toString(2);
        let cntBitBigN = 0;
        for(var i of bitBigN)
            if(i==='1')
                cntBitBigN++;
        if(cntBitN === cntBitBigN)
            return bigN;
        bigN++;
    }
}