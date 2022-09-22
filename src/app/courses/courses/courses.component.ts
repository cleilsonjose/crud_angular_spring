import { Component, OnInit } from '@angular/core';
import { Course } from '../model/course';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courses: Course[] = [
    {
      _id:'1',
      name: "Angular",
      category :"Fontend"
    },
    {
      _id:'2',
      name: "Java",
      category :"Backend"
    },
    {
      _id:'3',
      name: "SpringBoot",
      category :"Backend"
    },
  ];
  displayedColumns = ['name','category'];

  constructor() { 
    //this.courses = [];
  }

  ngOnInit(): void {
  }

}
