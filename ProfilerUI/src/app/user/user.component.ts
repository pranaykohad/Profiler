import { Component, Input, OnInit } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss'],
})
export class UserComponent implements OnInit {
  @Input() employee: Employee;
  constructor() {}

  ngOnInit(): void {}
}
