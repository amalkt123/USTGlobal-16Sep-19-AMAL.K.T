import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { StudentbookComponent } from './studentbook/studentbook.component';
import { StudentprofileComponent } from './studentprofile/studentprofile.component';
import { CartComponent } from './cart/cart.component';
import { StudenthomeComponent } from './studenthome/studenthome.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { StudenthistoryComponent } from './studenthistory/studenthistory.component';
import { AppModule } from '../app.module';
import { MypipeModule } from '../mypipe/mypipe.module';




@NgModule({
  declarations: [StudentbookComponent, StudentprofileComponent, CartComponent, StudenthomeComponent,
     StudentregisterComponent, StudenthistoryComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MypipeModule,
  ],
  exports: [StudentprofileComponent, StudentbookComponent, CartComponent,StudenthomeComponent,StudentregisterComponent]
})
export class StudentModule { }
