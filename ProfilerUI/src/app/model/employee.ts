import { Attachment } from './attachment';

export interface Employee {
  empId: number;
  userName: string;
  password: string;
  careerStart: string;
  careerStartBC: string;
  role: string;
  firstName: string;
  middleName: string;
  lastName: string;
  status: string;
  profile: Attachment;
  projectList: string[];
  skillList: string[];
  requestList: string[];
}
export class Employee implements Employee {
  empId: number;
  userName: string;
  password: string;
  careerStart: string;
  careerStartBC: string;
  role: string;
  firstName: string;
  middleName: string;
  lastName: string;
  status: string;
  profile: Attachment;
  projectList: string[];
  skillList: string[];
  requestList: string[];
}
