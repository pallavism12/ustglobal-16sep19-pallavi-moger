import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.compent';
// import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';

import { NgforComponent } from './directive/structural-directive/ngfor/ngfor.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
// import { RegisterComponent } from './register/register.component';

import { NgifComponent } from './directive/structural-directive/ngif/ngif.component';
import { RegComponent } from './reg/reg.component';
import { AssessmentComponent } from './assessment/assessment.component';
import { Form1Component } from './assessment/form1/form1.component';
import { Form2Component } from './assessment/form2/form2.component';
import { Form3Component } from './assessment/form3/form3.component';
import { Form4Component } from './assessment/form4/form4.component';
// import { RegisterPageComponent } from './register-page/register-page.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';

import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    HelpComponent,

    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,

    DirectiveComponent,
    StructuralDirectiveComponent,

    NgforComponent,
    NgSwitchComponent,
    CustomDirective,
    RegComponent,

    TwoWayBindingComponent,

    NgifComponent,

    AssessmentComponent,

    Form1Component,

    Form2Component,

    Form3Component,

    Form4Component,

    // RegisterPageComponent,

    ReactiveFormComponent,

    ParentComponent,

    ChildComponent,

    // ComponentComponent,

    CommentComponent,

    CommentDetailsComponent,

    DollarPipe,




  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,

    // AppRoutingModule,
    RouterModule.forRoot([
      { path: 'home', component: HomeComponent },
      { path: 'about', component: AboutComponent },
      { path: 'help', component: HelpComponent },
      { path: 'property-binding', component: PropertyBindingComponent },
      { path: 'event-binding', component: EventBindingComponent },
      { path: 'two-way', component: TwoWayBindingComponent },
      { path: 'ng-if', component: NgifComponent },
      { path: 'r', component: RegComponent },

      { path: 'ng-for', component: NgforComponent },
      { path: 'ng-switch', component: NgSwitchComponent },
      { path: 'f1', component: Form1Component },
      { path: 'f2', component: Form2Component },
      { path: 'f3', component: Form3Component },
      { path: 'f4', component: Form4Component },
      {
        path: 'reactive-form', component: ReactiveFormComponent
      },

      { path: 'parent', component: ParentComponent },
      { path: 'comment-details', component: CommentDetailsComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
