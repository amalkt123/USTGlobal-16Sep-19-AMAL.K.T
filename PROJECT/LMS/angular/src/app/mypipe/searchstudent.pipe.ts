import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchstudent'
})
export class SearchstudentPipe implements PipeTransform {

  transform(students, search:string) {
    if (search === undefined) {
      return students;
    } else{
      return students.filter((value, index, array) => {
        return value.studentBean.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }
}
