var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var a = "Ashwini";
console.log(a);
var b = 20;
console.log(20);
var c;
console.log(c);
var d;
d = "sdfsdfs";
d = 2343434;
console.log(d);
var e = function () {
    console.log("hi");
};
e();
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
        name = "bd";
    }
    return person;
}());
var details = new person("Madhu", 22);
console.log(details);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rno) {
        var _this = _super.call(this, name, age) || this;
        _this.rno = rno;
        return _this;
    }
    return student;
}(person));
var sdetails = new student("Acchu", 21, 120);
console.log(sdetails);
