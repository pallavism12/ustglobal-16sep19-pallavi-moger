import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { PallaviComponent } from './pallavi/pallavi.component';
import { RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { MnewsComponent } from './mnews/mnews.component';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    PallaviComponent,
    MoviesComponent,
    LoginComponent,
    MnewsComponent


  ],
  imports: [

    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,

    RouterModule.forRoot([
      { path: 'p', component: PallaviComponent },
      { path: 'm', component: MoviesComponent },
      { path: 'mn', component: MnewsComponent },
      { path: 'l', component: LoginComponent }

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
