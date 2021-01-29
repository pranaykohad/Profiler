import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Alert } from '../model/alert';
import { Employee } from '../model/employee';
import { EmployeeService } from '../service/employee.service';
import { LocalStorageService } from '../service/local-storage.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss'],
})
export class MainComponent implements OnInit {
  employee: Employee;
  alert: Alert;

  constructor(
    private employeeService: EmployeeService,
    private localStoreService: LocalStorageService,
    private router: Router
  ) {
    this.employee = this.localStoreService.getEmployee();
    this.alert = new Alert();
  }

  ngOnInit(): void {
    if (
      this.employee &&
      this.employee.role === 'ADMIN' &&
      !this.employeeService.getLocalUserName()
    ) {
      this.router.navigateByUrl('/');
    } else {
      this.alert.message = 'cool';
      this.alert.type = 'SUCCESS';
    }
  }
}
