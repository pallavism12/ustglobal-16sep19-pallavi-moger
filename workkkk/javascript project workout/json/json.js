const person = {
    name: 'mikel',
    age: 45,
    address: {
        city: 'udupi',
        state: 'karnataka',
        pincode: '6448784',
    },
    hobbies: ['hfh', 'sghgg', 'sguufhghg']

}

console.log(person)
const jsono = JSON.stringify(person)
console.log(jsono)
const jso = JSON.parse(jsono)
console.log(jso)

localStorage.setItem('email', "abjhfD@GMAIL.com")
const eid = localStorage.getItem('email')
console.log(eid)

