type MultiDimensionalArray = (number | MultiDimensionalArray)[];

var flat = function (arr:  MultiDimensionalArray, n: number):  MultiDimensionalArray {
    
    if (n === 0) {
        return arr;
    }
    
    let result = [];

    arr.forEach(element => {
        if (n > 0 && Array.isArray(element)) {
            result.push(...flat(element, n - 1));
        } else {
            result.push(element);
        }
    });

    return result;
}
