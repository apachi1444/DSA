function jose( n : number , k : number ) : number { 
    if ( n == 1){
        return 0 
    }
    return (jose(n-1 , k ) +k ) % n
}