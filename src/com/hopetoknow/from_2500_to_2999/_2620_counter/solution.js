/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let current = n;

    return function() {
        return current++;
    };
};

var createCounter2 = function(n) {
    return function() {
        return n++;
    };
};

var createCounter3 = function(n) {
    return () => n++;
};

var createCounter4 = (n) => () => n++;

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */