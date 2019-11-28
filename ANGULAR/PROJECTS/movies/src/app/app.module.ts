import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { from } from 'rxjs';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    AddmovieComponent,
    MoviesComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,HttpClientModule,FormsModule,ReactiveFormsModule, RouterModule.forRoot([
    {path:'movies',component:MoviesComponent},
  {path:'addmovie',component:AddmovieComponent},
{path:"login",component:LoginComponent}])
      
   // AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
