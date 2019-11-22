import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { PayyayulaRajashekarComponent } from './payyayula-rajashekar/payyayula-rajashekar.component';
import { CountriesComponent } from './countries/countries.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchComponent } from './search/search.component';



@NgModule({
  declarations: [
    AppComponent,
    PayyayulaRajashekarComponent,
    CountriesComponent,
    HomeComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchComponent,



  ],
  imports: [
    BrowserModule,
    HttpClientModule,

    // AppRoutingModule
    RouterModule.forRoot([
      { path: 'h', component: HomeComponent },
      { path: 'c', component: CountriesComponent },
      { path: 'ct', component: CategoriesComponent },
      { path: 'sr', component: SourcesComponent },
      { path: 'search', component: SearchComponent }


    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
