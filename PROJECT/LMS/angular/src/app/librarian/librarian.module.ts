import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';


import { AddbookComponent } from './addbook/addbook.component';
import { ViewbookComponent } from './viewbook/viewbook.component';
import { VerfystudentComponent } from './verfystudent/verfystudent.component';
import { ViewstudentComponent } from './viewstudent/viewstudent.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { LibrarianhomeComponent } from './librarianhome/librarianhome.component';
import { TrackbookComponent } from './trackbook/trackbook.component';
import { MypipeModule } from '../mypipe/mypipe.module';



@NgModule({
  declarations: [ AddbookComponent, ViewbookComponent, VerfystudentComponent, ViewstudentComponent,TrackbookComponent,
    LibrarianhomeComponent, IssuebookComponent, TrackbookComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MypipeModule
  ],
  exports: [AddbookComponent, VerfystudentComponent,TrackbookComponent,
     ViewstudentComponent,  ViewbookComponent,LibrarianhomeComponent,IssuebookComponent]
})
export class LibrarianModule { }
