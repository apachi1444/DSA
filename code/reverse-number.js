function reverse(a) {
    var lastDigit = a % 10;
    var finalResult = lastDigit;
    while ((a / 10) != 0) {
        a = a / 10;
        lastDigit = a % 10;
        finalResult = lastDigit * 10 + finalResult;
    }
    return finalResult;
}
console.log(reverse(15));
