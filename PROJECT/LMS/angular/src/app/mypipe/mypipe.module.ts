import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StudentbookPipe } from './studentbook.pipe';
import { TrackbookPipe } from './trackbook.pipe';
import { StudenthistoryPipe } from './studenthistory.pipe';
import { SearchlibrarianPipe } from './searchlibrarian.pipe';
import { SearchstudentPipe } from './searchstudent.pipe';



@NgModule({
  declarations: [StudentbookPipe, TrackbookPipe, StudenthistoryPipe, SearchlibrarianPipe, SearchstudentPipe],
  imports: [
    CommonModule
  ],
  exports:[StudentbookPipe,TrackbookPipe,SearchstudentPipe]
})
export class MypipeModule { }
