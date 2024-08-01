import { Employee } from './model/employee';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee : Employee;

  constructor(){
    this.employee = new Employee();
  }

  insertEmpolyee(data: any){

    this.employee.empId = data.empId;
    this.employee.empName = data.empname;
    this.employee.empSalary = data.empSalary;
  }
}
