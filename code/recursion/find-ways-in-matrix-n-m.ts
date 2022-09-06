function count(n : number , m : number ) : number{
    if ( n == 1 ||m == 1 ) return   1;
    return count(n-1 ,  m) + count(n , m-1)
}