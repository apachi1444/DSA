function bubbleSorting(a : number[]){
    for ( let i = 0; i < a.length - 1; i++){
        let swapped : boolean = false
        for ( let j = 0; j < a.length - i - 1; j++ ){
            if ( a[j+1] < a[j]){
                swap(a[i], a[j])
            }
        }
        if (!swapped) {
            break;
        }
    }
}

function swap( a : number, b : number){

}