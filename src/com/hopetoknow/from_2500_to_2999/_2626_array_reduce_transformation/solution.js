/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let val = init;

    for (const num of nums) {
        val = fn(val, num);
    }

    return val;
};

var reduce2 = function(nums, fn, init) {
    for (const num of nums) {
        init = fn(init, num);
    }

    return init;
};

var reduce3 = function(nums, fn, init) {
    if (nums.length === 0) {
        return init;
    }

    const head = nums[0];
    const tail = nums.slice(1);
    const val = fn(init, head);

    return reduce3(tail, fn, val);
};
