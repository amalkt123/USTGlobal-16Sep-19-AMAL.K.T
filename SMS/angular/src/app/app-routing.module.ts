import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './user/login/login.component';
import { HomeComponent } from './user/home/home.component';
import { RegisterComponent } from './user/register/register.component';
import { VendorModule } from './vendor/vendor.module';
import { VendorhomeComponent } from './vendor/vendorhome/vendorhome.component';
import { ViewproductComponent } from './vendor/viewproduct/viewproduct.component';
import { CartComponent } from './vendor/cart/cart.component';
import { OrderComponent } from './vendor/order/order.component';
import { AddproductComponent } from './vendor/addproduct/addproduct.component';
import { OperationComponent } from './vendor/operation/operation.component';


const routes: Routes = [

  {path:"",component:HomeComponent},
  {path:"vendor-home",component:VendorhomeComponent},
  
  {path:"view-product",component:ViewproductComponent},
  {path:"view-cart",component:CartComponent},
  {path:"view-order",component:OrderComponent},
  {path:"add-product",component:AddproductComponent},
  {path:"/view-products",component:OperationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
