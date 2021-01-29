import { Injectable } from '@angular/core';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root',
})
export class LocalStorageService {
  setEmployee(employee: Employee) {
    localStorage.setItem('EMP', JSON.stringify(employee));
  }

  getEmployee(): Employee {
    return JSON.parse(localStorage.getItem('EMP'));
  }

  resetLocalStorage() {
    localStorage.clear();
  }
}
