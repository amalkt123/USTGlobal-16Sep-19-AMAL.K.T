import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserModule } from './user/user.module';
import { AdminModule } from './admin/admin.module';
import { StudentModule } from './student/student.module';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LibrarianModule } from './librarian/librarian.module';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UserModule,
    AdminModule,
    StudentModule,
    LibrarianModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  exports:[],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
