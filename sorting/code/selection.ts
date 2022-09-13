// taking the min and put in front of the array
function f1(a: number[]) {
    for ( let i = 0; i < a.length; i++ ) {
        let min = i 
        for ( let j = i+1; j < a.length; j++ ) {
            if (a[j] < a[min]) {
                  min = j
            }
        }
        if (min != i){
            swap(a[min] , a[i])
        }
    }

}



