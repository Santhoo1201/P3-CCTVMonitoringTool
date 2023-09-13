import { Component, OnInit } from '@angular/core';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr } from '../dvr';

@Component({
  selector: 'app-create-dvr2-details',
  templateUrl: './create-dvr2-details.component.html',
  styleUrls: ['./create-dvr2-details.component.css']
})
export class CreateDvr2DetailsComponent implements OnInit{

  dvrDetail= new Dvr(0,"","",0)
  

  dummyId:Number | undefined
  ngOnInit(): void {
    this.dummyId=this.activatedroute.snapshot.params["id"];
  }
  constructor (private _service:Dvr1serviceService,private _router:Router ,private activatedroute:ActivatedRoute){}
  NewCreateDvr2(){
    console.log(this.dvrDetail);
    
          this._service.createNewDvr2(this.dvrDetail,this.dummyId).subscribe(data=>{
            this.dvrDetail=data;
            console.log(this.dvrDetail)
            alert("Successfully added")

          })
  }
 onSubmit() {
    console.log(this.dvrDetail);
    this.NewCreateDvr2();
  }
}
