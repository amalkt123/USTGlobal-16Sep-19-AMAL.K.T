import { Component, OnInit } from '@angular/core';
import { VendorService } from 'src/vendor.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
carts;
  constructor(private service:VendorService) { 
    this.viewCart();
  }
  viewCart(){
    this.service.viewCart().subscribe(data=>{
console.log(data);
this.carts=data.carts;
    })

  }

  ngOnInit() {
  }

}
