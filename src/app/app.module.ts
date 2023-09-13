import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginHrDetailsComponent } from './login-hr-details/login-hr-details.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomePageComponent } from './home-page/home-page.component';
import { Dvr1FormComponent } from './dvr1-form/dvr1-form.component';
import { CreateDvr1DetailsComponent } from './create-dvr1-details/create-dvr1-details.component';
import { DvrReportComponent } from './dvr-report/dvr-report.component';
import { Dvr1DetailsSinglereportComponent } from './dvr1-details-singlereport/dvr1-details-singlereport.component';
import { Dvr2FromComponent } from './dvr2-from/dvr2-from.component';
import { CreateDvr2DetailsComponent } from './create-dvr2-details/create-dvr2-details.component';
import { Dvr3FromComponent } from './dvr3-from/dvr3-from.component';
import { CreateDvr3DetailsComponent } from './create-dvr3-details/create-dvr3-details.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginHrDetailsComponent,
    HomePageComponent,
    Dvr1FormComponent,
    CreateDvr1DetailsComponent,
    DvrReportComponent,
    Dvr1DetailsSinglereportComponent,
    Dvr2FromComponent,
    CreateDvr2DetailsComponent,
    Dvr3FromComponent,
    CreateDvr3DetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
