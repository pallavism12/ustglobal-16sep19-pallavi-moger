//for loop
var hob = ['sleeping', 'dancing', 'singing', 'cooking', 'crafting']
for (var i = 0; i < hob.length; i++) {
    console.log(hob[i])
}

//for in loop
var hob1 = ['sleeping', 'dancing', 'singing', 'cooking', 'crafting']
for (var j in hob1) {
    console.log(hob[j])
}


//for of loop
var hob2 = ['sleeping', 'dancing', 'singing', 'cooking', 'crafting']
for (var k of hob2) {
    console.log(k)
}

//for each
var hob3 = ['sleeping', 'dancing', 'singing', 'cooking', 'crafting']
hob3.forEach(function (val, ind) {
    console.log(val)
})



var emp = [
    {
        name: 'a',
        age: 30,
        price: 1000
    },
    {
        name: 'a',
        age: 30,
        price: 2000
    },
    {
        name: 'a',
        age: 30,
        price: 3000
    },
]

emp.forEach(function (vp, ip) {
    console.log(vp)
})



