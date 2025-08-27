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

var createCounter5 = function(n) {
    class Counter {
        constructor(start) {
            this.value = start;
        }

        next() {
            return this.value++;
        }
    }

    const counter = new Counter(n);
    return () => counter.next();

    // return function() {
    //     return counter.next();
    // };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */