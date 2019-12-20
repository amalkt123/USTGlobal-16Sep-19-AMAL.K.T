import { Component, OnInit } from '@angular/core';
import { VendorModule } from '../vendor.module';
import { VendorService } from 'src/vendor.service';

@Component({
  selector: 'app-operation',
  templateUrl: './operation.component.html',
  styleUrls: ['./operation.component.css']
})
export class OperationComponent implements OnInit {
  products;
updateStatus;
  constructor(private service:VendorService) {
    this.vewProduct();
   }
  vewProduct(){
  this.service.viewProduct().subscribe(data=>{
    this.products=data.productInfoBeans;
  })
  }

deleteBook(product) {
    console.log(product);
    this.service.deleteProduct(product).subscribe(data => {
      console.log(data);
      if (data.message === 'Success') {
        // this.route.navigateByUrl('/');
      }
    }, err => {
      console.log(err);
    });
  }



  productDetails(product) {
    this.updateStatus = product;
  }
  updateProduct(form){
    this.service.updateBook(form.value).subscribe(data => {
      console.log(data.description);
      // this.route.navigate(['/']);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Success');
    });
  }





  ngOnInit() {
  }

}
