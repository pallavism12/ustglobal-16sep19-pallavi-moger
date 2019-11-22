function outerfunction(counter) {
    function innerFunction() {
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction
}

let innerFn = outerfunction(20)
let counter = innerFn()
console.log(counter)