//methods of window
// console.log(window.alert('come here'))

// console.log(window.confirm("go there"))

// console.log(window.prompt("great"))

// console.log(window)
// console.log(this)

// if (window === this) {
// console.log('true')
// }


var per = {
    fna: 'asdd',
    sna: "gjhghj",
    age: 767,
    getname: function () {
        console.log(this)
        return this.fna + '' + this.sna;
    }
}

var full = per.getname();
console.log(full)




