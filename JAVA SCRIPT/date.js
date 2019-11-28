var toDate=new Date();

//date class methods
console.log("todays date =",toDate);

console.log("day = ",toDate.getDay());

console.log('year = ',toDate.getFullYear());

console.log("month = ",toDate.getMonth()+1);

console.log("date = ",toDate.getDate());
//date class constructors

var constMilli = new Date(0);
console.log('date = ',constMilli);

var constString=  new Date("jan10");//Jan 20//feb 10 2017
console.log("date string constructor = ",constString);

var constYear=new  Date(2017,10);
console.log("date year constructor =",constYear);