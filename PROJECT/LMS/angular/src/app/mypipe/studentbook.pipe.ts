import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'studentbook'
})
export class StudentbookPipe implements PipeTransform {
  transform(books, search:string) {
    if (search === undefined) {
      return books;
    } else{
      return books.filter((value, index, array) => {
        return value.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }
}
