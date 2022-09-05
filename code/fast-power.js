function fastPower(a, b) {
    var res = 1;
    while (b > 0) {
        if ((b & 1) != 0) {
            res = res * a;
        }
        a = a * a;
        b = b >> 1; // same as b / 2
    }
    return res;
}
console.log(fastPower(12, 5));
