function reverse(a: number) : number{
    let lastDigit = a % 10
    let finalResult = lastDigit
    while (Math.floor(a/10)!= 0){
        a = Math.floor(a / 10);
        lastDigit = a % 10;
        finalResult = finalResult * 10 + lastDigit;
    }
    return finalResult
}

console.log(reverse(123456))