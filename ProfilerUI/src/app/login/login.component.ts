import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../model/employee';
import { EmployeeService } from '../service/employee.service';
import { LocalStorageService } from '../service/local-storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent implements OnInit {
  employee: Employee;
  wrongCred = false;
  errorMsg = 'Wrong Credentials';

  constructor(
    private router: Router,
    private empService: EmployeeService,
    private localStorageService: LocalStorageService
  ) {
    this.employee = new Employee();
    this.localStorageService.resetLocalStorage();
  }

  ngOnInit(): void {}

  login() {
    this.empService.authenticateUser(this.employee).subscribe((res) => {
      if (!res['data']) {
        this.wrongCred = true;
        setTimeout(() => {
          this.wrongCred = false;
        }, 5000);
      } else {
        this.localStorageService.setEmployee(res['data']);
        this.router.navigateByUrl('/main');
      }
    });
  }
}
