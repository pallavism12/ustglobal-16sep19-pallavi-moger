import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { UpdateComponent } from './update/update.component';


const routes: Routes = [ { path: 'addproduct', component:AddProductComponent },
{path: 'updateproduct', component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
