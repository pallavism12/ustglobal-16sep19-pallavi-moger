let v1 = document.getElementById('demo')
console.log(v1)
console.log(v1.textContent = 'I am not here')
let bt = document.createElement('button')
console.log(bt)

bt.textContent = 'Iam button'

document.body.append(bt)


let ol = document.createElement('ol')
let li1 = document.createElement('li')
let li2 = document.createElement('li')
let li3 = document.createElement('li')
let li4 = document.createElement('li')
let li5 = document.createElement('li')




li1.textContent = 'a';
li2.textContent = 'b';
li3.textContent = 'c';
li4.textContent = 'd';
li5.textContent = 'e';

ol.appendChild(li1)
ol.appendChild(li2)
ol.appendChild(li3)
ol.appendChild(li4)
ol.appendChild(li5)

document.body.appendChild(ol)

function showMessage() {
    alert('I am tired')
}

function ChangeColor() {
    let cl = document.getElementById('mover')
    cl.style.color = 'red'
}

function printHello() {
    console.log("hello")
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}

