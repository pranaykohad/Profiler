import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BASE_URL } from '../app.constant';
import { Project } from '../model/project';

@Injectable({
  providedIn: 'root',
})
export class ProjectService {
  constructor(private httpClient: HttpClient) {}

  getProjectByEmpId(empId: number): Observable<Project> {
    return this.httpClient.get<Project>(`${BASE_URL}project/${empId}`);
  }
}
