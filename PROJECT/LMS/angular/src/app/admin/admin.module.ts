import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { AdminstuentviewComponent } from './adminstuentview/adminstuentview.component';
import { AdminlibrarianviewComponent } from './adminlibrarianview/adminlibrarianview.component';
import { AdminlibrarianaddComponent } from './adminlibrarianadd/adminlibrarianadd.component';
import { AdminviewbookComponent } from './adminviewbook/adminviewbook.component';
import { AdmintrackbookComponent } from './admintrackbook/admintrackbook.component';
import { MypipeModule } from '../mypipe/mypipe.module';




@NgModule({
  declarations: [ AdminhomeComponent,AdminstuentviewComponent, AdminlibrarianviewComponent, AdminlibrarianaddComponent,
     AdminviewbookComponent,
     AdmintrackbookComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MypipeModule,
  ],
  exports: [AdminhomeComponent,AdminstuentviewComponent,AdminlibrarianviewComponent,AdminlibrarianaddComponent,AdminviewbookComponent,
  ]
})
export class AdminModule { }
