/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    for (const key in obj) {
        return false;
    }

    return true;
};

var isEmpty2 = function(obj) {
    return Object.keys(obj).length === 0
};

var isEmpty3 = function(obj) {
    if (Array.isArray(obj)) {
        return obj.length === 0;
    } else {
        return JSON.stringify(obj) === '{}';
    }
};
