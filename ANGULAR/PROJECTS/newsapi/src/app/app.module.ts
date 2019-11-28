import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchnewsComponent } from './searchnews/searchnews.component';
import { HomeComponent } from './home/home.component';
import {HttpClientModule} from '@angular/common/http';
import { from } from 'rxjs';
import { UserService } from './user.service';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchnewsComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,HttpClientModule,FormsModule, RouterModule.forRoot([
      {path:"home",component:HomeComponent},
      {path:'Countries',component:CountriesComponent},
      {path:"Categories",component:CategoriesComponent},
      {path:"Sources",component:SourcesComponent},
      {path:"SearchNews",component:SearchnewsComponent}])
      
   // AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
