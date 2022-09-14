const parentheses = function (stringToTest) {
  const stack = [];

  let allCases = "[](){}";

  let i = 0;

  while (i < stringToTest.length) {
    stack.push(stringToTest[i]);
    i++;
    let lastCase = stack[stack.length - 1];
    let beforeLastCase = stack[stack.length - 2];

    let allParentheses = beforeLastCase + lastCase;

    if (allCases.includes(allParentheses)) {
      stack.pop();
      stack.pop();
    }
  }

  return stack.length === 0;
};

console.log(parentheses("(())"));
