var todayDate = new Date()
console.log('todayDate :', todayDate)
console.log('day :', todayDate.getDay())
console.log('full year :', todayDate.getFullYear())
console.log('month :', todayDate.getMonth())
console.log('date :', todayDate.getDate())

var constMilli = new Date(18000000000)
console.log('date :', constMilli)
var constStr = new Date('dec 10')
console.log('date :', constStr)
var constYear = new Date(2019, 7)
console.log('date :', constYear)
