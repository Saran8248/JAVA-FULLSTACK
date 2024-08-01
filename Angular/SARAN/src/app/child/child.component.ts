import { Component } from '@angular/core';
import { ChildService } from '../child.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {

sum1:number;
sum2:number;
constructor(private clack:ChildService){
  this.sum1 = clack.getaddition(20,40);
  this.sum2 = clack.getsubraction(50,45);
}

}
