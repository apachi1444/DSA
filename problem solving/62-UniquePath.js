const uniquePath = function (n, m) {
  const table = Array.from({ length: n }, () => new Array(m));

  // we should always think of a grid or a table in this kind of problems

  // here we will do the initialization of the first line and the first column

  for (let i = 0; i < table.length; i++) {
    table[i][0] = 1;
  }

  for (let i = 0; i < table.length; i++) {
    table[0][i] = 1;
  }

  // here we will do the sum of each element to determine the final position of the table ( n-1 and m-1)
  for (let i = 1; i < table.length; i++) {
    for (let j = 1; j < table[i].length; j++) {
      table[i][j] = table[i - 1][j] + table[i][j - 1];
    }
  }

  return table[n - 1][m - 1];
};

console.log(uniquePath(2, 3));
