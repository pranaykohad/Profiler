import { Component, OnInit } from '@angular/core';
import { Project } from '../model/project';
import { ProjectService } from '../service/project.service';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss'],
})
export class ProjectListComponent implements OnInit {
  today = new Date();
  projectList: Project[];
  constructor(private projectService: ProjectService) {}

  ngOnInit(): void {
    this.projectService.getProjectByEmpId(1).subscribe((res) => {
      if (res['status'] === 'SUCCESS') {
        this.projectList = res['data'];
        console.log(this.projectList);
      }
    });
  }
}
