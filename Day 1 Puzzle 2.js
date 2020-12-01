// --- Part Two ---
// The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation. They offer you a second one if you can find three numbers in your expense report that meet the same criteria.
//
// Using the above example again, the three entries that sum to 2020 are 979, 366, and 675. Multiplying them together produces the answer, 241861950.
//
// In your expense report, what is the product of the three entries that sum to 2020?

var testInput = [1721,
  979,
  366,
  299,
  675,
  1456];

function findEntriesThatSumTo2020(inputArray) {
  var results = [];
  for (var i = 0; i < inputArray.length; i++) {
    for (var j = 0; j < inputArray.length; j++) {
      for (var k = 0; k < inputArray.length; k++) {
        if (i != j && j != k) {
          if (inputArray[i] + inputArray[j] + inputArray[k] == 2020) {
            results.push(inputArray[i]);
            results.push(inputArray[j]);
            results.push(inputArray[k]);
            return results;
          }
        }
      }
    }
  }
}
