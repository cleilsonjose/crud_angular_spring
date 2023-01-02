import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(value: string): string {
    if(value === 'Frontend'){
      return 'code'
    }else if(value === 'Backend'){
      return 'computer'
    }else{
      return 'null';
    }
  }

}
