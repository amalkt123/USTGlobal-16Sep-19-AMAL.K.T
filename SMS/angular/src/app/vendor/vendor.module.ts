import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewproductComponent } from './viewproduct/viewproduct.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { VendorhomeComponent } from './vendorhome/vendorhome.component';
import { AppRoutingModule } from '../app-routing.module';
import { AddproductComponent } from './addproduct/addproduct.component';
import { UserModule } from '../user/user.module';
import { MypipeModule } from '../mypipe/mypipe.module';
import { CartComponent } from './cart/cart.component';
import { OrderComponent } from './order/order.component';
import { OperationComponent } from './operation/operation.component';



@NgModule({
  declarations: [ ViewproductComponent, VendorhomeComponent, AddproductComponent, CartComponent, OrderComponent, OperationComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MypipeModule
  ],
  exports:[VendorhomeComponent,ViewproductComponent,CartComponent,OrderComponent,OperationComponent]
})
export class VendorModule { }
