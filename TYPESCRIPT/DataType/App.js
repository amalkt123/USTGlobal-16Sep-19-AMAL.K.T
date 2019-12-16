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
console.log("WAY_1 DATATYPE");
var myName = 'ABC';
console.log(myName, typeof myName);
console.log("WAY_2 DATATYPE");
var num;
console.log(num, typeof num);
console.log("WAY_3 DATATYPE");
var num1 = 29;
console.log(num, typeof num);
console.log("WAY_4 DATATYPE");
var address;
console.log(address, typeof address);
address = "XYZ";
console.log(address, typeof address);
address = 22;
console.log(address, typeof address);
var calAge = function () {
    console.log("Age_is_29");
};
calAge();
console.log("Its for Class & inhertance");
var SuperClass = /** @class */ (function () {
    function SuperClass(name, age) {
        this.name = name;
        this.age = age;
        //console.log();
    }
    return SuperClass;
}());
var supclss = new SuperClass("ABC", 29);
console.log(supclss);
var SubClass = /** @class */ (function (_super) {
    __extends(SubClass, _super);
    function SubClass(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return SubClass;
}(SuperClass));
var subclss = new SubClass("BCA", 28, 25);
console.log(subclss);
