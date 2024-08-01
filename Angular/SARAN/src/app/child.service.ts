import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ChildService {

  constructor() { }

  getaddition(a :number, b: number){
    return a + b;
     }

     getsubraction(a :number, b: number){
      return a - b;
       }
}
