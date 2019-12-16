var forr = (arry)=>{
    console.log("------  IT'S FOR 'FORLOOP'  ------ ");
    for(var i=0;i<arry.length; i++)
      console.log("ARRAY VALUES : ", arry[i]);
}
var forof = (arry)=>{
    console.log("------  IT'S FOR 'FOR-OF-LOOP'  ------");
       for(var element of arry)
    {
        console.log('VALUES : ',element);
    }
}
var forreach = (arry)=>
{
    console.log("------  IT'S FOR 'FOR-EACH METHOD'  ------");
    arry.forEach(values => {
       console.log('Elements : ',values); 
    });
}

var  games= ['Cricket', 'Football', 'Kabaddi', 'Volleyball']; 
var  players = ['Sachin Tendulkar_10','Virat Kohli_18',,'MS Dhoni_7','Yuvraj Singh_12'];
var  places = ['Taj Mahal','Red Fort','Hawa Mahal'];
var  dam = ['Tehri Dam','Bhakra Dam','Sardar Sarovar Dam','Hirakud Dam','NagarjunaSagar Dam '];
var  days = ['Sun','Mon','Tus','Wed'];
var  month = ['Jan','Feb','Mar','Apr'];
var  country = ['India','South Africa'];
var primeNo = [2, 3, 5, 7, 11, 13];
var no = [1234,4321,2345,5432];
var fNo = [22.33,33.44,44.55, ,55.66,66.77];
var ary = [
    {
        item : 'abc',
        id   : 01,
        price: 123,
    },
    {
        item : 'bca',
        id   : 02,
        price: 1234,
    },
    {
        item : 'cab',
        id   : 03,
        price: 12345,
    },
    {
        item : 'xyz',
        id   : 04,
        price: 123456,
    },
    {
        item  : 'yzx',
        id    :    05,
        price : 1234567,
    }
];
var arry1 = [games,players,places,dam,days,month,country,primeNo,no,fNo,ary];
console.log();
for(var key in arry1)
{
    forr(arry1[key]);   
    forof(arry1[key]);
    forreach(arry1[key]);
}
