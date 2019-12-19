import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { UserhomeComponent } from './userhome/userhome.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';



@NgModule({
  declarations: [HeaderComponent, LoginComponent, FooterComponent, UserhomeComponent, ChangepasswordComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  exports:
   [HeaderComponent, LoginComponent, FooterComponent,UserhomeComponent]
})
export class UserModule { }
