/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const ans = []

    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i)) {
            ans.push(arr[i])
        }
    }

    return ans;
};

var filter2 = function(arr, fn) {
    let filteredIndex = 0;

    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i)) {
            if (i !== filteredIndex) {
                arr[filteredIndex] += arr[i];
                arr[i] = arr[filteredIndex] - arr[i];
                arr[filteredIndex] -= arr[i]
           }

            filteredIndex++;
        }
    }

    arr.length = filteredIndex;
    return arr;
}
