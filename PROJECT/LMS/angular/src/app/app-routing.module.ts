import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './user/login/login.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { LibrarianhomeComponent } from './librarian/librarianhome/librarianhome.component';
import { UserhomeComponent } from './user/userhome/userhome.component';
import { AdminModule } from './admin/admin.module';
import { AdminstuentviewComponent } from './admin/adminstuentview/adminstuentview.component';
import { AdminlibrarianviewComponent } from './admin/adminlibrarianview/adminlibrarianview.component';
import { AdminlibrarianaddComponent } from './admin/adminlibrarianadd/adminlibrarianadd.component';
import { AdminviewbookComponent } from './admin/adminviewbook/adminviewbook.component';
import { CartComponent } from './student/cart/cart.component';
import { StudentbookComponent } from './student/studentbook/studentbook.component';
import { VerfystudentComponent } from './librarian/verfystudent/verfystudent.component';
import { ViewstudentComponent } from './librarian/viewstudent/viewstudent.component';
import { ViewbookComponent } from './librarian/viewbook/viewbook.component';
import { AddbookComponent } from './librarian/addbook/addbook.component';
import { IssuebookComponent } from './librarian/issuebook/issuebook.component';
import { StudenthomeComponent } from './student/studenthome/studenthome.component';
import { StudentregisterComponent } from './student/studentregister/studentregister.component';
import { ChangepasswordComponent } from './user/changepassword/changepassword.component';
import { StudenthistoryComponent } from './student/studenthistory/studenthistory.component';
import { TrackbookComponent } from './librarian/trackbook/trackbook.component';
import { AdmintrackbookComponent } from './admin/admintrackbook/admintrackbook.component';


const routes: Routes = [
  {path: '',component:UserhomeComponent},
  {path:'login',component:LoginComponent},
  {path:'change-password',component:ChangepasswordComponent},

  {path:'admin-home',component:AdminhomeComponent},
  {path:'admin-view-student',component:AdminstuentviewComponent},
  {path:'admin-view-librarian',component:AdminlibrarianviewComponent},
  {path:'admin-add-librarian',component:AdminlibrarianaddComponent},
  {path:'admin-view-book',component:AdminviewbookComponent},
  {path:'admin-track-book',component:AdmintrackbookComponent},



  {path:'librarian-home',component:LibrarianhomeComponent},
  {path:'librarian-verify-student',component:VerfystudentComponent},
  {path:'librarian-view-student',component:ViewstudentComponent},
  {path:'librarian-view-book',component:ViewbookComponent},
  {path:'librarian-add-book',component:AddbookComponent},
  {path:'librarian-issue-book',component:IssuebookComponent},
  {path:'librarian-track-book',component:TrackbookComponent},

  {path:'student-register',component:StudentregisterComponent},
  {path:'student-home',component:StudenthomeComponent},
  {path:'student-cart',component:CartComponent},
  {path:'student-view-book',component:StudentbookComponent},
  {path:'student-history',component:StudenthistoryComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
