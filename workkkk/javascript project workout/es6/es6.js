const message = new Promise(function (resolve, reject) {
    if (50 > 40) {
        resolve('success')
    }
    else {
        reject('failure')
    }
})
message.then(function (msg) {
    console.log('success msg', msg)
}).catch(function (error) {
    console.log("failure messag", error)
})