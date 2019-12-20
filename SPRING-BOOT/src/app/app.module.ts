import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MypipeModule } from './mypipe/mypipe.module';
import { UserModule } from './user/user.module';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { VendorModule } from './vendor/vendor.module';
import { HttpClientModule } from '@angular/common/http';
import { AddproductComponent } from './addproduct/addproduct.component';

@NgModule({
  declarations: [
    AppComponent,
    AddproductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MypipeModule,
    UserModule,
    AngularFontAwesomeModule,
    VendorModule,
    HttpClientModule,

    
   
  ],
  exports:[],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
