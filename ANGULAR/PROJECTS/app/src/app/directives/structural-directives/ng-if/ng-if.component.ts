import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent implements OnInit {
showorHide=false;
  constructor() { 
  setTimeout(() => {
    this.showorHide=true;
  }, 2000);
}

  ngOnInit() {
  }

}
