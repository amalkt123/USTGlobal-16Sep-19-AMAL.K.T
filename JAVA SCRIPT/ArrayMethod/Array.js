const hobbies = ['Sleeping','Eating','Roaming'];
console.log('TYPE_OF_ARRAY : ',typeof hobbies);                //RETURN_OBJECT
console.log('FOR ISARRAY : ',Array.isArray(hobbies));          //RETURN_BOOLEAN
console.log('FOR INCLUDES : ',hobbies.includes('Roaming'));    //RETURN_BOOLEAN
console.log('FOR PUSH : ',hobbies.push('ABC'));                //RETURN_NEW_LENGTH
console.log('FOR POP : ',hobbies.pop());                       // RETURN_REMOVE_ELEMENTS
console.log('FOR UNSHIFT : ',hobbies.unshift('NUMISMATICS'));  //RETURN_NEW_LENGTH
console.log('FOR SHIFT : ',hobbies.shift());                   //REMOVED_ELEMENTS
console.log('FOR SPLICE : ',hobbies.splice(1,2,'PUBG'));       //REMOVED_ELEMENTS
console.log('FOR SLICE : ',hobbies.splice(1,3));               //NEW ARRAY
console.log('FOR INDEXOF : ',hobbies.indexOf('Eating'));       //INDEX VALUE IF ELEMENT IS THERE---OR---(-1)
console.log('FOR JOIN :',hobbies.join('_'));                   //STRING
const num = [100,150,200,250]
console.log('FOR "MAP" WITH FAT ARROW FUNCTION : ',num.map((value,INDEX)=>value+50));  //NEW ARRAY
console.log("FOR 'FILTER' WITH FAT ARROW FUNCTION : ",num.filter(value => value>200)); //NEW ARRAY
console.log('OLD_ARRAY : ',num);