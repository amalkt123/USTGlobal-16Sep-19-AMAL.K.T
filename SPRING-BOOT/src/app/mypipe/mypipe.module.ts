import { NgModule, Pipe } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SearchnamePipe } from './searchname.pipe';



@NgModule({
  declarations: [SearchnamePipe],
  imports: [
    CommonModule
  ],
  exports:[SearchnamePipe]
})
export class MypipeModule { }
