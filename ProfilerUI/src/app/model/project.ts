import { Attachment } from './attachment';

export interface IProject {
  projectId: number;
  projectName: string;
  empPosition: string;
  stateDate: string;
  endDate: string;
}
export class Project implements IProject {
  projectId: number;
  projectName: string;
  empPosition: string;
  stateDate: string;
  endDate: string;
}
