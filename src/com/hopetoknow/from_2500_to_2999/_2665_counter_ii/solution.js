/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    class Counter {
        constructor(start) {
            this.value = start;
            this.init = start;
        }

        increment() {
            return ++this.value;
        }

        decrement() {
            return --this.value;
        }

        reset() {
            this.value = this.init;
            return this.value;
        }
    }

    return new Counter(init);
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */