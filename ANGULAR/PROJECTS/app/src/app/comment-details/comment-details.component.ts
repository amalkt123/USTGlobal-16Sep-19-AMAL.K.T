import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comment-details',
  templateUrl: './comment-details.component.html',
  styleUrls: ['./comment-details.component.css']
})
export class CommentDetailsComponent implements OnInit {
Comments:any[]=[];
  constructor() { }
  getAllComment(childData){
    console.log("child data",childData);
    this.Comments.push(childData);

  }

  ngOnInit() {
  }

}
