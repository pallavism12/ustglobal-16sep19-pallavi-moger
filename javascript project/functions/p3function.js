//named functions
function add(num1, num2) {
    console.log('sum :', num1 + num2)
}
add(20, 10)

//method overloading
function add(num1, num2, num3) {
    console.log('sum :', num1 + num2 + num3)
}
add(10, 20, 30)

//expression function
var sub = function (num1, num2) {
    // console.log('sub :', num1 - num2)
    return num1 - num2;
}
var res = sub(20, 10)
console.log('res :', res);

//self invoked function
(function (num1, num2) {
    console.log('mul :', num1 * num2)
})
    (20, 10)
//fat arrow function
var div = (num1, num2) => {
    console.log('div :', num1 / num2)
}

div(10, 2)

//no need of curly braces,when single line
var div1 = (num1, num2) =>
    console.log('div :', num1 / num2)


div1(10, 2)

//no need of paranthesis ,when there is only one parameter
var print = num1 =>
    console.log('print :', num1)

print(10)


//only named function can be called before declaring(named function)
greet('world')
function greet(msg) {
    console.log('hello', msg)
}

//only named function can be called before declaring(expression function)
greet1('world')
var greet1 = function (msg) {
    console.log('hello', msg)
}

//only named function can be called before declaring(self invoked  function)
greet2('world')
    (function (msg) {
        console.log('hello', msg)
    })

//only named function can be called before declaring(fat arrow function)
greet3('world')
var greet3 = (msg) => {
    console.log('hello', msg)
}





