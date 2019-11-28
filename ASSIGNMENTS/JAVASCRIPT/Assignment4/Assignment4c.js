console.log("--------------for in loop----------------------")



var country={
    name:"india",
type:"democracy"
};
var students=new Array("ram","rave","praveeen","ashok","raju");
var color=["red","","green","yellow"];
color["black"]="black";
var car=["nano","i20","i10"];
var number=[1,"two",3,"four"];
var days=new Array("sunday","monday","tuesday","wenesday");
var month={1:"jan",2:"feb",3:"march",4:"april",five:"may"};
var year=[1991,1992,1993,1994,1995,1996];
var course={
   be:"graduate",
   me:"master",
   bsc:"graduate",
   msc:"master",
   metech:""
}

for(var con in students)
{
    console.log(students[con]);
}

for(var con in color)
{
    console.log(color[con]);
}

for(var con in car)
{
    console.log(car[con]);
}
for(var con in number)
{
    console.log(number[con]);
}
for(var con in days)
{
    console.log(days[con]);
}

for(var con in month)
{
    console.log(month[con]);
}

for(var con in year)
{
    console.log(year[con]);
}

for(var con in students)
{
    console.log(students[con]);
}
for(var con in course)
{
    console.log(course[con]);
}