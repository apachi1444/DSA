const generateAllRows = function (numberRows) {
  if (numberRows == 0) return [];
  if (numberRows == 1) return [[1]];

  const triangle = [[1]];
  for (let i = 1; i < numberRows; i++) {
    let previousRow = triangle[i - 1];
    let currentRow = [1];

    for (let j = 1; j < previousRow.length; j++) {
      currentRow[j] = previousRow[j - 1] + previousRow[j];
    }

    currentRow.push(1);

    triangle.push(currentRow);
  }

  return triangle;
};

console.log(generateAllRows(5));
