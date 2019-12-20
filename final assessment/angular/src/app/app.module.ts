import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UpdateComponent } from './update/update.component';
import { SearchbyidComponent } from './searchbyid/searchbyid.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';
import { SearchbycateogaryComponent } from './searchbycateogary/searchbycateogary.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddProductComponent,
    UpdateComponent,
    SearchbyidComponent,
    SearchbynameComponent,
    SearchbycateogaryComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    HttpClientModule
   
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
