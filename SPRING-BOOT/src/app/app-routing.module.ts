import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './user/login/login.component';
import { HomeComponent } from './user/home/home.component';
import { RegisterComponent } from './user/register/register.component';
import { VendorModule } from './vendor/vendor.module';
import { VendorhomeComponent } from './vendor/vendorhome/vendorhome.component';
import { ViewproductComponent } from './vendor/viewproduct/viewproduct.component';


const routes: Routes = [

  {path:"",component:HomeComponent},
  {path:"vendor-home",component:VendorhomeComponent},
  
  {path:"view-product",component:ViewproductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
