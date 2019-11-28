import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { headercomponent } from './headerComponent/header.component';
import { HomeComponent } from './homecomponent/home.component';
import { HelpComponent } from './helpComponent/help.component';
import { AboutComponent } from './aboutComponent/about.component';
import { RouterModule } from '@angular/router';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule, ReactiveFormsModule} from "@angular/forms";
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import{HttpClientModule} from '@angular/common/http';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
     headercomponent,
     HomeComponent,
     HelpComponent,
     AboutComponent,
     PropertyBindingComponent,
     EventBindingComponent,
     FooterComponent,
     TwoWayBindingComponent,
     DirectivesComponent,
     StructuralDirectivesComponent,
     NgIfComponent,
     NgForComponent,
     NgSwitchComponent,
     CustomDirective,
     RegisterComponent,
     Form1Component,
     Form2Component,
     Form3Component,
     Form4Component,
     ReactiveFormComponent,
     ParentComponent,
     ChildComponent,
     CommentComponent,
     CommentDetailsComponent,
     DollarPipe
  ],
  imports: [
    BrowserModule,FormsModule,
    HttpClientModule,ReactiveFormsModule,RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'about',component:AboutComponent},
      {path:'help',component:HelpComponent},
      {path:"register",component:RegisterComponent},
      {path:'propertybinding',component:PropertyBindingComponent},
      {path:"eventbinding",component:EventBindingComponent},
      {path:"twowayeventbindig",component:TwoWayBindingComponent},
      {path:"login",component:NgIfComponent},
      {path:"product",component:NgForComponent},
      {path:"ngswitch",component:NgSwitchComponent},
      {path:"form1",component:Form1Component},
      {path:"form2",component:Form2Component},
      {path:"form3",component:Form3Component},
      {path:"form4",component:Form4Component},
      {path:'reactiveform',component:ReactiveFormComponent},
      {path:'parent',component:ParentComponent},
      {path:'comment-details',component:CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
