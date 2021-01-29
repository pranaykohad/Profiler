import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BASE_URL } from '../app.constant';
import { Employee } from '../model/employee';
import { LocalStorageService } from './local-storage.service';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(
    private httpClient: HttpClient,
    private localStorageService: LocalStorageService
  ) {}

  authenticateUser(employee: Employee): Observable<Employee> {
    return this.httpClient.post<Employee>(`${BASE_URL}authenticate`, employee);
  }

  getLocalUserName() {
    const USER = this.localStorageService.getEmployee();
    return USER && USER['userName'].length ? USER['userName'] : null;
  }
}
