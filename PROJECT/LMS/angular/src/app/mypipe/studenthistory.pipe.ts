import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'studenthistory'
})
export class StudenthistoryPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return null;
  }

}
