import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchlibrarian'
})
export class SearchlibrarianPipe implements PipeTransform {

  transform(librarians, search:string) {
    if (search === undefined) {
      return librarians;
    } else{
      return librarians.filter((value, index, array) => {
        return value.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
