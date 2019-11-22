// work flow
/* function first() {
   setTimeout(function () {
       console.log('first function executed')

   }, 0)
}

function second() {
   console.log("second function exwcuted")
}
first()
second() */

/* function first1() {
    setTimeout(function () {
        console.log("first function executed")
    }, 0)
    console.log("executed")
}
function second1() {
    console.log("second function exwcuted")
}
first1()
second1() */


// call back function
function first3(callback) {
    setTimeout(function () {
        console.log("first function executed")
        callback();
    }, 0)
}

function second3() {
    console.log("second function executed")
}
first3(second3)