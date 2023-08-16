function filter(arr: number[], fn: (n: number, i: number) => any): number[] {
    let filteredArray = [];

    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i)) {
            filteredArray.push(arr[i]);
        }
    }
    return filteredArray;
};
