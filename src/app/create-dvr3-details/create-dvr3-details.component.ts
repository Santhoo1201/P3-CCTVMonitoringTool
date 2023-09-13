import { Component, OnInit } from '@angular/core';
import { Dvr } from '../dvr';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-create-dvr3-details',
  templateUrl: './create-dvr3-details.component.html',
  styleUrls: ['./create-dvr3-details.component.css']
})
export class CreateDvr3DetailsComponent implements OnInit
 {

  
  dvrDetail= new Dvr(0,"","",0)
  

  dummyId:Number | undefined
  ngOnInit(): void {
    this.dummyId=this.activatedroute.snapshot.params["id"];
  }
  constructor (private _service:Dvr1serviceService,private _router:Router ,private activatedroute:ActivatedRoute){}
  NewCreateDvr3(){
    console.log(this.dvrDetail);
    
          this._service.createNewDvr3(this.dvrDetail,this.dummyId).subscribe(data=>{
            this.dvrDetail=data;
            console.log(this.dvrDetail)
            alert("Successfully added")

          })
  }
 onSubmit() {
    console.log(this.dvrDetail);
    this.NewCreateDvr3();
  }

}
