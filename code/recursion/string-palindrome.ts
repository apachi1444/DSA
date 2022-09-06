function isPalindrome(s : string , l : number , r  : number) : boolean {
    if ( l >= r) return true;
    if ( s[l] != s[r] ) return false;
    return isPalindrome(s , l+1 , r-1)
}