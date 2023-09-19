import { Component, OnInit } from '@angular/core';
import { Dvr1Detail } from '../dvr1-detail';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr } from '../dvr';

@Component({
  selector: 'app-create-dvr1-details',
  templateUrl: './create-dvr1-details.component.html',
  styleUrls: ['./create-dvr1-details.component.css']
})
export class CreateDvr1DetailsComponent implements OnInit{

  dvrDetail= new Dvr(0,"","",0)
  dummyId:Number | undefined
  ngOnInit(): void {
    this.dummyId=this.activatedroute.snapshot.params["id"];
  }
  constructor (private _service:Dvr1serviceService,private _router:Router ,private activatedroute:ActivatedRoute){}
  NewCreateDvr1(){
    console.log(this.dvrDetail);
    
          this._service.createNewDvr1(this.dvrDetail).subscribe(data=>{
            this.dvrDetail=data;
            console.log(this.dvrDetail);
            alert("saved successfully!!")

          })
  }
 onSubmit() {
    console.log(this.dvrDetail);
    this.NewCreateDvr1();
  }

}
