import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'trackbook'
})
export class TrackbookPipe implements PipeTransform {

  transform(books, search:string) {
    if (search === undefined) {
      return books;
    } else{
      return books.filter((value, index, array) => {
        console.log();
         return value.bookBean.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
