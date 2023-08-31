type Obj = Record<any, any>;

function compactObject(obj: Obj): Obj {
    if (Array.isArray(obj)) {
        return obj.reduce((acc, cur) => {
            let value = compactObject(cur);

            if (value) {
                acc.push(value);
            }
            
            return acc;
        }, [])
    }

    if (typeof obj === 'object' && obj !== null) {
        return Object.keys(obj).reduce((acc, key) => {
            let value = compactObject(obj[key]);

            if (value) {
                acc[key] = value;
            }
            
            return acc
        }, {});
    }

    return obj || null;
};
