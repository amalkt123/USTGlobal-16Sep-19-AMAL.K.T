import { Component, OnInit } from '@angular/core';
import { VendorService } from 'src/vendor.service';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {
products;
selectedproduct;
message;
  constructor(private service:VendorService) { 
    this.viewProduct();
  }
  viewProduct(){
    this.service.viewProduct().subscribe(data=>{
     this.products=data.productInfoBeans;
     console.log(data)
    });
  }
  selectedProduct(product){
    console.log(product);
    this.selectedproduct=product;

  }
  
  makeRequest(form){
    this.service.addCart(form.form.value).subscribe(data=>{
this.message=data.description;
    });
  
     }

  
  ngOnInit() {
  }

}
