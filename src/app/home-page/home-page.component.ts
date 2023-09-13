import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr1serviceService } from '../dvr1service.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {


  formDate: any;
  toDate: any;

  dvrValue: any;
  id:any

  constructor(private route: Router, private dvrs: Dvr1serviceService,private activatedroute:ActivatedRoute) { }

  ngOnInit(): void {

  }
  hrLogin() {
    this.route.navigate(['/Dvr1Form'])
  }
  dvr2Login() {
    this.route.navigate(['/Dvr2From'])
  }
  dvr3Login() {
    this.route.navigate(['/Dvr3From'])
  }
  createEditPage() {
    this.id=this.activatedroute.snapshot.params["hrId"];
    this.route.navigate(['/CreateDvr1Details',this.id])
  }
  createDvr2EditPage() {
    this.id=this.activatedroute.snapshot.params["hrId"];
    this.route.navigate(['/CreateDvr2Details',this.id])
  }
  createDvr3EditPage() {
    this.id=this.activatedroute.snapshot.params["hrId"];
    this.route.navigate(['/CreateDvr3Details',this.id])
  }

  logOut() {
    this.route.navigate([''])
  }

  toHome() {

      this.route.navigate(['/DvrReport',this.dvrValue,this.formDate,this.toDate])

  }
 

}
