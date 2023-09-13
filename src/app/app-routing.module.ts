import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginHrDetailsComponent } from './login-hr-details/login-hr-details.component';
import { HomePageComponent } from './home-page/home-page.component';
import { Dvr1FormComponent } from './dvr1-form/dvr1-form.component';
import { CreateDvr1DetailsComponent } from './create-dvr1-details/create-dvr1-details.component';
import { DvrReportComponent } from './dvr-report/dvr-report.component';
import { Dvr2FromComponent } from './dvr2-from/dvr2-from.component';
import { CreateDvr2DetailsComponent } from './create-dvr2-details/create-dvr2-details.component';
import { Dvr3FromComponent } from './dvr3-from/dvr3-from.component';
import { CreateDvr3DetailsComponent } from './create-dvr3-details/create-dvr3-details.component';

const routes: Routes = [
 
  {path:'',component: LoginHrDetailsComponent},
  {path:'LoginHrDetails',component: LoginHrDetailsComponent},
  {path:'HomePage',component: HomePageComponent},
  {path:'HomePage/:hrId',component: HomePageComponent},
  {path:'Dvr1Form',component:Dvr1FormComponent},
  {path:'Dvr1Form/:id',component:Dvr1FormComponent},
  {path:'CreateDvr1Details/:id',component:CreateDvr1DetailsComponent},
  {path:'DvrReport',component:DvrReportComponent},
  {path:'DvrReport/:dvrValue/:formDate/:toDate',component:DvrReportComponent},
  {path:'Dvr2From',component:Dvr2FromComponent},
  {path:'CreateDvr2Details/:id',component:CreateDvr2DetailsComponent},
  {path:'Dvr3From',component:Dvr3FromComponent},
  {path:'CreateDvr3Details/:id',component:CreateDvr3DetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
