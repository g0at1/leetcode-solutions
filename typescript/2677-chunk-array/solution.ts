function chunk(arr: any[], size: number): any[][] {
    let chunkedArray = [];

    for (let i = 0; i < arr.length; i += size) {
        chunkedArray.push(arr.slice(i, i + size));
    }

    return chunkedArray;
};
