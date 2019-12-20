import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchname'
})
export class SearchnamePipe implements PipeTransform {
  transform(books: User[], search: string): any {
    if (search === undefined) {
      return books;
    } else {
      return books.filter((value, index, array) => {
        return value.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
