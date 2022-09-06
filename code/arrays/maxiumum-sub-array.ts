function maxSubArrayUsingKadaneAlgorithm(a : number[]) : number{

    let maxSum : number = 0
    let curSum : number = 0

    for ( let i = 0; i < a.length; i++ ){
        curSum = curSum + a[i]
        if ( curSum > maxSum ){
            maxSum = curSum
        }

        if ( curSum  < 0){
            curSum = 0
        }
    }
    return maxSum

}