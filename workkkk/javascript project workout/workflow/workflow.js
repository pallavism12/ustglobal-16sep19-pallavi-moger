function first(callback) {
    setTimeout(function () {
        console.log('first function executed')
        callback();
    }, 1000
    )
}

function second() {
    console.log('second function executed')
}
first(second);

