import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';

@Component({
  selector: 'app-adminlibrarianview',
  templateUrl: './adminlibrarianview.component.html',
  styleUrls: ['./adminlibrarianview.component.css']
})
export class AdminlibrarianviewComponent implements OnInit {
  librarians;
  selectedlibrarian;
  search;
  libs;
  constructor(private service: AdminService) {
    this.viewLibrarian();
   }

  viewLibrarian(){
    this.service.viewLibrarian().subscribe((data)=>{this.librarians=data.librarianBeans;
    console.log(data);},(err)=>{console.log(err)});
   
  }
  selectedLibrarian(librarian){
    this.selectedlibrarian=librarian;
    console.log(this.selectedlibrarian);
  }
  
  deleteLibrarian(selectedlibrarian){
    this.service.deleteLibrarian(selectedlibrarian.lid);
  }

  ngOnInit() {
  }

}
