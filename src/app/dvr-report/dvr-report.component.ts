import { Component, OnInit } from '@angular/core';
import { Dvr1serviceService } from '../dvr1service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Dvr1Detail } from '../dvr1-detail';

@Component({
  selector: 'app-dvr-report',
  templateUrl: './dvr-report.component.html',
  styleUrls: ['./dvr-report.component.css']
})
export class DvrReportComponent implements OnInit{

dvr:any;
form:any;
to:any;
  dvrDetails: Dvr1Detail[] = [];


  newData:any=[
   {
    totalData:[
      {
      date:"02-08-2023",
      value:[{
        cameras: "Camera 1",
        roomName: "Main server room",
        floorNo: 2,
        liveStatus: "Working",
        playBackStatus: "not Working"
      },
      {
        cameras: "Camera 2",
        roomName: "Main  room",
        floorNo: 2,
        liveStatus: "Working",
        playBackStatus: " not Working"
      },
    ]
    },

    {
      date:"03-08-2023",
      value:[{
        cameras: "Camera 1",
        roomName: "Main server room",
        floorNo: 2,
        liveStatus: "Working",
          playBackStatus: "Working"
      },
      {
        cameras: "Camera 2",
        roomName: "Main  room",
        floorNo: 2,
        liveStatus: "Working",
          playBackStatus: "Working"
      },
    ]
    },
  
  ]
  }
   
   

  ]
constructor(private dvrs:Dvr1serviceService,private router:Router,private activatedroute:ActivatedRoute){}

  ngOnInit(){
    this.getData();
  }


  getData(){
    this.dvr=this.activatedroute.snapshot.params["dvrValue"];
    this.form=this.activatedroute.snapshot.params["formDate"];
    this.to=this.activatedroute.snapshot.params["toDate"];
    if (this.dvr !== null && this.form !== null && this.to !== null){
      this.dvrs.getAllDvrDetailsService(this.dvr, this.form, this.to).subscribe(data=>{
        this.dvrDetails=data;
        console.log(data);
       
        
      })
    }
 
  }
}
