function gcd ( a : number, b : number ) : number { 
    return a % b == 0  ? b  : gcd(b , a%b)
}