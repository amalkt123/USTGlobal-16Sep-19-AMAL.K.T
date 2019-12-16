const items = [
    {
        item: 'abc',
        id: 01,
        price: 100,
    },
    {
        item: 'bca',
        id: 02,
        price: 1500,
    },
    {
        item: 'cab',
        id: 03,
        price: 2000,
    },
    {
        item: 'xyz',
        id: 04,
        price: 300,
    },
    {
        item: 'yzx',
        id: 05,
        price: 35000,
    }
]
for(ele of items)
//console.log('OldArray : ',ele)

console.log('NewArray : ', items.map((values) =>{
values.price = values.price+100;
// console.log(v.Price);
return values;

}));
console.log('NewArray1 : ', items.filter((values) =>{
 let temp = values.price;
 if(temp>1000)
 {
     return values;
 }
}));
console.log("========================================");
console.log("IT'S FOR ARRAY METODS ");
let afun = arry=> {
    console.log('TYPE_OF_ARRAY : ',typeof arry);                //RETURN_OBJECT
    console.log('FOR ISARRAY : ',Array.isArray(arry));          //RETURN_BOOLEAN
    console.log('FOR INCLUDES : ',arry.includes('REPLACE'));    //RETURN_BOOLEAN
    console.log('FOR PUSH : ',arry.push('REPLACE'));                //RETURN_NEW_LENGTH
    console.log('FOR POP : ',arry.pop());                       // RETURN_REMOVE_ELEMENTS
    console.log('FOR UNSHIFT : ',arry.unshift(0));  //RETURN_NEW_LENGTH
    console.log('FOR SHIFT : ',arry.shift());                   //REMOVED_ELEMENTS
    console.log('FOR SPLICE : ',arry.splice(1,2,'REPALCES'));       //REMOVED_ELEMENTS
    console.log('FOR SLICE : ',arry.splice(1,3));               //NEW ARRAY
    console.log('FOR INDEXOF : ',arry.indexOf('REPLACES'));       //index VALUE IF ELEMENT IS THERE---OR---(-1)
    console.log(arry.unshift('Replace'));
    console.log('FOR JOIN :',arry.join('*'));                   //STRING
    const num = [100,150,200,250]
}
console.log('============================================');
console.log("IT'S FOR STRING MRTHODS");
let sfun = (str)=>{
console.log('LENGTH : ',str.length);   
console.log('Search : ',str.search('S'));
console.log('IndexOf : ',str.indexOf('S',19));
console.log('LastIndex : ',str.lastIndexOf('S',19));
console.log('Slice : ',str.slice(2, 4));
console.log('SubString : ',str.substring(2, 4));
console.log('SubStr : ',str.substr(2, 4));
// console.log();
// console.log();
// console.log();    
}

const games = ['Cricket', 'Football', 'Kabaddi', 'Volleyball'];
const players = ['Sachin Tendulkar_10', 'Virat Kohli_18', 'MS Dhoni_7', 'Yuvraj Singh_12'];
const places = ['Taj Mahal', 'Red Fort', 'Hawa Mahal'];
const dam = ['Tehri Dam', 'Bhakra Dam', 'Sardar Sarovar Dam', 'Hirakud Dam', 'NagarjunaSagar Dam '];
const days = ['Sun', 'Mon', 'Tus', 'Wed'];
const month = ['Jan', 'Feb', 'Mar', 'Apr'];
const country = ['India', 'South Africa'];
const primeNo = [2, 3, 5, 7, 11, 13];
const no = [1234, 4321, 2345, 5432];
const fNo = [22.33, 33.44, 44.55, 55.66, 66.77];                                                                                                                            
var arry1 = [games,players,places,dam,days,month,country,primeNo,no,fNo];
let text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let text1 = "Sachin Tendulkar 10"
let text2 = "Sardar Sarovar Dam";
let text3 = "NagarjunaSagar Dam ";
let text4 = "South Africa";
let text5 = "India";
let text6 = "Football";
let text7 = "Cricket";
let text8 = "Taj Mahal";
let text9 = "Hello World";
let ar = [text,text1,text2,text3,text4,text5,text6,text7,text8,text9];
for(let index1 in ar)
{
    console.log("------------------------------   EX----NUMBER = ",index1,'-----------------------------------')
    sfun(ar[index1]);
}
for(let index in arry1)
{
    console.log("------------------------------   EX----NUMBER = ",index,'-----------------------------------')
    afun(arry1[index]);
}

