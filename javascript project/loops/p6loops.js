// for loop
var brands = ['bisleri', 'aqua', 'kingfisher', 'kinley',]
for (var i = 0; i < brands.length; i++) {
    console.log('brands :', brands[i])
}


// for of loop
var brands1 = ['bisleri', 'aqua', 'kingfisher', 'kinley']
for (var i of brands1) {
    console.log('brands :', i)
}

//for in loop:array
var brands2 = ['bisleri', 'aqua', 'kingfisher', 'kinley',]
for (var i in brands2) {
    console.log('brands :', brands2[i])
}

// for in loop:object
var person = {
    name: 'abc',
    age: 20,
    color: 'white',
}
for (var i in person) {
    console.log('value :', person[i])
}

// forEach method of array
var brands3 = ['bisleri', 'aqua', 'kingfisher', 'kinley',]
brands3.forEach(function (value, index) {
    console.log(value)
})

var item = [
    {
        name: 'abc',
        age: 20,
        color: 'white',
    },
    {
        name: 'xyz',
        age: 30,
        color: 'black',
    },
    {
        name: 'pqr',
        age: 40,
        color: 'white',
    },
]
item.forEach(function (value, index) {
    console.log('value :', value)
    console.log('index :', index)
})



