let product=[{
    item :'phonecover',
    price:2000,
},
{
    item:'sunglass',
    price:1000,
},
{
    item:'torch',
    price:800,
},
{
    item:'bulb',
    price:500,
},
{
    item:'watch',
    price:1200,
},
{
    item:'bag',
    price:500,
},
{
    item:'pants',
    price:700,
},
{
    item:'speaker',
    price:1300,
},
{
    item:'laptop',
    price:40000,
},
{
    item:'bottle',
    price:100,
},
{
    item:'spectacles',
    price:1400,
 }];



const arr=  product.map(value=>{
    const container={};
      container.item=value.item;
      container.id=value.id;
      container.price=value.price+ 300;
      return container;

  })
  console.log("======================new array===============")
  console.log(arr);

  console.log("=================old Array====================")
  console.log(product)

  const filt=  product.filter(value=>{
    
      if(value.price>1000)
      console.log(value);
  
  })